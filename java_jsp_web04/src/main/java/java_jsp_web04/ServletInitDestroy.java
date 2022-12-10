package java_jsp_web04;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/initdestroy")
public class ServletInitDestroy extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("iniciando a servlet initdestroy ....");
	}
	
	@Override
	public void destroy() {
		super.destroy();
		System.err.println("destruindo a servlet initdestroy ....");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		PrintWriter out = arg1.getWriter();
		arg1.setContentType("text/html");		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Servlet Init and Destroy</h1>");
		out.println("</body>");
		out.println("</html>");
	}
	

}
