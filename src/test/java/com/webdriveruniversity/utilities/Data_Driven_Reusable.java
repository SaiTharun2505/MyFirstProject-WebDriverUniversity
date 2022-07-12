package com.webdriveruniversity.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Reusable 
{
	static FileInputStream fi;
	static FileOutputStream fo;
	static XSSFWorkbook book;
	static XSSFSheet sht;
	static XSSFRow row;
	static XSSFCell cell;
	static String path="E:\\PROFESSIONAL\\eclipse workspace\\MyFirstProject\\src\\test\\java\\com\\webdriveruniversity\\testdata\\WebDriverUniversity_Data.xlsx";
	
	public static void Access_To_Work_Book()
	{
		try
		{
			FileInputStream file=new FileInputStream(path);
			book=new XSSFWorkbook(file);
			sht=book.getSheet("Login_Data");
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int getrowcount()
	{
		return sht.getLastRowNum();
	}
	
	public static String getcelldata(int row, int col)
	{
		return sht.getRow(row).getCell(col).getStringCellValue();
	}
	
	/*public static void main(String[] args)
	{
		Access_To_Work_Book();
		System.out.println(getcelldata(1, 0));
		
	}*/

}
