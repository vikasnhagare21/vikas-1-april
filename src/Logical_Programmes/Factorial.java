package Logical_Programmes;

public class Factorial 
{
	public static void main(String[] args)
	{
		int num =10,fact =1;
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of num" + "="+fact);
	}
}
