package JDBCybyStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class usePrepareStatement {

	public static void main(String[] args) {
		
		Connection c = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String sql = "insert into hero value(null,?,?,?)";
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
			
			//根据sql语句创建PreparedStatement
			PreparedStatement ps = c.prepareStatement(sql);
			
			//设置参数
			ps.setString(1,"提莫");
			ps.setFloat(2, 313.0f);
			ps.setInt(3,50);
			
			//执行
			ps.execute();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
