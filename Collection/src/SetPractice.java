import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.junit.Test;

public class SetPractice 
{
	int [] a={3,5,9,9,5,3};
	HashSet<Integer> h=new HashSet<Integer>();
	LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
	TreeSet<Integer> t=new TreeSet<Integer>();
	@Test
	public void copyArray()
	{
		for(int i=0;i<a.length;i++)
		{
			h.add(a[i]);//it will add only unique value because os set
			
		}
		for(int x:h)
		{
		System.out.println(x);//it will retrieve the data
		}
	}
	@Test
	public void m1()
	{
		long s=System.currentTimeMillis();//to get system start time
		for(int i=0;i<100000;i++)
		{
			t.add(i);
		}
		long e=System.currentTimeMillis();//to get system end time
		System.out.println("treeSet " +(e-s));//to check performance
		t.add(5);
		t.add(3);
		t.add(9);
		//t.add(null);//it will throgh an exception because treeset cannot take null value
		//ls.add(9);
		Iterator i1=t.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
	@Test
	public void m3()
	{
		/*long s=System.currentTimeMillis();
		for(int i=0;i<100000;i++)
		{
			h.add(i);
		}
		long e=System.currentTimeMillis();
		System.out.println("HashSet " +(e-s));*/
		
		h.add(5);
		h.add(3);
		h.add(9);
		//h.add(null);
		//ls.add(9);
		Iterator i1=h.iterator();//to create object for Iterator
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	
	}
	
	@Test
	public void m2()
	{
		/*long s=System.currentTimeMillis();
		for(int i=0;i<100000;i++)
		{
			ls.add(i);
		}
		long e=System.currentTimeMillis();
		System.out.println("LinkedHashSet " +(e-s));*/
		
		
		ls.add(5);
		ls.add(3);
		ls.add(9);
		//ls.add(null);
		Iterator i1=ls.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	/*for(int i=0;i<a.length;i++)
	{
		ls.add(a[i]);
		
	}
	for(int x:ls)
	{
	System.out.println(x);
	}*/
	}
	
	
	
}
