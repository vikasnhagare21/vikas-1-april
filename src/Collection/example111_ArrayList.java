package Collection;

import java.util.ArrayList;

public class example111_ArrayList 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("vikas");
		al.add(100);
		al.add('N');
		al.add(100);
		al.add(98.3f);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains("vikas"));
		System.out.println(al.isEmpty());
		System.out.println(al);
		
		al.add(3,'V');
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		
		al.set(1, "vijay");
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		
		
		
	}
}
