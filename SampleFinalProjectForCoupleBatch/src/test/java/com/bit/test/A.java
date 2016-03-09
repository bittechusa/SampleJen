package com.bit.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A 
{
	@Test
	 void m1()
	 {
	String s="how are u";
	
	for(int i=0;i<s.length();i++)
		{
		  System.out.println(s.charAt(i));
		}
	System.out.println(s.substring(3));
	System.out.println(s.compareTo("ink"));
	String s3=s.replace(" ", "");
	System.out.println(s);
	StringBuffer b=new StringBuffer("how are u");
	StringBuffer s1=b.append(" asad");
	System.out.println(b);
	
	 }
	@Test
	public void array()
	{
		int a[]={4,6,8,4,43};
		int b[]=new int[a.length];
		//b=a.clone();
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		     
	}
	for(int j=0;j<b.length;j++)
	{
		System.out.println(b[j]);
	}
	}
	@Test
	public void fabanacci()
	{
		int i=0;
		int j=1;
		int n=10;
		for(int v=0;v<=n;v++)
		{
			
			i=i+j;//1
			j=i-j;//1
			System.out.println(j);
		}
	}
	@Test
	public void str()
	{
		String s="hellow";
		StringBuffer sb=new StringBuffer(s.length());
		//sb.reverse().toString();
		for(int i=s.length()-1;i>=0;i--)
		{
			sb.append(s.charAt(i)).toString();
		}
		System.out.println(sb);
		
	}
	
	
}
