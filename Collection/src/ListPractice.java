import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

import org.junit.Test;

public class ListPractice 
{
	
    ArrayList<Integer> al=new ArrayList<Integer>();
    LinkedList<Integer> ll=new LinkedList<Integer>();
    Vector<Integer> v=new Vector<Integer>();
    
    public void m7(ArrayList<Integer> ar)
    {
    	for(Integer i:ar)
    	{
    		LinkedList<Integer> ll=new LinkedList<Integer>();
    		ll.add(i);
    		for(Integer l:ll)
        	{
        		System.out.println(l);
        	}
    		
    //	System.out.println(i);
    	}
    	
    }
    @Test
    public void be()
    {
   // 	Enumeration e=Collections.enumeration(al);
    	
    //	Enumeration c=v.elements();
    	
    //	c.hasMoreElements();
    
    //	v.elements().hasMoreElements();
   // 	Collections.enumeration(ll).hasMoreElements();
	    	al.add(6);
	    	al.add(7);
	    	m7(al);
	    	
	    //	v.add(6);
	    //	Object[]ar=new Object[1];
	    //	v.copyInto(ar);
	    	//System.out.println(ar[0]);
	    	
//	    	v.set(0, 9);
//	    	System.out.println(v.get(0));
//	    	v.addAll(al);
//	    	System.out.println(v);
	    	
    }
    
    @Test
    public void m1()
    {
    	
    //	System.out.println("add");
/*        long s=System.currentTimeMillis();
        for( int i=0;i<=1000000;i++)
        { 
            al.add(i);
        }
        //long e=System.currentTimeMillis();
        //System.out.println("insert "+e-s);
        for(int k=999999;k>1000;k--)
        {
            al.get(k);
        }
        long e=System.currentTimeMillis();
        System.out.println(e-s);*/
        
        //linkedList
        long s1=System.currentTimeMillis();
        for( int j=0;j<=1000000;j++)
        { 
            ll.add(j);
        }
        for(int l=999999;l>10;l--)
        {
            ll.get(l);
        }
        long e1=System.currentTimeMillis();
        System.out.println(e1-s1);
     
        //how to use iterator
        al.add(9);
        al.add(19);
        al.add(5);
        ListIterator li=al.listIterator();
        
        
        Iterator i=al.iterator();
        
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    
        }
    
    @Test
    public void m2()
    {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
//        hm.put(1, "payon");
//        hm.put(2, "dip");
//        hm.put(null, null);//one null key allow
//        hm.put(4, null);//multiple null value allow
        //hm.put(null, null);
        //hashtable
       ht.put(1, "fhgkh");
        ht.put(2, "dgh");
       // ht.put(null, "gfh");no null value and null key as well
       // ht.put(null, null);
//        for(int i=1;i<=hm.size();i++)
//        {
//            System.out.println(hm.get(i));
//        }
        for(int j=1;j<=ht.size();j++)
        {
            System.out.println(ht.get(j));
        }
//        for(int k=0;k<ht.size();k++)
//        {
//            System.out.println(ht.remove(k));
//        }
//        
       
        
    }

    

}
