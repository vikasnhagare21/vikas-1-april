package Collection;

import java.util.ArrayList;

public class example11_ArrayList
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("ramesh");
		al.add(200);
		al.add('B');
		al.add(200);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains('B'));
		System.out.println(al);
		
		al.add(4,600);
		System.out.println(al);
		
		al.remove(4);
		System.out.println(al);
		
		al.set(3, 54.65f);
		System.out.println(al);
	}
}
