package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySolution {
	public static void main(String[] args) {
		Connection c = null;
		PreparedStatement ps = null;
		Statement s = null;
		int id = 0;
		int d = 0;
		
		String sql = "insert into hero values(null,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
			s = c.createStatement();
			ps = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, "∞≤∆‰¿≠");
			ps.setFloat(2, 616);
			ps.setInt(3, 100);
			
			ps.execute();
			
			ResultSet rs = ps.getGeneratedKeys();
			if(rs.next()) {
				id = rs.getInt(1);
				System.out.println(id);
			}

			while(d != 1) {
				d = s.executeUpdate("delete from hero where id = " + (id-1));
				id --;
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(s != null) {
				try {
					s.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(c != null) {
				try {
					c.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
	}
}
