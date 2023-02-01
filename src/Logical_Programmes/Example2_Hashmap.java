package Logical_Programmes;

import java.util.HashMap;
import java.util.Set;

public class Example2_Hashmap 
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> mp=new HashMap<Integer,String>();
		mp.put(101, "Vikas");
		mp.put(102, "Vicky");
		mp.put(103, null);
		mp.put(null, "Vijay");
		mp.put(105, null);
		
		System.out.println(mp);
		System.out.println(mp.containsKey(104));
		System.out.println(mp.get(102));
		Set<Integer> allKeys = mp.keySet();
		
		for(Integer s1:allKeys)
		{
			System.out.println(s1);
		}
		for(Integer s1:allKeys)
		{
			System.out.println(mp.get(s1));
		}
		for(Integer s1:allKeys)
		{
			System.out.println(s1+" : "+mp.get(s1));
		}
	}
}
