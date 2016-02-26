package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Shared
{
	FirefoxDriver dr;
	
	public void myClick(By by)
	{
		try
		{
			dr.findElement(by).click();
		}
		catch(Exception e)
		{
			System.out.println("Unable to click.......");
		}
		
	}
	
	
	
	

}
