package yuanshuju;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;

public class Demo {
	public static void main(String[] args) {
		Connection c = null;
		Statement s = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
			DatabaseMetaData dbmd = c.getMetaData();
			
			//获取数据库服务器产品名称
			System.out.println("数据库产品名称：\t" + dbmd.getDatabaseProductName());
			//获取数据库服务器产品版本号
			System.out.println("数据库产品版本：\t" + dbmd.getDatabaseProductVersion());
			//获取数据库服务器用作类别和表名之间的分隔符 如test.user
			System.out.println("驱动版本：\t" + dbmd.getCatalogSeparator());
			
			System.out.println("可用的数据库列表：");
			//获取数据库名称
			ResultSet rs = dbmd.getCatalogs();
			
			while(rs.next()) {
				System.out.println("数据库名称：\t" + rs.getString(1));
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
