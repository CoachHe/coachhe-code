package Hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDtest {
	//��ҵ�����һ��execute����
	//�������ܵĲ�����SQL��䣬���������ӣ�ɾ���������޸ģ����������������ÿ�δ���ͬ��SQL�����Ϊ���� 
	
	public static void main(String[] args) {
		execute("update hero set name = '5' where id = 50");
	}
	
	public static void execute(String sq2) {
		Connection c = null;
		Statement s = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
					"root", "admin");
			System.out.println("���ӳɹ�");
			s = c.createStatement();
			s.execute(sq2);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// ���ݿ������ʱ������Դ����ز������������ɹر����ݿ�ĺ�ϰ��
            // �ȹر�Statement
			if (s != null) {
				try {
					s.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//��ر�Connection
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
