package Logical_Programmes;

import java.util.Scanner;

public class Scanner_Class2 
{
	public static void main(String[] args)
	{
		int a,b,c;
		
		System.out.println("Enter two int number");
		Scanner x=new Scanner(System.in);
		a=x.nextInt();
		b=x.nextInt();
		c=a+b;
		System.out.println("Sum="+c);
	}
}
