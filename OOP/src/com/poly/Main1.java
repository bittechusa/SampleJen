package com.poly;

import org.junit.Test;

public class Main1 
{
	@Test
	public void m()
	{
		//Cow c=new Cow();
		//Animal a=new Cow();
		Animal a[]=new Animal[2];
	    a[0]=new dog();
	    a[1]=new Cow();
	    for(int i=0;i<a.length;i++)
	    {
	    	a[i].eat();
	    }
	
	}
}
