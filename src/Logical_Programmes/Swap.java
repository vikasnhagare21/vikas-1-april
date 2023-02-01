package Logical_Programmes;

public class Swap 
{
	public static void swap1()
	{
		int a=10,b=20;
		
		System.out.println("Before Swapping");
		System.out.println("A = "+a+" "+"B = "+b);
		
		int c=a;
		a=b;
		b=c;
		
		System.out.println("After Swapping");
		System.out.println("A = "+a+" "+"B = "+b);
	}
	public static void swap2()
	{
		int a=10,b=20;
		System.out.println("Before swapping");
		System.out.println("A = "+a+" "+"B= "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping");
		System.out.println("A = "+a+" "+"B ="+b);
	}
	public static void main(String[] args)
	{
		swap2();
	}
}
