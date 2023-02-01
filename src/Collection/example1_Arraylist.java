package Collection;

import java.util.ArrayList;

public class example1_Arraylist {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
	
		al.add("rahul");
		al.add(100);
		al.add('A');
		al.add(65.5f);
		al.add(100);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains('A'));
		System.out.println(al);
		
		al.add(4,500);
		System.out.println(al);
		al.remove(4);
		System.out.println(al);
		al.set(3, 75.5f);
		System.out.println(al);

	}

}
