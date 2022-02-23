package MySolution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class mufang {

	public static void main(String[] args) {
		Connection c = null;
		Statement s = null;
		Statement s_delete = null;
		String sql1 = "select id from hero order by id asc limit 0,10 ";
		//String sql2 = "delete id from hero order by id asc limit 0,10 ";
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
	                "root", "admin");
			s = c.createStatement();
			s_delete = c.createStatement();
			
			Scanner sc = new Scanner(System.in);
			
			c.setAutoCommit(false);
			
			ResultSet rs = s.executeQuery(sql1);
			while(rs.next()) {
				System.out.println("试图删除的数据为" + rs.getInt(1));
				s_delete.execute("delete from hero where id = " + rs.getInt(1));
			}
			
			//s.execute(sql2);
			
			while(true) {
				System.out.println("是否确定删除 Y/N");
				
				String ack = sc.next();
				if("Y".equals(ack)) {
					c.commit();
					break;
				} else if ("N".equals(ack)) {
					System.out.println("放弃删除");
					break;
				}
			}
			
			
			
			
			
			
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
