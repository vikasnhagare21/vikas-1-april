package Collection;

import java.util.ArrayList;

public class example1111_ArrayList
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("Captain");
		al.add(321);
		al.add('r');
		al.add(321);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains('r'));
		System.out.println(al.isEmpty());
		System.out.println(al);
		
		al.add(0,"American");
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		
		al.set(1, 123);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
	}
}
