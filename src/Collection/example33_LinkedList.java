package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class example33_LinkedList
{
	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		
		ll.add("Vaibhav");
		ll.add(231);
		ll.add(67.80f);
		ll.add('C');
		ll.add(231);
		ll.add(null);
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.get(2));
		System.out.println(ll.size());
		System.out.println(ll.contains("vaibhav"));
		System.out.println(ll.isEmpty());
		System.out.println(ll);
		
		ll.add(2,87.90f);
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		ll.set(1, "Vaidya");
		System.out.println(ll);
		
		System.out.println("---Print LinkedList by using iterator Cursor---");
		  Iterator itr = ll.iterator();
//		  if (itr.hasNext())
//		  {
//			  itr.remove();
//			  System.out.println(itr);
//		  }
	//	  while(itr.hasNext())
//		  {
//			  System.out.println(itr.next());
//			 
//		  }
		  
//		  itr.remove();
//		  System.out.println(itr);
		  
		  
//		  System.out.println("---Print Linkedlist by using listIterator Cursor---");
//		 ListIterator litr = ll.listIterator();
//		 while(litr.hasNext())
//		 {
//			 System.out.println(litr.next());
//		 }
//		 
//		 System.out.println("---Print Linkedlist by using for loop---");
//		 for(int i=0;i<=ll.size()-1;i++)
//		 {
//			 System.out.println(ll.get(i));
//		 }
//		 
//		 System.out.println("---Print linkedlist by using for each---");
//		 for(Object s1:ll)
//		 {
//			 System.out.println(s1);
//		 }
//		 
	}
}
