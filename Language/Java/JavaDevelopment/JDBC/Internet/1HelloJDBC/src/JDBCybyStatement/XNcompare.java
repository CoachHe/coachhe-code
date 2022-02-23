package JDBCybyStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class XNcompare {

	public static void main(String[] args) {
		
		Connection c = null;
		Statement s = null;
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
			
			//执行Statement代码
			s = c.createStatement();
			String sql1 = "insert into hero value(null, '英雄s', 313, 50)";
			long startTime_s = System.currentTimeMillis();
			for(int i = 0; i < 1000; i ++) {
				s.execute(sql1);
			}
			long endTime_s = System.currentTimeMillis();
			
			
			//执行PreparedStatement代码
			String sql2 = "insert into hero value(null,?,?,?)";
			PreparedStatement ps = c.prepareStatement(sql2);
			ps.setString(1, "英雄ps");
			ps.setInt(2, 500);
			ps.setInt(3, 600);
			long startTime_ps = System.currentTimeMillis();
			for(int i = 0; i < 1000; i ++) {
				ps.execute();
			}
			long endTime_ps = System.currentTimeMillis();
			
			//输出
			System.out.println("Statement执行1000次的时间：" + (endTime_s - startTime_s) + "ms;");
			System.out.println("PreparedStatement执行1000次的时间：" + (endTime_ps - startTime_ps) + "ms;");
			
			
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
