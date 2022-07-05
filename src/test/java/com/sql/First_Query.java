package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class First_Query 
{
	public static void main(String[] args) throws SQLException 
	{
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?verifyServerCertificate=false&useSSL=true","root","root");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from my_friends");
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+", ");
			System.out.print( rs.getString(2)+", ");
			System.out.print( rs.getString(3)+", ");
			System.out.print( rs.getString(4)+", ");
			System.out.print( rs.getInt(5)+", ");
			System.out.print( rs.getString(6)+", ");
			System.out.println();
		}
		
		System.out.println("Query executed");
		con.close();
	}

}
