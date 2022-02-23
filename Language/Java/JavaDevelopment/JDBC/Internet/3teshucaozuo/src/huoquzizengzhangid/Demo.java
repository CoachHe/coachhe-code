package huoquzizengzhangid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class Demo {

	public static void main(String[] args) {
		
		Connection c = null;
		String sql = "insert into hero values(null,?,?,?)";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
			PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			//在这里生成了可以自增长id的序列
			ps.setString(1, "盖伦");
			ps.setFloat(2, 616);
			ps.setInt(3, 100);
			
			ps.execute();
			
			//在执行完插入语句后，MySQL会为新插入的数据分配一个自增长id，JDBC通过getGeneratedKeys获取该id
			ResultSet rs = ps.getGeneratedKeys();
			if(rs.next()) {
				int id = rs.getInt(1);
				System.out.println(id);
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
