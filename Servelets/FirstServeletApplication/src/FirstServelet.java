import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServelet implements Servlet {

	@Override
	public void destroy() //life cycle method
	{
		// TODO Auto-generated method stub
		System.out.println("Application removed from Server");
	}

	@Override
	public ServletConfig getServletConfig() // to get info from xml file //Non-life cycle method
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() //Non-life cycle method
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException  //life cycle method
	{
		// TODO Auto-generated method stub
		System.out.println("Application placed in Server");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException    //life cycle method
	{
		// TODO Auto-generated method stub
		System.out.println("Business Logic");
	}
	
}
