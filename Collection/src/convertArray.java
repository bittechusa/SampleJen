import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class convertArray 
{
	@Test

	public void ma() 
	{
		/*ArrayList declaration and initialization*/
		ArrayList<String> arrlist= new ArrayList<String>();
		arrlist.add("String1");
		arrlist.add("String2");
		arrlist.add("String3");
		arrlist.add("String4");

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
		 List<String> b= new ArrayList<String>(Arrays.asList(a));
		 


		for(String s:b)
		{
			System.out.println(s);
		}
	}
}
