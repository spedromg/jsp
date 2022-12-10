package java_jsp_web04;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/contador")
public class ServletRequisicoes extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private int contador = 0;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		contador ++; // A cada requisição a variável é incrementada
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Contador: " + contador + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
