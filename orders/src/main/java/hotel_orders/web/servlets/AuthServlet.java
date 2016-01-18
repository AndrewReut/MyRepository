package hotel_orders.web.servlets;

import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Created by Andrew on 17.01.2016.
 */
public class AuthServlet extends HttpServlet {

    private ServletConfig config;

    public void init(ServletConfig config)
            throws ServletException{
        this.config=config;
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{

                String userName=rs.getString("user");
                String passwrd=rs.getString("password");

        if(userName.equals(request.getParameter("user")) &&
                passwrd.equals(request.getParameter("pass"))){
            out.println("User Authenticated");
        }
        else{
            out.println("You are not an authentic person");
        }
    }

}
