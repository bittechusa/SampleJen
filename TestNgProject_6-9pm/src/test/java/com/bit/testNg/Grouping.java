package com.bit.testNg;

import org.testng.annotations.Test;

public class Grouping 
{
	@Test(groups={"Car"})
	public void nissan()
	{
		System.out.println("Missan Method");
	}
	@Test(groups={"Car"})
	public void toyota()
	{
		System.out.println("toyota metod");
	}
	@Test(groups={"Book"})
	public void lambo()
	{
		System.out.println("Lambo car");
	}
	@Test(groups={"Book"})
	public void abc()
	{
		System.out.println("abc car");
	}
	@Test(groups={"Car"})
	public void xyz()
	{
		System.out.println("xyz car");
	}
	
	@Test
	public void sample()
	{
		System.out.println("sample method");
	}
	

}
