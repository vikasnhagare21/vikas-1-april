package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Practice_LinkedList 
{
	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		ll.add("Bharat");
		ll.add(200);
		ll.add('V');
		ll.add(null);
		ll.add(100);
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.contains('V'));
		System.out.println(ll.isEmpty());
		System.out.println(ll);
		
		ll.add(1,"Hindustan");
		System.out.println(ll);
		
		ll.set(0, 645435);
		System.out.println(ll);
		
		System.out.println("---Print linkedlist by using Listiterator---");
		ListIterator litr = ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("---Print Linkedlist by using Iterator---");
		Iterator itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("print Linkedlist by using for loop");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("print linkedlist by using foreach");
		for(Object s1:ll)
		{
			System.out.println(s1);
		}
			
			
			
			
			
			
			
		
	}
}
