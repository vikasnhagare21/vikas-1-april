package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class example22_Vector
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		
		v.add("Vikas");
		v.add(231);
		v.add('G');
		v.add(231);
		v.add(null);
		v.add(null);
		
		System.out.println(v.get(2));
		System.out.println(v);
		System.out.println(v.contains(231));
		System.out.println(v.isEmpty());
		System.out.println(v);
		
		v.add(0,"Vijay");
		System.out.println(v);
		v.remove(0);
		System.out.println(v);
		v.set(0, "Nanasaheb");
		System.out.println(v);
		v.remove(4);
		System.out.println(v);
		
		System.out.println("---print Vector by using Iterator cursor---");
		 Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("---print Vector by using ListIterator cursor---");
		 ListIterator litr = v.listIterator();
		 while(litr.hasNext())
		 {
			 System.out.println(litr.next());
		 }
		 
		 System.out.println("---Print Vetor data by using forloop---");
		 for(int i=0;i<=v.size()-1;i++)
		 {
			 System.out.println(v.get(i));
		 }
		 
		 System.out.println("---Print Vector data by using foreach---");
		 for(Object s1:v)
		 {
			 System.out.println(s1);
		 }
		 System.out.println("---Print Vector data by using Enumeration---");
		 Enumeration enu = v.elements();
		 while(enu.hasMoreElements())
		 {
			 System.out.println(enu.nextElement());
		 }
		
	}
}
