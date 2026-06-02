//Factorial using Recursion
import java.util.Scanner;
public class Factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=fact(n);
		System.out.println("Factorial of "+n+" is:"+res);
	}
	public static int fact(int bhavya){
		if(bhavya==0||bhavya==1)
		{
			return 1;
		}
			else
			{
				return bhavya*fact(bhavya-1);
			}
		}
	}


	