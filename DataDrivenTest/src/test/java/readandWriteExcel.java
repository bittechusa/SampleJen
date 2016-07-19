import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class readandWriteExcel
{

	
	@Test(dataProvider="email")
    public void mdf(String s)
    {
        FirefoxDriver dr=new FirefoxDriver();
        dr.get("http://www.facebook.com");
        dr.findElement(By.id("email")).sendKeys(s);
        System.out.println(s);
    }
    @DataProvider(name="email")
    public Object[][] getData() throws IOException
    {
        File excel1 = new File("C:/Users/bittech/Downloads/excel/excel/Book2.xlsx");
        FileInputStream fis = new FileInputStream(excel1);
        // Access the required test data sheet
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("Sheet1");
       // sheet.getRow(1).getCell(1).getStringCellValue();
        String[][] data = null;
       
        //XSSFRow s= sheet.getRow(0);
        //XSSFCell x=s.getCell(0);
        System.out.println(sheet.getLastRowNum()-sheet.getFirstRowNum()+1);
        
        int row=sheet.getLastRowNum();
        System.out.println(sheet.getRow(0).getLastCellNum());
        int column=sheet.getRow(0).getLastCellNum();
        
        data=new String[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
            }
        }
        
        return data;
    }
	
	
	
	
}
