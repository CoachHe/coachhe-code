package JDBCybyStatement;

public class adPS1 {

	public static void main(String[] args) {
		//Statement��Ҫ�����ַ���ƴ�ӣ��ɶ��Ժ�ά���ԱȽϲ�
		String sql = "insert into here values(null, "+"'��Ī'"+","+313.0f+","+50+")";
		
		//PreparedStatementʹ�ò������ã��ɶ��Ժã����׷���
		String sql2 = "insert into hero values(null,?,?,?)";
		System.out.println(sql + " ; " + sql2);
	}

}
