package ServletRequestInterfaceExample;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    String username = request.getParameter("username");
	        String password = request.getParameter("password");

	        if ("admin".equals(username) && "password123".equals(password)) {
	            request.setAttribute("username", username);
	            RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
	            rd.forward(request, response);
	        } else {
	            response.getWriter().println("<h2>Invalid Credentials</h2>");
	        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
