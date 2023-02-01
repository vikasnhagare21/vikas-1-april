package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Practice_ArrayList
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList(12);
		al.add("Vikas");
		al.add("Vijay");
		al.add(100);
		al.add(null);
		al.add(null);
		al.add(100);
		al.add(34.90f);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains(100));
		System.out.println(al);
		
		al.add(4,"vicky");
		System.out.println(al);
		
		al.remove(4);
		System.out.println(al);
		
		al.set(3, 78.98f);
		System.out.println(al);
		
		System.out.println("---Print ArrayList by using Iterator cursor---");
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print ArrayList By using ListIterator cursor---");
		 ListIterator litr = al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("---Print ArrayList By using forloop---");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("Print ArrayList By using for each---");
		for(Object s1:al)
		{
			System.out.println(s1);
		}
			
		}
}
