package Collection;

import java.util.ArrayList;

public class example111111_ArrayList 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("vikas");
		al.add(12);
		al.add(12);
		al.add('V');
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains("vikas"));
		System.out.println(al.isEmpty());
		
		al.add(3,"nanasaheb");
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		al.set(4,"bharati");
		System.out.println(al);
		al.remove(4);
		
	}
}
