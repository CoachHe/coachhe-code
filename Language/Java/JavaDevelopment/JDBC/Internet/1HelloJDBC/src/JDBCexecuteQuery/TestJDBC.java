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
				
				//��������rs��ֵ�ʹ����ѯ�ɹ�����������ѯʧ��
				while(rs.next()) {
					int id = rs.getInt("id");  //����ʹ���ֶ���
					String name = rs.getString(2); //Ҳ����ʹ���ֶε�˳��
					float hp = rs.getFloat("hp");
					int damage = rs.getInt(4);
					System.out.printf("%d\t%s\t%f\t%d%n",id,name,hp,damage);
				}
				//��һ��Ҫ������ر�ResultSet
				//��ΪStatement�رյ�ʱ�򣬻��Զ��ر�ResultSet
				//rs.close();
				
				
				
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
