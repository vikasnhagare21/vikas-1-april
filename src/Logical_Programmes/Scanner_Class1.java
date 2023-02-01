package Logical_Programmes;

import java.util.Scanner;

public class Scanner_Class1
{
	public static void main(String[] args)
	{
		int num;
		System.out.println("Enter a number");
		Scanner a=new Scanner(System.in);
		num=a.nextInt();
		if(num%2==0)
		{
			System.out.println(num +" is even num");
		}
		else
		{
			System.out.println(num +" is odd num");
		}
	}
}
