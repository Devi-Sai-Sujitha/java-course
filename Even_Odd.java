import java.util.*;
class Even_Odd
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		if((n&1)==0)
		{
			System.out.println(n+" is even");
		}
		else
		{
			System.out.println(n+" is odd");
		}
	}
}
