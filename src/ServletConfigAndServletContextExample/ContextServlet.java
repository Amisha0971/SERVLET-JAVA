package ServletConfigAndServletContextExample;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ContextServlet")
public class ContextServlet extends HttpServlet {
	 @Override
	    public void init() throws ServletException {
	        // Setting a global attribute in the context
	        ServletContext context = getServletContext();
	        context.setAttribute("appName", "My Web Application");
	    }

	    @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        ServletContext context = getServletContext();

	        // Accessing context parameters
	        String appName = (String) context.getAttribute("appName");

	        response.setContentType("text/html");
	        response.getWriter().println("<h2>ServletContext Example</h2>");
	        response.getWriter().println("<p>Application Name: " + appName + "</p>");
	        response.getWriter().println("<p>Server Info: " + context.getServerInfo() + "</p>");
	    }
	}