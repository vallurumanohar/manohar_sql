package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sqldml {

	public static void main(String[] args) throws SQLException {

		//creating connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

		//create statement
		Statement stmt = con.createStatement();
		
		//inserting values
		//String s= "INSERT INTO STUDENT VALUES(06,'mmno', 'qgth', 6000)";
		
		//updating values
		String s= "UPDATE STUDENT SNAME='MAN' WHERE S.NO=06";
		
		
		
		//execute the statement/query
		stmt.execute(s);
		
		//close the connection
		con.close();
		
		System.out.println("query executed");
	}

}
