package RequestDispatcherExample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		      // Receiving shared data
	        String username = (String) request.getAttribute("user");

	        response.setContentType("text/html");
	        response.getWriter().println("<h1>Hello, " + username + "!</h1>");
	    }

	

}
