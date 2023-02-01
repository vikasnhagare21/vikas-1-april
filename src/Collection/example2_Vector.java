package Collection;

import java.util.Enumeration;
import java.util.Iterator;

import java.util.ListIterator;
import java.util.Vector;

public class example2_Vector
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add("rahul");
		v.add(100);
		v.add('A');
		v.add(65.5f);
		v.add(100);
		v.add(null);
		v.add(null);
		
		System.out.println(v.get(0));
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.contains('A'));
		System.out.println(v);
		
		v.add(4,500);
		System.out.println(v);
		
		v.remove(4);
		System.out.println(v);
		
		v.set(3, 75.5f);
		System.out.println(v);
		
		System.out.println("---print Vector info using Iterator cursor---");
		
		Iterator itr= v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print vector info using ListIterator cursor---");
		
		ListIterator litr=v.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("---print Vector info by using for loop---");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("---Print Vector info by using foreach loop---");
		for(Object s1:v)
		{
			System.out.println(s1);
		}
		
		System.out.println("---Print Vector data by sing Enumeration Cursor---");
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
	}
}
