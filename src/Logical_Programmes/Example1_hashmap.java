package Logical_Programmes;

import java.util.HashMap;
import java.util.Set;

import org.checkerframework.checker.units.qual.mPERs;

public class Example1_hashmap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> mp=new HashMap<Integer,String>();
		mp.put(null, "Vikas");
		mp.put(101, "Vicky");
		mp.put(102, "Vijay");
		mp.put(103, null);
		mp.put(105, "mahesh");
		mp.put(102, "Jaiswal");
		
		System.out.println(mp);
		System.out.println(mp.containsKey(102));
		System.out.println(mp.get(101));
		Set<Integer> allKeys = mp.keySet();
		for(Integer s1:allKeys)
		{
			System.out.println(s1);
		}
		System.out.println("------------------------");
		for(Integer s1:allKeys)
		{
			System.out.println(mp.get(s1));
		}
		System.out.println("------------------------");

		for(Integer s1:allKeys)
		{
			System.out.println(s1+" : "+mp.get(s1));
		}
	}
}
