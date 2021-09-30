
package controller;


        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;

        import javax.servlet.RequestDispatcher;
        import javax.servlet.ServletException;
        import javax.servlet.ServletOutputStream;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import javax.servlet.http.HttpSession;
        import java.io.IOException;
        import java.util.List;

/**
 * This servlet will...TODO
 */

@WebServlet(
        name = "DashboardControl",
        urlPatterns = {"/dashboardControl"}
)

public class DashboardControl  extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());


    /**
     * Handles HTTP GET requests.
     *
     * @param req the HttpServletRequest object
     * @param resp the HttpServletResponse object
     * @throws ServletException if there is a Servlet failure
     * @throws IOException      if there is an IO failure
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
        out.write("hello heroku".getBytes());
        logger.info("Logging from dashboard control servlet");
        out.flush();
        out.close();
    }

}