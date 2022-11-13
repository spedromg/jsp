package servlet;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletCadastrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Classe ServletCadastrar auto-inicializada ...");
		
		ServletConfig config = getServletConfig();
		String user = config.getInitParameter("user");
		System.out.println(user);
	}
	
	@Override
	public void destroy() {
		super.destroy();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
		System.out.println("Classe ServletCadastrar carregada via doGet.");
		
		ServletConfig config = getServletConfig();
		String user = config.getInitParameter("user");
		System.out.println(user);
		
	}

}
