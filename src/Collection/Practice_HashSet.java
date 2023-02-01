package Collection;

import java.util.HashSet;

public class Practice_HashSet
{
	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		hs.add("Mahesh");
		hs.add(100);
		hs.add('C');
		hs.add(null);
		hs.add(100);
		
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("Mahesh"));
		System.out.println(hs);
		
		hs.add(0);
		System.out.println(hs);
		
	}
}
