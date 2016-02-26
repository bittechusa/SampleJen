package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage extends Shared
{
	FirefoxDriver dr;
	Shared s = new Shared();
	public void m1()
	{
		myClick(By.id(""));
		s.myClick(By.xpath(""));
	}

}
