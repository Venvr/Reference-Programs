import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

 


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

 

@SuppressWarnings("serial")
public class Login extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	PrintWriter out= response.getWriter();
        String user=request.getParameter("uname");
        String pwd=request.getParameter("pass");
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521:orcl","trg409" ,"training409" );
        PreparedStatement stmt= conn.prepareStatement("select * from gmail where username=? and password=?");
        stmt.setString(1, user);
        stmt.setString(2, pwd);
        ResultSet result=stmt.executeQuery();
        if(result.next())
        {
            RequestDispatcher rd= request.getRequestDispatcher("home.html");
            rd.forward(request,response);
            out.println("Welcome to home page "+result.getString(3));
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
 
