package Collection;

import java.util.ArrayList;

public class example1111111_ArrayList 
{
public static void main(String[] args)
{
	ArrayList al=new ArrayList();
	al.add("Vilas");
	al.add(432);
	al.add(432.53f);
	al.add(432);
	al.add(null);
	al.add(null);
	
	System.out.println(al.get(1));
	System.out.println(al);
	System.out.println(al.contains(432.53f));
	System.out.println(al.isEmpty());
	System.out.println(al);
	
	al.add(2,56.76f);
	System.out.println(al);
	al.remove(2);
	System.out.println(al);
	al.set(2, 98.99f);
	System.out.println(al);
	
}
}
