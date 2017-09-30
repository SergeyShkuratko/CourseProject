package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the response message's MIME type.
        response.setContentType("text/html;charset=UTF-8");
        // Allocate a output writer to write the response message into the network socket.
        PrintWriter out = response.getWriter();

        // Use a ResourceBundle for localized string in "LocalStrings_xx.properties" for i18n.
        // The request.getLocale() sets the locale based on the "Accept-Language" request header.
//        ResourceBundle rb = ResourceBundle.getBundle("LocalStrings", request.getLocale());
        // To test other locales.
        //ResourceBundle rb = ResourceBundle.getBundle("LocalStrings", new Locale("fr"));

        // Write the response message, in an HTML document.

        String userName = request.getParameter("username");
        String userPassword = request.getParameter("password");

        if (/*isValid(userName, userPassword)*/ true) {
//            request.setAttribute("message", "Hello world");
            String url = "/main";
            HttpSession session = request.getSession(false);
            session.setAttribute("login", userName);
            response.sendRedirect(url);
//            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
//            dispatcher.forward(request, response);
        } else {
            String url = "/badLogin";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        }


//        try {
//            out.println("<!DOCTYPE html>");  // HTML 5
//            out.println("<html><head>");
//            out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
//
//
//            out.println("<body>");
//            out.println("<h1>BUY231 " + userName + "</h1>");  // Prints "Hello, world!"
//            // Set a hyperlink image to refresh this page
//            out.println("<a href='" + request.getRequestURI() + "'><img src='images/return.gif'></a>");
//            out.println("</body></html>");
//        } finally {
//            out.close();  // Always close the output writer
//        }
    }

    private boolean isValid(String userName, String userPassword) {
        return false;
    }
}
