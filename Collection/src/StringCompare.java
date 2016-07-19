import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
	 
	import org.junit.Test;
class  S1 implements Comparable<String>,Comparator<String>
{
	@Override
	public int compare(String s1, String s2)//from comparator
	{
	/*	
	int l=s1.length();
	int l1=s2.length();
	if(l>l1)
	{
	return 1;
	}
	else if(l<l1)
	{
	return -1;
	}
	else
	return 0;
	}*/
	
	
	   return s1.compareTo(s2);
	}

	@Override
	public int compareTo(String o) //from comparable
	{
		// TODO Auto-generated method stub
		return 0;
	}
	}

	
 public class StringCompare {
	 
	    @Test
	    public void m1()
	    {
	        List<String> animals=new ArrayList<String>();
	        animals.add("chicken");
	        animals.add("deer");
	        animals.add("ant");
	        animals.add("tiger");
	       Collections.sort(animals);
	        // Collections.sort(animals,new S1());
	        for(String animal:animals)
	        {
	        System.out.println(animal);
	        }
}
	}
