package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class example6_TreeSet
{
	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		
		ts.add(300);
		ts.add(500);
		ts.add(400);
		ts.add(200);
		ts.add(700);
		ts.add(600);
		ts.add(100);
		ts.add(200);
//		ts.add(null);
		
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.isEmpty());
		System.out.println(ts.contains(100));
		
		ts.remove(400);
		System.out.println(ts);
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		ts.pollFirst();
		System.out.println(ts);
		
		System.out.println("---Print data by using iterator cursor---");
		Iterator itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print data by using for each---");
		for(Object a:ts)
		{
			System.out.println(a);
		}
		
		
		
		
		
		
	}
}
