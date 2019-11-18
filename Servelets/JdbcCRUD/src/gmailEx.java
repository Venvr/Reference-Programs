import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

 


public class gmailEx {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Username :");
        String uname=sc.next();
        System.out.println("Enter the Password :");
        String pwd=sc.next();
        // loading the driver class
        Class.forName("oracle.jdbc.driver.OracleDriver");



        //step 2: create the connection
        Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521:orcl","trg409","training409");
        
        //step 3: create the statement
        PreparedStatement stmt=conn.prepareStatement("select * from gmail where username=? and password=?");
        stmt.setString(1, uname);
        stmt.setString(2, pwd);
        ResultSet result=stmt.executeQuery();
        if(result.next())
        {
        	System.out.println("Login Successful");
        }
        else
        {
        	System.out.println("Please enter valid Credentials");
        }
            //step 5:close the connection
            conn.close();
            
            
            
            
        }



     



    }  