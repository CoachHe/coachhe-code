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
			
			//��ȡ���ݿ��������Ʒ����
			System.out.println("���ݿ��Ʒ���ƣ�\t" + dbmd.getDatabaseProductName());
			//��ȡ���ݿ��������Ʒ�汾��
			System.out.println("���ݿ��Ʒ�汾��\t" + dbmd.getDatabaseProductVersion());
			//��ȡ���ݿ�������������ͱ���֮��ķָ��� ��test.user
			System.out.println("�����汾��\t" + dbmd.getCatalogSeparator());
			
			System.out.println("���õ����ݿ��б�");
			//��ȡ���ݿ�����
			ResultSet rs = dbmd.getCatalogs();
			
			while(rs.next()) {
				System.out.println("���ݿ����ƣ�\t" + rs.getString(1));
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
