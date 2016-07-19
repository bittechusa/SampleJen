import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;



public class convertArray 
{
	private int a;
	private int b;
	private int c;
	
	
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public convertArray(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Test

	public void ma() 
	{
		convertArray c=new convertArray(6,9,3);
		System.out.println(c.getA());
		convertArray c1=new convertArray(63,94,33);
		c1.setA(78);
		System.out.println(c1.getA());
		
		/*ArrayList declaration and initialization*/
		ArrayList<String> arrlist= new ArrayList<String>();
		arrlist.add("String1");
		arrlist.add("String2");
		arrlist.add("String3");
		arrlist.add("String4");
		arrlist.add("fdg");

		/*ArrayList to Array Conversion */
		String array[] = new String[arrlist.size()];              
		for(int j =0;j<=arrlist.size();j++)
		{
		  array[j] = arrlist.get(j);
		}

		/*Displaying Array elements*/
		for(String k: array)
		{
			System.out.println(k);
		}

}
	//array to arraylist
	@Test
	public void convertArrayToArrayList()
	{
		String a[] ={"fsdhgd","jdgj","jsg"};
		String b1[]=a.clone();//array to array
		 List<String> b= new ArrayList<String>(Arrays.asList(a));
		 


		for(String s:b)
		{
			System.out.println(s);
		}
	}
}
