package Logical_Programmes;

public class Reverse_StringWithItsCharater 
{
	public static void main(String[] args) 
	{
		String str = "I am an Automation Engineer";
		String[] a = str.split("");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
			
			
		}
		System.out.println();
		
		for(String b:a)
		{
			
			for(int i=b.length()-1;i>=0;i--)
			{
				
				char reverseString = b.charAt(i);
				System.out.print(reverseString +"");
			}
		}
			
		
	}
}
