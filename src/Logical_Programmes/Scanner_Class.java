package Logical_Programmes;

import java.util.Scanner;

public class Scanner_Class 
{
	public static void main(String[] args)
	{
		int a,b,c;
		
		System.out.println("Enter Two int numbers");
		Scanner x=new Scanner(System.in);
		a=x.nextInt();
		b=x.nextInt();
		
		c=a+b;
		System.out.println("Sum="+c);
	}
}
