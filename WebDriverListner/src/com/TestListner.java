package com;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestListner implements ITestListener{

	 @Test
	    public void loginFB() throws InterruptedException{
	       
	        WebDriver driver=new FirefoxDriver();
	        driver.get("http://www.bluefly.com/special/shoes?so=pop&sosc=true&pid=cat1970656&activePrice=399~400");
	        driver.manage().window().maximize();
	        driver.navigate().refresh();
	        Thread.sleep(3000);
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	       
	        js.executeScript("document.getElementById('productsPerPageTopComboboxInput1').value='96'");

	        
	        
	        driver.findElement(By.id("email")).sendKeys("mukesh@facebook.com");
	        driver.findElement(By.id("passgffd")).sendKeys("dont-tell");
	        driver.findElement(By.id("u_0_y")).click();
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
	 

