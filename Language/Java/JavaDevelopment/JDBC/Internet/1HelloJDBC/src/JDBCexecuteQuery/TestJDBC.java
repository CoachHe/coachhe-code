package JDBCexecuteQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {

	public static void main(String[] args) {
			Connection c = null;
			Statement s = null;
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				c = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
					"root", "admin");
				s = c.createStatement();
				
				String sql = "select * from hero";
				ResultSet rs = s.executeQuery(sql);
				
				//在这里，如果rs有值就代表查询成功，否则代表查询失败
				while(rs.next()) {
					int id = rs.getInt("id");  //可以使用字段名
					String name = rs.getString(2); //也可以使用字段的顺序
					float hp = rs.getFloat("hp");
					int damage = rs.getInt(4);
					System.out.printf("%d\t%s\t%f\t%d%n",id,name,hp,damage);
				}
				//不一定要在这里关闭ResultSet
				//因为Statement关闭的时候，会自动关闭ResultSet
				//rs.close();
				
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				// 数据库的连接时有限资源，相关操作结束后，养成关闭数据库的好习惯
	            // 先关闭Statement
				if (s != null) {
					try {
						s.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				//后关闭Connection
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
