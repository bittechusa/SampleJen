package com.bit.test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exception 
{
	
	/*@Test
	public void m1() throws FileNotFoundException
	{
		File file=new File("E:\\files.txt");
	    FileReader fr = new FileReader(file);	
	  System.out.println("hi");
	}*/
	
	@Test
	public void exceptionHandleTest()
	{
		try
		{
			
			File file=new File("E:\\files.txt");
		    FileReader fr = new FileReader(file);	
		    System.out.println(10/0);
		}
	
		catch(FileNotFoundException e)
		{
			//System.out.println(e.getStackTrace());
			System.out.println("han");
		}
		catch(ArrayIndexOutOfBoundsException e7)
		{
			System.out.println("Array is too short");
		}
		
		finally
		{
			
		}
		
		System.out.println("I have handled exception");		
		
	}
	
	
	
	@Test
	public void seleniumExceptionTest() throws Throwable 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.bluefly.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		try{
		driver.findElement(By.xpath(".//*[@id='main-v-woman']")).click();
		//int s = driver.findElements(By.xpath(".//*[@id='slotMcolMain1']/div/div[2]/ul/li/a/div/img")).size();
		List<WebElement> s = driver.findElements(By.xpath(".//*[@id='slotMcolMain1']/div/div[2]/ul/li/a/div/img"));
		int st = s.size();
		for(int i = 1; i<st; i++)
		{
			driver.findElement(By.xpath(".//*[@id='slotMcolMain1']/div/div[2]/ul/li[" +i+ "]/a/div/img")).click();
			Thread.sleep(3000);
			driver.navigate().back();
		}
		}catch(NoSuchElementException e2)
		{
			System.out.println("fgh");
		}
		
	}
	

}



