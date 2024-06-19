package sample_programs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner Sc= new Scanner (System.in);
		System.out.println("enter a word");
		String forw=Sc.next();
		String org_forward=forw;
		String rev="";
		
		int len=forw.length();
		for(int i=0;i<len;i++)
		{
			rev=forw.charAt(i)+rev;
		}
		System.out.println(rev);
		
		if(org_forward.equals(rev))
		{
			System.out.println("yes it is palindrome string");
		}
		else
		{
			System.out.println("its not");
		}

	}

}
