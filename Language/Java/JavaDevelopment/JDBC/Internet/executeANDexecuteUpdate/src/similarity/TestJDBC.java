package similarity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {

	public static void main(String[] args) {
		
		Connection c = null;
		Statement s = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
			s = c.createStatement();
			String sqlInsert = "insert into hero values (null, '¸ÇÂ×', 616, 100)";
			String sqlDelete = "delete from hero where id = 100";
			String sqlUpdate = "update hero set hp = 300 where id = 100";
			s.execute(sqlInsert);
			s.execute(sqlDelete);
			s.execute(sqlUpdate);
			s.executeUpdate(sqlInsert);
			s.executeUpdate(sqlDelete);
			s.executeUpdate(sqlUpdate);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (s != null) {
				try {
					s.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (c != null) {
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
