package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class example4_Hashset1
{
public static void main(String[] args) 
{
	ArrayList al=new ArrayList(12);
	
	al.add("rahul");
	al.add(100);
	al.add('A');
	al.add(65.5f);
	al.add(100);
	al.add(null);
	al.add(null);
	
	System.out.println(al);
	HashSet hs=new HashSet(al);
	System.out.println(hs);
}
}
