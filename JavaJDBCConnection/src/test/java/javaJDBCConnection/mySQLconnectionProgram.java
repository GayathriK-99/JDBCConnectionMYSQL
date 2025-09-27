package javaJDBCConnection;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

public class mySQLconnectionProgram {

	public static void main(String[] args) throws SQLException {
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB","root", "GayathriK99@");
		
		Statement stmt = (Statement) con.createStatement();
		
		//String s = "INSERT INTO mytable values(104, 'Jija', 85456)";
		
		//String s = "UPDATE mytable SET number= 556 where id=104 ";
		
		//String s = "DELETE FROM mytable where id = 102" ; 
		
		
		String s = "SELECT * FROM mytable"; 
		
		ResultSet rs = stmt.executeQuery(s); 
	
		while (rs.next())
		{
			int sid= rs.getInt("ID");
			String sname= rs.getString("NAME");
			int snum = rs.getInt("NUMBER");
			
			System.out.println(sid +" " + sname+ " " + snum);
		}
		stmt.execute(s);
		
		con.close();
		System.out.println("query executed");
		
		
		

	}

}
