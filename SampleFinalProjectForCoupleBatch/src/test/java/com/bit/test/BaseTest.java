package com.bit.test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest 
{
	
	 WebDriver dr;
	    @BeforeMethod
	    public void start() throws MalformedURLException
	    {
	    	String remote=System.getProperty("RemoteBrowser");
	    	String browser=System.getProperty("Browser");
	        String local=System.getProperty("LocalBrowser");
//	        if(browser.equals("F"))
//	        {
//	        	if(local.equals("L"))
//	        	{
//	        		dr=new FirefoxDriver();
//		        	dr.get("http://www.eshopper24.com");
//	        	}
//	        	else if(remote.equals("R"))
//	        	{
//	                DesiredCapabilities capability = new DesiredCapabilities();
//	                capability.setBrowserName("firefox");
//	                
//	                WebDriver dr = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
//	                dr.get("http://www.facebook.com");
//	        	}
//	        	
//	        }
//	        else if(browser.equals("C"))
//	        {
//	        	if(local.equals("L"))
//	        	{
//	        		System.setProperty("webdriver.chrome.driver", "/Users/bittech/Desktop/Driver/chromedriver");
//		            dr=new ChromeDriver();
//	        	}
//	        	else if(remote.equals("R"))
//	        	{
//	                DesiredCapabilities capability = DesiredCapabilities.chrome();
//	                dr = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
//	                dr.get("http://www.facebook.com");
//	        	}
//	            
//	        }
//	        else if(browser.equals("IE"))
//	        {
//	        	if(local.equals("L"))
//	        	{
//	        		 System.setProperty("webdriver.ie.driver", "/Users/bittech/Desktop/Driver/IEServerdriver");
//	 	            dr=new InternetExplorerDriver();
//	        	}
//	        	else if(remote.equals("R"))
//	        	{
//	                DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
//	                dr = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
//	                dr.get("http://www.facebook.com");
//	        	}
//	           
//	            
//	        }
//	        else
//	        {
//	        	dr=new FirefoxDriver();
//	        	dr.get("http://www.eshopper24.com");
//	        }
	    }
	    
	    @Test
	    public void m2() throws IOException
	    {
	    	FirefoxProfile fp=new FirefoxProfile();
    		File f=new File("/Users/bittech/Desktop/Driver/firebug-2.0.1.xpi");
    		fp.addExtension(f);
    	     dr=new FirefoxDriver(fp);
	    }
	    @Parameters("browser")
	    @Test()
	    public  void m(String b) throws IOException 
	    {
	    	if(b.equals("firefox"))
	    	{
	    		FirefoxProfile fp=new FirefoxProfile();
	    		File f=new File("/Users/bittech/Desktop/Driver/firebug-2.0.1.xpi");
	    		fp.addExtension(f);
	    	     dr=new FirefoxDriver(fp);
	    	}
	    	else if(b.equals("chrome"))
	    	{
	    		System.setProperty("webdriver.chrome.driver", "/Users/bittech/Desktop/Driver/chromedriver");
            dr=new ChromeDriver();
	    	}
	    	//Command to run the test from command line = mvn test -DBrowser="F"
	    	//Download from: https://getfirebug.com/releases/firebug/2.0/
	    
	        //FirefoxProfile fp=new FirefoxProfile();
	       // File f=new File("/Users/bittech/Desktop/Driver/firebug-2.0.1.xpi");
	        //File f1=new File("/Users/bittech/Desktop/Driver/firepath-0.9.7-fx.xpi");
	        //FirefoxBinary fbinary=new FirefoxBinary(new File("C:\\Users\\bittech\\Downloads\\Firefox Setup 36.0.exe"));
	        //fp.addExtension(f);
	       // fp.addExtension(f1);
	       // FirefoxDriver dr=new FirefoxDriver(fp);
	        
	    }
	    @Test
	    public void m1() throws MalformedURLException
	    {
	    	DesiredCapabilities capability = new DesiredCapabilities();
            capability.setBrowserName("firefox");
            
           WebDriver dr = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
            dr.get("http://www.facebook.com");
	    }
	   


}
