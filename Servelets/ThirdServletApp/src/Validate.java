

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		PrintWriter out=response.getWriter();
		String username=request.getParameter("uname");
		String password=request.getParameter("pass");
		{
		if(username.equals("ven")&& password.equals("123"))
		{
		RequestDispatcher rd= request.getRequestDispatcher("home.html");
		rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd= request.getRequestDispatcher("index.html");
		rd.include(request, response);
		out.println("PLEASE ENTER VALID CREDENTIALS");
		}
	}
	}
}
