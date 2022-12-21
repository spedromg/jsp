package java_jsp_web04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/compactar")
public class ServletZip extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/zip");
		
		OutputStream out = null;
		FileInputStream in = null;

		try {
			out = resp.getOutputStream();
			resp.addHeader("Content-Disposition", "attachement, filename=java.zip");
			in = new FileInputStream("D:/files/java.zip");

			byte[] buffer = new byte[1024];
			int numBytes;
			while ((numBytes = in.read(buffer, 0, buffer.length)) > -1) {
				out.write(buffer, 0, numBytes);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (in != null) {
				in.close();
			}

			if (out != null) {
				out.close();
			}
		}
	}
}
