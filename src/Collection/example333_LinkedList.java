package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class example333_LinkedList 
{
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		ll.add('b');
		ll.add("Chaitanya");
		ll.add(300);
		ll.add(null);
		ll.add(300);
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.get(1));
		System.out.println(ll.contains(300));
		System.out.println(ll.isEmpty());
		System.out.println(ll);
		
		ll.add(3,987934);
		System.out.println(ll);
		ll.remove(3);
		System.out.println(ll);
		ll.set(2, "Ratiya");
		System.out.println(ll);
		
		System.out.println("---Print LinkedList by using iterator Cursor---");
		Iterator itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print LinkedList by using ListIterator Cursor--- ");
		ListIterator litr = ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("---Print LinkedList by using for loop---");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("---Print LinkedList by using for each---");
		for(Object s1:ll)
		{
			System.out.println(s1);
		}
			
	}
}
