package com.dev.computer;

public class Apple extends Computer
{
	@Override
	public void add(int a, int b) 
	{
		System.out.println("Apple: " + (a+b));
	}
	
	@Override
	public void gotoWeb() 
	{
		System.out.println("Go to Safari");
	}	
	
}
