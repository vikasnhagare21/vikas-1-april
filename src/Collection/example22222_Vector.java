package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class example22222_Vector 
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add("Vikas");
		v.add(100);
		v.add(87.90f);
		v.add(100);
		v.add(null);
		v.add(null);
		
		System.out.println(v.get(1));
		System.out.println(v);
		System.out.println(v.contains("vilas"));
		System.out.println(v.isEmpty());
		System.out.println(v);
	
		v.add(3,99.9f);
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		v.set(3,"Vikas");
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		
		System.out.println("---Print Vector by using iterator cursor---");
		
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print vector by using listIterator---");
		ListIterator litr = v.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("---Print Vector by using for loop---");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("---Print Vector by using for each---");
		for(Object s1:v)
		{
			System.out.println(s1);
		}
		
		System.out.println("---Print Vector by using enumeration---");
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
	}
	
}
