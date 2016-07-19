package com.dev.computer;

public class Main 
{
	public static void main(String[] args) 
	{
		Microsoft micro = new Microsoft();
		Apple apple = new Apple();
		
		micro.add(5, 10);
		apple.add(5, 10);
		micro.gotoWeb();
		apple.gotoWeb();
	}
}
