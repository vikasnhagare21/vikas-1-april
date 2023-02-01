package Logical_Programmes;

public class example6_Imp_Reverse_Number_without_String_Function 
{
	public static void main(String[] args) 
	{
		int num=12345678;
		int revNum= 0;
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			revNum=revNum *10+rem;
		}
		System.out.println(revNum);
	}
}
