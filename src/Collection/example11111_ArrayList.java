package Collection;

import java.util.ArrayList;

public class example11111_ArrayList
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("ravina");
		al.add(400);
		al.add('T');
		al.add(400);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains('T'));
		System.out.println(al.isEmpty());
		System.out.println(al);
		
		al.add(3,"gar");
		System.out.println(al);
		al.remove(3);
		al.set(3,"rag");
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
	}
}
