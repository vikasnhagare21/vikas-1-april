package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class example5_LinkedHashSet
{
	public static void main(String[] args)
	{
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add("rahul");
		lhs.add(100);
		lhs.add('A');
		lhs.add(100);
		lhs.add(null);
		lhs.add(null);
		lhs.add(55.45f);
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.contains("rahul"));
		System.out.println(lhs.isEmpty());
		
		
		lhs.remove('A');
		System.out.println(lhs);
		
		System.out.println("---Print all data by using iterator cursor---");
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all data by using for each---");
		for(Object s1:lhs)
		{
			System.out.println(s1);
		}
	}
}
