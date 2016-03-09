package com.bit.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.bit.support.Utility;

public class SmokeTest 
{
	
	@Test
	public void m1() throws MalformedURLException
	{
		 
		        //FirefoxDriver driver = new FirefoxDriver();
		         
		        DesiredCapabilities capability = DesiredCapabilities.firefox();
		        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.3:4444/wd/hub"), capability);
		       
		        driver.get("http://www.facebook.com");
		  

	}
	
	Utility u=new Utility();
	//@Test
	//public void test1()
	//{
		/*int a[]={6,9,3,12,5};
		u.arrayPractice(a);*/
		//u.maxNum();
	//}

}
