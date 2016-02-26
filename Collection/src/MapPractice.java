import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.Test;

public class MapPractice 
{
	Map<Integer,String> hp=new HashMap<Integer,String>();
	Map<Integer,String> ht=new Hashtable<Integer,String>();
	Map<Integer,String> tm=new TreeMap<Integer,String>();
	
	@Test
	public void hp1()
	{
		/*hp.put(2, "asad");
		hp.put(1, "kazi");
		hp.put(null, "shahid");
		hp.put(5, null);
		Iterator it = hp.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	       // it.remove();
	}*/
	    
	    hp.put(2, "asad");
		hp.put(1, "kazi");
		hp.put(4, "shahid");
		hp.put(3, "mushfiq");
		hp.put(null, null);//it take one null key and mutiple null value
		hp.put(6, null);
		Iterator it = hp.entrySet().iterator();
		while(it.hasNext())
		{
			//System.out.println(it.next());
			Map.Entry m=(Entry) it.next();
			
			//System.out.println(m.getValue());
			System.out.println(m.getKey());
			
		}
		
		/*for(int i=1;i<=hp.size();i++)
		{
			System.out.println(hp.get(i));
		}*/
	}
	
	@Test
	public void tm1()
	{
		tm.put(2, "asad");
		tm.put(1, "kazi");
        tm.put(4, "shahid");
		tm.put(3, "mushfiq");
		//tm.put(null, "hello");//no null key
		tm.put(6, null);//support null value
		/*for(int i=1;i<=tm.size();i++)
		{
			System.out.println(tm.get(i));
		}*/
		
		Iterator it = tm.entrySet().iterator();
		while(it.hasNext())
		{
			//System.out.println(it.next());
			Map.Entry m=(Entry) it.next();
			System.out.println(m.getValue());
			//System.out.println(m.getKey());
		}
	
	}
	
	@Test
	public void ht1()
	{
		ht.put(2, "asad");
		ht.put(1, "kazi");
        ht.put(4, "shahid");
		ht.put(3, "mushfiq");
		//ht.put(null, "hi");//no null key
		//ht.put(6, null);//no null value
		/*for(int i=1;i<=ht.size();i++)
		{
			System.out.println(ht.get(i));
		}*/
		
		Iterator it = ht.entrySet().iterator();
		while(it.hasNext())
		{
			//System.out.println(it.next());
			Map.Entry m=(Entry) it.next();
			//System.out.println(m.getValue());
			System.out.println(m.getKey());
			
		}
	
	}

}
