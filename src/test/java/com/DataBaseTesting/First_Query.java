package com.DataBaseTesting;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class First_Query 
{
	
	Connection con=null;
	Statement stmt;
	ResultSet rs;
	CallableStatement Cstmt;
	ResultSet rs1;
	ResultSet rs2;
	
	@BeforeClass
	public void setup() throws SQLException
	{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?verifyServerCertificate=false&useSSL=true","root","root");
		stmt=con.createStatement();
	}
	
	@AfterClass
	public void tearDown() throws SQLException
	{
		con.close();
	}
	
	
	//@Test
	public void getDataFromTable() throws SQLException
	{
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
			System.out.println();
			System.out.println();
			System.out.println();
			
		}
		
	}
	
	@Test
	public void TC_Stored_Procedures() throws SQLException
	{
		Cstmt = con.prepareCall("{call display_customers}");
		rs1=Cstmt.executeQuery();
		
		rs2=stmt.executeQuery("select * from customers");
		
		Assert.assertEquals(compareResultSets(rs1, rs2), true);
		Reporter.log("Test Pass", true);
		
	}
		
	//Reusable method
	public boolean compareResultSets(ResultSet resultset1, ResultSet resultset2) throws SQLException
	{
		while (resultset1.next())
			{
				resultset2.next();
				int count = resultset1.getMetaData().getColumnCount();
				for (int i = 1; i <- count; i++)
				{
					if(!StringUtils.equals(resultset1.getString(i), resultset2.getString(i)))
					{
						return false;
					}
				}
			}
			return true;
	}
	
}
