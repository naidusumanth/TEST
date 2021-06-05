package Testing;

import java.util.ArrayList;
import java.util.ListIterator;


	public class Collections {
		public static void main(String []args)
		{
		    ArrayList<Integer> s1 = new ArrayList<Integer>();
			s1.add(5);
			s1.add(8);
			s1.add(55);
			s1.set(2, 70);
			System.out.print(s1.toString());
			s1.remove(0);
			ListIterator<Integer> itr=s1.listIterator();
			System.out.println("The previous index is: " +  itr.previousIndex());
		    System.out.println("The next index is: " + itr.nextIndex());
		    while(itr.hasNext())
		    {
		    	System.out.println(itr.equals(44));
		    	System.out.println(itr.next());
		    	System.out.println(itr.previous());
		    	
		    }
			
		}
		}

