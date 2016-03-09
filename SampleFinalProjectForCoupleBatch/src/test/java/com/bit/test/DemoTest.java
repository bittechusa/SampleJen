package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoTest 
{
	WebDriver dr;
	
	
    
	@Test
	@Parameters("b")
	public void m2(String b)
	{
		System.out.println("hi");
		if(b.equals("f"))
		{
			dr=new FirefoxDriver();
		}
		else if(b.equals("c"))
		{

   		   System.setProperty("webdriver.chrome.driver", "/Users/bittech/Desktop/Driver/chromedriver");
            dr=new ChromeDriver();
		}
		
		
		
	}
	
	
	
	
	@DataProvider(name="shahid")
	public Object[][] crediential()
	{
		return new Object[][]{{"shahidul","1234"},{"gdjshgd","12345"}};
	}
	
	
	@Test(dataProvider="shahid")
	public void getData(String s,String y)
	{
		
		dr.get("http://www.facebook.com");
		dr.findElement(By.id("email")).sendKeys(s);
		dr.findElement(By.id("pass")).sendKeys(y);
		dr.findElement(By.id("u_0_n")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
