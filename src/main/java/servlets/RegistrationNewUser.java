package servlets;

import entity.DatabaseExecutor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegistrationNewUser extends HttpServlet {

    public static void main(String[] args) {
        String s1 = "hello".intern();
        String s2 = "hello";


    }
//
//    private void sort(int[] arr) {
//        for (int i = arr.length - 1; i > 0; i++){
//            for(int j =0; j<i ;j++)
//            {
//                if()
//            }
//        }
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        try {
            ResultSet resultSet = DatabaseExecutor.executeQuery("select count(*) from users where login = '" + username + "'");
            resultSet.next();
            int userCountWithSameLogin = resultSet.getInt(1);
            if (userCountWithSameLogin > 0) {
                PrintWriter out = resp.getWriter();
                resp.setContentType("text/html");
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Login " + username + " already used');");
                out.println("</script>");

            } else {

            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
