import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

 


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 


/**
 * Servlet implementation class RegisterServlet
 */
public class Register extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname=request.getParameter("uname");
        String upwd=request.getParameter("upwd");
        String name=request.getParameter("name");
        PrintWriter pw=response.getWriter();
        try {
        	ServletContext context=   getServletContext();
        	String driver=context.getInitParameter("driverclass");
        	String url1=context.getInitParameter("url");
        	String user1=context.getInitParameter("username");
        	String pass1=context.getInitParameter("password");
           Class.forName(driver);
           Connection conn= DriverManager.getConnection(url1,user1,pass1);
    
        
        PreparedStatement stmt=conn.prepareStatement("insert into gmail values(?,?,?)");
        stmt.setString(1, uname);
        stmt.setString(2, upwd);
        stmt.setString(3, name);
        int result=stmt.executeUpdate();
            if(result>0)
            {
                RequestDispatcher rd=request.getRequestDispatcher("login.html");
                rd.forward(request, response);
                pw.println("Register Successfull");
                
            }
            
            conn.close();
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
        
    }

 


    
}
    