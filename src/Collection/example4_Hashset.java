package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class example4_Hashset
{
	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		hs.add("rahul");
		hs.add(100);
		hs.add('a');
		hs.add(65.5f);
		hs.add(null);
		hs.add(100);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains('a'));
		System.out.println(hs.isEmpty());
		
		System.out.println(hs);
		
		System.out.println("---print data by using iterator---");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print data by using foreach---");
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
		
			
	}
}
