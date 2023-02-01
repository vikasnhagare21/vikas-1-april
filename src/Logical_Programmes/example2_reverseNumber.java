package Logical_Programmes;

public class example2_reverseNumber
{
	public static void main(String[] args) 
	{
		int org=123456789;
		String orgNum=Integer.toString(org);
		String rev="";
		for(int i=orgNum.length()-1;i>=0;i--)
		{
			rev=rev+ orgNum.charAt(i);
		}
		int revNum=Integer.parseInt(rev);
		System.out.println(revNum);
	}
}
