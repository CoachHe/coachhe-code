package JDBCybyStatement;

public class adPS1 {

	public static void main(String[] args) {
		//Statement需要进行字符串拼接，可读性和维护性比较差
		String sql = "insert into here values(null, "+"'提莫'"+","+313.0f+","+50+")";
		
		//PreparedStatement使用参数设置，可读性好，不易犯错
		String sql2 = "insert into hero values(null,?,?,?)";
		System.out.println(sql + " ; " + sql2);
	}

}
