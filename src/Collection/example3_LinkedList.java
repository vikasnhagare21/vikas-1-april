package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class example3_LinkedList 
{
	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		ll.add("vikay");
		ll.add(300);
		ll.add(300);
		ll.add(null);
		ll.add('C');
		ll.add(null);
		
		System.out.println(ll.size());
		System.out.println(ll);
		System.out.println(ll.isEmpty());
		System.out.println(ll.get(4));
		System.out.println(ll.contains("vikay"));
		
		System.out.println(ll);
		ll.add(4,"nanasaheb");
		System.out.println(ll);
		ll.remove(4);
		System.out.println(ll);
		ll.set(4, "Bharati");
		System.out.println(ll);
		
		System.out.println("---Print all data by using iterator cursor---");
		Iterator itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all data by using ListIterator cursor---");
		ListIterator litr = ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("---Print all data By using for loop---");
		for (int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("---Print all data by using for each---");
		for(Object s1:ll)
		{
			System.out.println(s1);
		}
		
	}
}
