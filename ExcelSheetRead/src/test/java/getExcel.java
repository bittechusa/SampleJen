

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class getExcel
{
public WebDriver driver;
public WebDriverWait wait;
@BeforeClass 

public void testSetup()
{driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://www.facebook.com");
wait = new WebDriverWait(driver, 5);
}
@Test(dataProvider="data")
public void VerifyInvalidLogin(String userName, String password)
{driver.findElement(By.id("email")).sendKeys(userName);
driver.findElement(By.id("pass")).sendKeys(password);
driver.findElement(By.id("u_0_n")).click();
}
@DataProvider(name = "data")
public static Object[][] returnExcelSheetData(String filePath,String sheet) throws IOException 
    {

    }
public void m1()
{
FileInputStream file = new FileInputStream(new File(filePath));
XSSFWorkbook workbook =new XSSFWorkbook(file);
XSSFSheet worksheet = workbook.getSheet(sheet); //sheet name

int ROWS = worksheet.getLastRowNum()-1; //if headers are present - use -1
int COLS = 2; //read all columns

Object[][] dataset = new Object[ROWS][COLS];
for (int rowCount = 0; rowCount < ROWS; rowCount++) 
{
	XSSFRow row= worksheet.getRow(rowCount);
   // XSSFCell cell= row.getCell(1, row.RETURN_BLANK_AS_NULL);
    for (int colCount = 0; colCount < COLS; colCount++) 
    {
    	dataset[rowCount][colCount] = row.getCell(rowCount,row.RETURN_BLANK_AS_NULL);
    }
        
    }
return dataset;
}

}


