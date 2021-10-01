
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
 * This servlet will load the apps from the db, display the default apps on startup
 * allow for addition and deletion of apps from the dashboard
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
     * @param req  the HttpServletRequest object
     * @param resp the HttpServletResponse object
     * @throws ServletException if there is a Servlet failure
     * @throws IOException      if there is an IO failure
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        logger.info("Logging from dashboard control servlet");

        //instantiate a DAO
        //store a list of default apps in session variable for 1st display in form table


        String url = "/index.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(req, resp);

    }


    /**
     * Handles HTTP POST requests.
     *
     * @param req  the HttpServletRequest object
     * @param resp the HttpServletResponse object
     * @throws ServletException if there is a Servlet failure
     * @throws IOException      if there is an IO failure
     **/
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //respond to add and delete dropdown  buttons/forms(multiple selections), regenerating the list of displayed apps in the table, persist through session


        String url = "/index.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(req, resp);

    }
}