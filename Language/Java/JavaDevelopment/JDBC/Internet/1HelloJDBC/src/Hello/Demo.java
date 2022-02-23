package Hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {
		//��ʼ������
		Connection c = null;
		Statement s = null;
		try {
            //��ʼ��������com.mysql.jdbc.Driver
            //���� mysql-connector-java-5.0.8-bin.jar��
            //��������˵�һ������ĵ������ͻ��׳�ClassNotFoundException
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName�ǰ��������ص�JVM�У�
			//���ص�ʱ�򣬾ͻ�ִ�����еľ�̬��ʼ�飬��������ĳ�ʼ������ع���
			
			
			
			// ���������ݿ��Connection����
            // ������Ҫ�ṩ��
				// ���ݿ������ڵ�ip:127.0.0.1 (����)
            	// ���ݿ�Ķ˿ںţ� 3306 ��mysqlר�ö˿ںţ�
            	// ���ݿ����� how2java
            	// ���뷽ʽ UTF-8
            	// �˺� root
            	// ���� admin
			c = DriverManager
					.getConnection(
							"jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
							"root", "admin");
			
			// ����Statement
			// Statement������ִ��SQL���ģ��������ӣ�ɾ��
			// ע�⣺ʹ�õ��� java.sql.Statement����Ҫ��С��ʹ�õ��� com.mysql.jdbc.Statement;
			s = c.createStatement();
			
			// ׼��sql���
			// ע�⣺�ַ���Ҫ�õ�����'
			String sql = "insert into hero value(null, "+ 
					" 'Ӣ��2' " + "," + 313.0f + "," + 
					50 + ")";
			s.execute(sql);

			System.out.println("���ݿ��������سɹ� ��");
			System.out.println("���ӳɹ�����ȡ���Ӷ��� " + c);
			System.out.println("��ȡStatement���� " + s);
			System.out.println("ִ�в������ɹ� ");  //�õ���execute���
			
			
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
		//ע�⣺�������finally���ֹر����ӵķ�ʽ���鷳�����Բο�
		//�ر����ķ�ʽ��ʹ��try-with-resource�ķ�ʽ�Զ��ر�����
		//��ΪConnection��Statement��ʵ����AutoCloseable�ӿ�
		
	}
}
