package java_jsp_web04;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
		name = "login", 
		urlPatterns = { "/login" }, 
		initParams = { 
				@WebInitParam(name = "user", value = "spedromg"),
				@WebInitParam(name = "password", value = "123456") 
		}
)
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet Login Carregada via doGet ...");
		resp.setContentType("text/html");
		PrintWriter out = null;
		
		ServletConfig config = getServletConfig();
		String user = config.getInitParameter("user");
		String password = config.getInitParameter("password");
		
		try {
			out = resp.getWriter();
			
			resp.setContentType("text/html");
			out.print("<html><body>");
			out.print("<h1>Login de Usuário</h1>");
			out.print("<h3>Usuário:</h3> " + user);
			out.print("<h3>Senha:</h3> " + password);
			out.print("</body></html>");

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
