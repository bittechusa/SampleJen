package com;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestListner implements ITestListener{
	 WebDriver driver=new FirefoxDriver();
	 @Test
	    public void loginFB() throws InterruptedException{
	       
	       // WebDriver driver=new FirefoxDriver();
	        driver.get("http://www.facebook.com");
	        driver.manage().window().maximize();
	        driver.navigate().refresh();
	        Thread.sleep(3000);
	       // JavascriptExecutor js = (JavascriptExecutor)driver;
	       
	        //js.executeScript("document.getElementById('productsPerPageTopComboboxInput1').value='96'");

	        
	        
	        driver.findElement(By.id("email")).sendKeys("mukesh@facebook.com");
	        driver.findElement(By.id("passgfdhh")).sendKeys("dont-tell");
	        driver.findElement(By.id("u_0_y")).click();
	       
	       
	 }
	    
	  public void screen() throws IOException
	  {
		  File sf=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(sf, new File("/Users/bittech/Desktop/shot"+Math.random()*1000+".png"),true);
	  }
	    
	    
	    @Override
	    public void onFinish(ITestContext arg0) {
	        // TODO Auto-generated method stub
	       
	    }
	 
	    @Override
	    public void onStart(ITestContext arg0) {
	        // TODO Auto-generated method stub
	       
	    }
	 
	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	        // TODO Auto-generated method stub
	       
	    }
	 
	    @Override
	    public void onTestFailure(ITestResult arg0) {
	    
	        System.out.println("Screen shot captured====="+arg0.toString());
	        try {
				screen();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("catch");
			}
	       
	    }
	 
	    @Override
	    public void onTestSkipped(ITestResult arg0) {
	        // TODO Auto-generated method stub
	       
	       
	    }
	 
	    @Override
	    public void onTestStart(ITestResult arg0) {
	        // TODO Auto-generated method stub
	        System.out.println("TestCase started====" +arg0.toString());
	       
	    }
	 
	    @Override
	    public void onTestSuccess(ITestResult arg0) {
	        // TODO Auto-generated method stub
	       
	        System.out.println("Congrates Testcase has been passed===="+ arg0.toString());
	       
	    }
	 
	}
	 

