package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class example6_TreeSet1 
{
public static void main(String[] args)
{
		TreeSet ts=new TreeSet();
		ts.add("Ramayana");
		ts.add("Krishna");
		ts.add("Bharata");
		ts.add("Dashanand");
		ts.add("Vikky");
		ts.add("Ayodhya");
//		ts.add(null);
		
		System.out.println(ts);
		System.out.println(ts.contains("Krishna"));
		System.out.println(ts.isEmpty());
		System.out.println(ts.first());
		System.out.println(ts.last());
		ts.pollFirst();
		System.out.println(ts);
		ts.pollLast();
		System.out.println(ts);
		
		System.out.println("---print all data by using iterator cursor---");
		Iterator itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all data by using for each---");
		for(Object s:ts)
		{
			System.out.println(s);
		}
}
}
