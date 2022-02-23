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
			
			//��ͬ��1��execute����ִ�в�ѯ���,Ȼ��ͨ��getResultSet���ѽ����ȡ����
			String sqlSelect = "select * from hero";
			s.execute(sqlSelect);
			ResultSet rs = s.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
			}
			//executeUpdate����ִ�в�ѯ���s.executeUpdate(sqlSelect);
			
			
			
			//��ͬ��2��executeUpdate����boolean���ͣ�true��ʾִ�е��ǲ�ѯ��䣬false��ʾִ�е���insert��delete,update�ȵ�
			boolean isSelect = s.execute(sqlSelect);
			System.out.println(isSelect);
			//���true
			//executeUpdate���ص���int����ʾ�ж����������յ���Ӱ��
			String sqlUpdate = "update hero set hp = 300 where id < 100";
			int number = s.executeUpdate(sqlUpdate);
			System.out.println(number);
			//���0
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
