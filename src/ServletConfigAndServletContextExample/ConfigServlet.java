package ServletConfigAndServletContextExample;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// No need for @WebServlet if configured in web.xml
public class ConfigServlet extends HttpServlet {
    private String dbUser;
    private String dbPassword;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        // Accessing servlet-specific configuration parameters
        dbUser = config.getInitParameter("dbUser");
        dbPassword = config.getInitParameter("dbPassword");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h2>ServletConfig Example</h2>");
        response.getWriter().println("<p>Database User: " + dbUser + "</p>");
        response.getWriter().println("<p>Database Password: " + dbPassword + "</p>");
    }
}
