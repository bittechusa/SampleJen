package com.bit.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paral 
{
	WebDriver dr;

	@Parameters("browser")
    @Test
    public  void m1(String b) throws IOException 
    {
    	if(b.equals("f"))
    	{
    		FirefoxProfile fp=new FirefoxProfile();
    		File f=new File("/Users/bittech/Desktop/Driver/firebug-2.0.1.xpi");
    		fp.addExtension(f);
    	     dr=new FirefoxDriver(fp);
    	}
    	else if(b.equals("c"))
    	{
    		System.setProperty("webdriver.chrome.driver", "/Users/bittech/Desktop/Driver/chromedriver");
        dr=new ChromeDriver();
    	}
    	
    }

}
