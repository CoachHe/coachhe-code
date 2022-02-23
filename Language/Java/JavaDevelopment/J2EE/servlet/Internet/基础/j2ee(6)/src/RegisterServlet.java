import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		
		System.out.println("获取单值参数name：" + request.getParameter("name"));
		
		String[] hobits = request.getParameterValues("hobits");
		System.out.println("获取具有多值的参数hobits:" + Arrays.asList(hobits));
		
		System.out.println("通过getParameter遍历所有参数： ");
		Map<String, String[]> parameters = request.getParameterMap();
		
		Set<String> paraNames = parameters.keySet();
		for(String param: paraNames) {
			String[] value = parameters.get(param);
			System.out.println(param + ":" + Arrays.asList(value));
		}
		
		
	}
	
	
}
