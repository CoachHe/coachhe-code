package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import charactor.hero;

public class Demo {
	
	public static void main(String[] args) {
		hero h = new hero();
		h.name = "亚瑟";
		h.hp = 100;
		h.damage = 200;
		h.id = 2;
		add(h);
	}
		
	public static void add(hero h) {
		Connection c = null;
		Statement s = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
			s = c.createStatement();
			
			String sql = "insert into hero values (null, '" + h.name + "', " + h.hp + ", " + h.damage + ")";
			s.execute(sql);
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
