package Logical_Programmes;

public class example5_splitPara 
{
	public static void main(String[] args)
	{
		String s1="My name is abc";
		String [] ar=s1.split(" ");
				System.out.println(ar[2]);
		System.out.println("------------------");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
