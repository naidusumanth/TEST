package Testing;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorEx1 {
	public static void main(String[] args)
	{
		ArrayList<Integer> list
			= new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		java.util.Iterator<Integer> itr = list.iterator();

		System.out.println("The Iterator:");
		System.out.println("Implementing ");

		while (itr.hasNext())
			System.out.print(itr.next() + " ");

		System.out.println();

		ListIterator<Integer> i = list.listIterator();

		System.out.println(" a ListIterator:");
		System.out.println("Implementing Traversal ");

		while (i.hasNext())
			System.out.print(i.next() + " ");

		System.out.println();

		System.out.println("Backward Traversal : ");

		while (i.hasPrevious())
			System.out.print(i.previous() + " ");

		System.out.println();
		
		System.out.println("forward direction");
		
		ArrayList<Integer> aList
            = new ArrayList<Integer>();
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);
        aList.add(5);
  
        System.out.println("Elements of ArrayList: ");
        for (Integer i1 : aList) {
            System.out.println(i1);
        }
        ListIterator<Integer> l
            = aList.listIterator();
        l.next();
        l.set(80000);
  
        System.out.println("ArrayList"
                           + " elements are: ");
        for (Integer i1 : aList) {
            System.out.println(i1);
        }
		
		System.out.println("Iterator can help to replace an element");
		
	}
}





