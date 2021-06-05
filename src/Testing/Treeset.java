package Testing;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Treeset {
	 public static void main(String[] args)
	    {
	        NavigableSet<String> ts = new TreeSet<>();
	 
	      
	        ts.add("sumanth");
	        ts.add("NAidu");
	 
	        System.out.println("Tree Set is " + ts);
	 
	        String verify = "SUMANTH";
	 
	      
	        System.out.println("Contains " + verify + " "
	                           + ts.contains(verify));
	 
	        
	        System.out.println("First Value " + ts.first());
	 
	        
	        System.out.println("Last Value " + ts.last());
	 
	        String data = "naidu";
	 
	        
	        System.out.println("Higher " +ts.higher(data));
	        System.out.println("Lower " + ts.lower(data));
	        Iterator itr=ts.iterator();
	        while(itr.hasNext())
	        {
	        	System.out.println(itr.next());
	        }
	    }
	}





