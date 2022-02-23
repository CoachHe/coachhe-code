package difference;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		
		Connection c = null;
		Statement s = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
			s = c.createStatement();
			
			//不同点1：execute可以执行查询语句,然后通过getResultSet，把结果集取出来
			String sqlSelect = "select * from hero";
			s.execute(sqlSelect);
			ResultSet rs = s.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
			}
			//executeUpdate不能执行查询语句s.executeUpdate(sqlSelect);
			
			
			
			//不同点2：executeUpdate返回boolean类型，true表示执行的是查询语句，false表示执行的是insert，delete,update等等
			boolean isSelect = s.execute(sqlSelect);
			System.out.println(isSelect);
			//输出true
			//executeUpdate返回的是int，表示有多少条数据收到了影响
			String sqlUpdate = "update hero set hp = 300 where id < 100";
			int number = s.executeUpdate(sqlUpdate);
			System.out.println(number);
			//输出0
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
