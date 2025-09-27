package javaJDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class empJDBC {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee2","root", "GayathriK99@");
		
		Statement stmt = (Statement) con.createStatement();
		
		//String s = "create database Employee2";
		//String s = "create table Employee (empcod int(10) primary key ,empname varchar(20),empage int(10),esalary float)"; 
		
		String s = "INSERT INTO Employee values"
				+ "(101, 'Jenny', 25 ,10000), "
				+ "(102, 'Jacky', 30 ,20000),"
				+ "(103, 'Joe', 20 ,40000),"
				+ "(104, 'John', 40 ,80000),"
				+ "(105, 'Shameer', 25 ,90000)"; 
		
		stmt.execute(s);
		
		con.close();
		System.out.println("query executed");

	}

}
