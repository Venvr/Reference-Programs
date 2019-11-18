import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// loading the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// create the connection
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521:orcl", "trg409",
				"training409");

		// create the statement
		Statement stmt = conn.createStatement();

		// execute the query

		// ddl execute()-->boolean
		// boolean val=stmt.execute("create table empl12(eid number(10),ename
		// varchar2(20))");
		// System.out.println("table created:"+val);

		// dml executeUpdate()-->int
		// int result =stmt.executeUpdate("insert into empl12 values('106','Avi')");
		// System.out.println("Data inserted " +result );

		// drl executeQuery()--->ResultSet
		// ResultSet result =stmt.executeQuery("update empl12 set ename = 'Meg'
		// where eid = 101");
		// System.out.println("Data updated " +result );

		// ResultSet result =stmt.executeQuery("delete from empl12 where eid =
		// 103");
		// System.out.println("Data deleted " );

		
		ResultSet result=stmt.executeQuery("select * from empl12");
		while(result.next())
		{
			System.out.println(result.getInt(1) +" "+result.getString("ename"));
		}
		// close the connection
		conn.close();

	}
}
