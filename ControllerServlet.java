import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ControllerServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.endsWith("/")) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else if (uri.endsWith("/register")) {
            request.getRequestDispatcher("register.jsp").forward(request, response);
        } else if (uri.endsWith("/login")) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else if (uri.endsWith("/home")) {
            request.getRequestDispatcher("home.jsp").forward(request, response);
        } else if (uri.endsWith("/about")) {
            request.getRequestDispatcher("about.jsp").forward(request, response);
        }
    }
}
