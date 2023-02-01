package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Practicmock 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("Vikas");
		al.add(200);
		al.add('N');
		al.add(null);
		al.add(200);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains('N'));
		System.out.println(al.isEmpty());
		System.out.println(al.get(3));
		
		al.add(3,3245);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		al.set(1, "Vijay");
		System.out.println(al);
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ListIterator litr = al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		for(Object s1:al)
		{
			System.out.println(s1);
		}
		
		
		
		
		
		
		
		
		
	}
}
