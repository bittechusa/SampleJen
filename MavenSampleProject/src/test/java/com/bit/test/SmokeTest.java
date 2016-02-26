package com.bit.test;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SmokeTest 
{
	@Test
	public void abc() throws InterruptedException
	{
		FirefoxDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("http://www.facebook.com");
		
		
		
		Thread.sleep(5000);
		dr.quit();
		
	
	}
	

}
