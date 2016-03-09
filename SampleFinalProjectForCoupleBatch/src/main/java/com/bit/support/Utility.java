package com.bit.support;

import java.util.Arrays;

import org.junit.Test;

public class Utility 
{
	public void arrayPractice(int [] x)
	{
		Arrays.sort(x);
		System.out.println("max num: "+ x[x.length-1]);
		System.out.println("min num: "+ x[0]);
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		for(int i=x.length-1;i>=0;i--)
		{
			System.out.println(x[i]);
		}
	}
	public void maxNum()
	{
		int b[]={76,8,87,4};
		int msx=b[0];
		for(int i=1;i<b.length;i++)
		{
			if(b[i]>msx)
			{
				msx=b[i];
			}
		}
		System.out.println(msx);
	}
	

}
