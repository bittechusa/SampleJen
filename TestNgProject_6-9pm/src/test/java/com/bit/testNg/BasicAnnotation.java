package com.bit.testNg;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotation 
{
	@Test(priority=2)
	public void m1()
	{
		System.out.println("m1 Test...");
	}
	@Test(priority=1)
	public void m2()
	{
		System.out.println("m2 Test...");
	}
	@BeforeTest
	public void m3()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void m4()
	{
		System.out.println("After Test");
	}
	@BeforeMethod
	public void m5()
	{
		System.out.println("Before Method...");
	}
	@AfterMethod
	public void m6()
	{
		System.out.println("After Method...");
	}
	@BeforeClass
	public void m7()
	{
		System.out.println("BeforeClass");
	}
	@AfterClass
	public void m8()
	{
		System.out.println("After Class");
	}
	
	
	

}
