
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

 


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

 

@SuppressWarnings("serial")
public class Loginservlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	   PrintWriter out= response.getWriter();
           String user=request.getParameter("uname");
           String pwd=request.getParameter("pass");
           try{
        	   
        	   ServletConfig config=getServletConfig();
        	 String name1=  config.getInitParameter("name");
        	 System.out.println(name1);
        	ServletContext context=   getServletContext();
        	String driver=context.getInitParameter("driverclass");
        	String url1=context.getInitParameter("url");
        	String user1=context.getInitParameter("username");
        	String pass1=context.getInitParameter("password");
           Class.forName(driver);
           Connection conn= DriverManager.getConnection(url1,user1,pass1);
           PreparedStatement stmt= conn.prepareStatement("select * from gmail where username=? and password=?");
           stmt.setString(1, user);
           stmt.setString(2, pwd);
           ResultSet result=stmt.executeQuery();
           if(result.next())
           {
               RequestDispatcher rd= request.getRequestDispatcher("home.html");
               rd.forward(request,response);
               out.println("Welcome to home page "+result.getString("name"));
           }
           else
           {
               RequestDispatcher rd= request.getRequestDispatcher("login.html");
               rd.include(request,response);
               out.println("PLEASE ENTER VALID CREDENTIALS");
               conn.close();}
           }catch(Exception e)
           {
               System.out.println(e);
           }
       }

    


   }
    