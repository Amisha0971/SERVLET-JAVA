package SendRedirectExample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SendRedirectServlet")
public class SendRedirectServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String destination = request.getParameter("destination");

	        if ("external".equals(destination)) {
	            // Redirect to an external website
	            response.sendRedirect("https://www.google.com");
	        } else {
	            // Redirect to another servlet or internal servlet
	            response.sendRedirect("AnotherServlet");
	        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doGet(request, response);
	}

}
