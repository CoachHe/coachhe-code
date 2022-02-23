//���һ�����������з�ҳ��ѯ
//public static void list(int start, int count)
//start ��ʾ��ʼҳ����count��ʾһҳ��ʾ������
//list(0,5) ��ʾ��һҳ��һ����ʾ5������
//list(10,5) ��ʾ����ҳ��һ����ʾ5������

package JDBCexecuteQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list(1,5);
	}
	
	public static void list(int start, int count) {
		Connection c = null;
		Statement s = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
					"root", "admin");
			s = c.createStatement();
			String sql = null;
			
			sql = "select * from hero limit " + start * count + "," + start * count + count;
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");  //����ʹ���ֶ���
				String name = rs.getString(2); //Ҳ����ʹ���ֶε�˳��
				float hp = rs.getFloat("hp");
				int damage = rs.getInt(4);
				System.out.printf("%d\t%s\t%f\t%d%n",id,name,hp,damage);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
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