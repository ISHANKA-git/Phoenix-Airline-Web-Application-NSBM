
package rlservelt;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


public class rlservelt extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String Username=request.getParameter("uname");
        String password=request.getParameter("pass");
        String repeatPassword=request.getParameter("rpass");
        String email=request.getParameter("mail");
        
         
       Connection con=null;
       Statement st=null;
       ResultSet rs=null;
       
       
       
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketbooking","root","");
           st=con.createStatement();
           String sql="INSERT INTO `register` (`username`, `password`, `repassword`,`email`) VALUES ( '"+Username+"', '"+password+"', '"+repeatPassword+"','"+email+"')";
           st.executeUpdate(sql);
           
          
           
       }
       catch(Exception ex)
       {
           
           out.print(ex.getMessage());
           
           
       }
          
        response.sendRedirect("login.jsp");
        
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name=request.getParameter("uname");
        String pass=request.getParameter("pass");
        
        
       Connection con=null;
       Statement st=null;
       ResultSet rs=null;
        
              
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketbooking","root","");
           st=con.createStatement();
           String sql="INSERT INTO `login` (`username`, `password`) VALUES ( '"+name+"', '"+pass+"')";
           st.executeUpdate(sql);
           
          
           
       }
       catch(Exception ex)
       {
           
           out.print(ex.getMessage());
           
           
       }
          
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
