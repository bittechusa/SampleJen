import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;


public class Asheet 
{
//	@Test
//	public void m1() throws Exception
//	{
//		FileInputStream fis = new FileInputStream("C:\\Users\\bittech\\project\\ExcelSheetRead\\src\\test\\java\\EXCELSHEET.xls");
//        //Access the required test data sheet
//        HSSFWorkbook wb = new HSSFWorkbook(fis);
//        HSSFSheet sheet = wb.getSheet("sheet1");
//	
//		 for (int count = 1; count <= sheet.getLastRowNum(); count++)
//	        {
//	            HSSFRow row = sheet.getRow(count);
//	            String id = row.getCell(0).toString();
//	            String userid = row.getCell(1).toString();
//	            String password = row.getCell(2).toString();
//	            if (id.equals("2.0"))
//	            {
//	               // System.out.println("hellos");
//	                dr.findElement(By.id("email")).sendKeys(userid);
//	                dr.findElement(By.id("pass")).sendKeys(password);
//	                dr.findElement(By.id("u_0_n")).click();
//	                break;
//	              
//	            }
//	            
//	        }
//	}
	@Test
	public void m4() throws Exception
	{
	 
		
	      // Open the Excel file
	        FileInputStream fis = new FileInputStream("C:/Users/bittech/Desktop/All Folders/MON/ExcelSheetRead/src/test/java/Book2.xlsx");
	        //Access the required test data sheet
	        XSSFWorkbook wb = new XSSFWorkbook(fis);
	        XSSFSheet sheet = wb.getSheet("Sheet1");
	        int ROWS = sheet.getLastRowNum()-1; //if headers are present - use -1
	        int COLS = 2; //read all columns

	        XSSFRow dataset = new Object[ROWS][COLS];
	        for (int count = 1; count <= sheet.getLastRowNum(); count++)
	        {
	        	
	            XSSFRow row = sheet.getRow(count);
	            for(int r=1;r<=row.getLastCellNum();r++)
	            {
	            	dataset=sheet.getRow(count);
	            	System.out.println(dataset);
	            }
	           
	            String cell = row.getCell(count).getStringCellValue();
	            System.out.println(cell);
	            
//	            String execute = row.getCell(0).toString();
//	            String affiliateName = row.getCell(1).toString();
//	            String userid = row.getCell(2).toString();
//	            String password = row.getCell(3).toString();

	           

	          
//	        for(int count =1; count <= sheet.getLastRowNum(); count++)
//	        {
//	        	XSSFRow row= sheet.getRow(count);
//	        	XSSFCell cell= row.getCell(1, row.RETURN_BLANK_AS_NULL);
//	        	
//	        	String execute =row.getCell(0).toString();
//	        	
//	        	String userid=row.getCell(1).toString();
//	        	String password =row.getCell(2).toString();
//	        	
//	        	
	        	
	        }      
	       
	        }       
	        
	}

	


