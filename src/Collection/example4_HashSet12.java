package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class example4_HashSet12 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("Vikas");
		al.add(345);
		al.add(null);
		al.add(345);
		al.add('G');
		al.add(null);
		
		System.out.println(al);
		HashSet hs=new HashSet(al);
		System.out.println(hs);
		
		
		
	}
}
