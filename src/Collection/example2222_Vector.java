package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class example2222_Vector 
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		
		v.add("Ganesh");
		v.add(100);
		v.add(99.99f);
		v.add(100);
		v.add(null);
		v.add(null);
		
		System.out.println(v.get(2));
		System.out.println(v);
		System.out.println(v.contains(100));
		System.out.println(v.isEmpty());
		System.out.println(v.size());
		
		v.add(3,200);
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		v.set(3, 300);
		System.out.println(v);
		
		System.out.println("---Print the Vector by using Iterator Cursor---");
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print the Vector by using ListIterator Cursor---");
		 ListIterator litr = v.listIterator();
		 while(litr.hasNext())
		 {
			 System.out.println(litr.next());
		 }
		 
		 System.out.println("Print the Vector data by using for loop--");
		 for(int i=0;i<=v.size()-1;i++)
		 {
			 System.out.println(v.get(i));
		 }
		 
		 System.out.println("Print Vector by using for each");
		 for(Object s1:v)
		 {
			 System.out.println(s1);
		 }
		 
		 System.out.println("Print the Vector by using enumeration");
		 Enumeration enu = v.elements();
		 while(enu.hasMoreElements())
		 {
			 System.out.println(enu.nextElement());
		 }
	}
}
