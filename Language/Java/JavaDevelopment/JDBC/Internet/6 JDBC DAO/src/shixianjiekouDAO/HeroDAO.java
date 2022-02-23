package shixianjiekouDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Mine.DAO;
import charactor.Hero;

public class HeroDAO implements DAO{
	
	// 设计了一个类HeroDAO，实现接口DAO，将驱动的初始化放在了构造方法HeroDAO里。
	public HeroDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// 因为驱动初始化只需要执行一次，所以放在这里更合适，其他方法里也不需要写了，代码更整洁。
	
	// 建立方法getConnection()，每次也不需要重新进行建立连接了。
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8", "root",
                "admin");
	}
	
	public int getTotal() {
		int total = 0;
		try {
			Connection c = getConnection();
			Statement s = c.createStatement();
			String sql = "select count(*) from hero";
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()) {
				total = rs.getInt(1);
			}
			System.out.println("total = " + total);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return total;
	}
	
	
	@Override
	public void add(Hero hero) {
		// TODO Auto-generated method stub
		String sql = "insert into hero values(null,?,?,?)";
		try {
			Connection c = getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setString(1, hero.name);
			ps.setFloat(2, hero.hp);
			ps.setInt(3, hero.damage);
			ps.execute();
			ResultSet rs = ps.getGeneratedKeys();
			if(rs.next()) {
				int id = rs.getInt(1);
				hero.id = id;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(Hero hero) {
		// TODO Auto-generated method stub
		String sql = "update hero set name = ?, hp = ?, damage = ? where id = ?";
		try {
			Connection c = getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setString(1, hero.name);
	        ps.setFloat(2, hero.hp);
	        ps.setInt(3, hero.damage);
	        ps.setInt(4, hero.id);
	        ps.execute();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		try {
			Connection c = getConnection();
			Statement s = c.createStatement();
			String sql = "delete from hero where id = " + id;
			s.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Hero get(int id) {
		// TODO Auto-generated method stub
		Connection c;
		Hero h = null;
		try {
			c = getConnection();
			Statement s = c.createStatement();
			String sql = "select * from hero where id = " + id;
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()) {
				System.out.println("名字为：" + rs.getString(1) + ", hp为：" + rs.getInt(2) +", 伤害为：" + rs.getInt(3));
				h = new Hero();
				h.name = rs.getString(1);
				h.hp = rs.getInt(2);
				h.damage = rs.getInt(3);
				h.id = id;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return h;
	}
	
	
	
	public List<Hero> list(){
		return list(0,Short.MAX_VALUE);
	}
	@Override
	public List<Hero> list(int start, int count) {
		// TODO Auto-generated method stub
		List<Hero> heros = new ArrayList<Hero>();
		try {
			Connection c = getConnection();
			String sql = "select * from hero order by id desc limit ?,?";			
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, count);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Hero hero = new Hero();
				int id = rs.getInt(1);
				String name = rs.getString(2);
				float hp = rs.getFloat("hp");
				int damage = rs.getInt(4);
				hero.id = id;
				hero.name = name;
				hero.hp = hp;
				hero.damage = damage;
				heros.add(hero);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return heros;
	}
}
