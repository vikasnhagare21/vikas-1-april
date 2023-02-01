package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class example41_HashSet
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add("vaikant");
		hs.add(456);
		hs.add('F');
		hs.add(456);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.contains(456));
		System.out.println(hs.isEmpty());
		System.out.println(hs);
		
		
		System.out.println(hs);
		
		System.out.println("---Print all data by using iterator Cursor---");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all data by using for each---");
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
	}
}
