package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class example5_LinkedHashSet2
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Pranav");
		lhs.add(444);
		lhs.add('X');
		lhs.add(null);
		lhs.add(444);
		lhs.add(null);
		
		System.out.println(lhs);
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains('X'));
		System.out.println(lhs.size());
		System.out.println(lhs);
		
		lhs.remove("Pranav");
		System.out.println(lhs);
		
		System.out.println("---Print all data by using iterator cursor---");
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all data by using for each---");
		for(Object s:lhs)
		{
			System.out.println(s);
		}
	}
}
