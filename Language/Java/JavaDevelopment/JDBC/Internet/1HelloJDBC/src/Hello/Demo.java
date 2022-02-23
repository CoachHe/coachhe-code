package Hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {
		//初始化驱动
		Connection c = null;
		Statement s = null;
		try {
            //初始化驱动类com.mysql.jdbc.Driver
            //就在 mysql-connector-java-5.0.8-bin.jar中
            //如果忘记了第一个步骤的导包，就会抛出ClassNotFoundException
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName是把这个类加载到JVM中，
			//加载的时候，就会执行其中的静态初始块，完成驱动的初始化的相关工作
			
			
			
			// 建立与数据库的Connection连接
            // 这里需要提供：
				// 数据库所处于的ip:127.0.0.1 (本机)
            	// 数据库的端口号： 3306 （mysql专用端口号）
            	// 数据库名称 how2java
            	// 编码方式 UTF-8
            	// 账号 root
            	// 密码 admin
			c = DriverManager
					.getConnection(
							"jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
							"root", "admin");
			
			// 创建Statement
			// Statement是用于执行SQL语句的，比如增加，删除
			// 注意：使用的是 java.sql.Statement，不要不小心使用到： com.mysql.jdbc.Statement;
			s = c.createStatement();
			
			// 准备sql语句
			// 注意：字符串要用单引号'
			String sql = "insert into hero value(null, "+ 
					" '英雄2' " + "," + 313.0f + "," + 
					50 + ")";
			s.execute(sql);

			System.out.println("数据库驱动加载成功 ！");
			System.out.println("连接成功，获取连接对象： " + c);
			System.out.println("获取Statement对象： " + s);
			System.out.println("执行插入语句成功 ");  //用的是execute语句
			
			
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
		//注意：如果觉得finally这种关闭连接的方式很麻烦，可以参考
		//关闭流的方式，使用try-with-resource的方式自动关闭连接
		//因为Connection和Statement都实现了AutoCloseable接口
		
	}
}
