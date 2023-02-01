package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class example5_LinkedHashSet1 
{
	public static void main(String[] args)
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Bhuvneshwar");
		lhs.add(543);
		lhs.add('D');
		lhs.add(543);
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains('D'));
		System.out.println(lhs.size());
		System.out.println(lhs);
		
		lhs.remove(543);
	
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
