package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import charactor.hero;

public class Demo {
	
	public static hero get(int id) {
		hero h = null;
		Connection c = null;
		Statement s = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
			s = c.createStatement();
			
			String sql = "select * from hero where id = " + id;
			
			ResultSet rs = s.executeQuery(sql);
			
			//因为id是唯一的，ResultSet最多有一条记录，所以使用if代替while
			if(rs.next()) {
				h = new hero();
				String name = rs.getString(2);
				float hp = rs.getFloat("hp");
				int damage = rs.getInt(4);
				h.name = name;
				h.hp = hp;
				h.damage = damage;
				h.id = id;
			}		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return h;
	}
	
	
	public static void main(String[] args) {
		hero h = get(22);
		System.out.println(h.name);
	}

}
