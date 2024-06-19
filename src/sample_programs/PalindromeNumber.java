package sample_programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ");
		int a=sc.nextInt();
		int org_forw=a;
		int rev=0;
		
		while(a!=0)
		{
			rev= rev*10+a%10;
			a=a/10;
		}
		System.out.println(rev);
		
		if(org_forw==rev)
		{
			System.out.println("yes it is palindrome");
		}
		else
			System.out.println("no its not");
		
		
	}

}
