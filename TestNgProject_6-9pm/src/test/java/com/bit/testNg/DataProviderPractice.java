package com.bit.testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice 
{
	private static WebDriver dr;
	
	
	@DataProvider(name="cred")
	public static Object[][] signIn()
	{
		return new Object[][]{ {"abcd@yahoo.com", "Abc123"}, {"pxyz123@yahoo.com", "Xyz123"}, {"xpqy123@gmail.com","Pqy123"}  };
	}
	
	@DataProvider(name="data")
	public static Object[][] logInData()
	{
		return new Object[][]{ {"abc@yahoo.com", "Abc123"}, {"xyz123@yahoo.com", "Xyz123"}, {"pqy123@gmail.com","Pqy123"}  };
	}
	
	
	@Test(dataProvider="cred")
	public void logIntoFacebook(String moga2, String moga1) throws InterruptedException
	{
		dr = new FirefoxDriver();
		dr.get("http://www.facebook.com");
		dr.manage().window().maximize();
		dr.findElement(By.xpath(".//*[@id='email']")).sendKeys(moga2);
		dr.findElement(By.xpath(".//*[@id='pass']")).sendKeys(moga1);
		dr.findElement(By.xpath(".//*[@id='u_0_x']")).click();
		Thread.sleep(5000);
		dr.quit();
	}
	
	@Test(dataProvider="data")
	public void facebookLogIn(String moga2, String moga1) throws InterruptedException
	{
		dr = new FirefoxDriver();
		dr.get("http://www.facebook.com");
		dr.manage().window().maximize();
		dr.findElement(By.xpath(".//*[@id='email']")).sendKeys(moga2);
		dr.findElement(By.xpath(".//*[@id='pass']")).sendKeys(moga1);
		dr.findElement(By.xpath(".//*[@id='u_0_x']")).click();
		Thread.sleep(5000);
		dr.quit();
	}

}
