package Logical_Programmes;

public class example3_reverseNumber 
{
	public static void main(String[] args) 
	{
		int orgNum=12345684;
		String org=Integer.toString(orgNum);
		String rev="";
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		int reNum=Integer.parseInt(rev);
		System.out.println(reNum);
	}
}
