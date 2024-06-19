package sample_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AAA 
{

	public static void main(String[] args) 
	{
		//to remove duplicates strings
		String[] a= {"Java", "c", "Java"};
		
		
		Object[]b=Arrays.stream(a).distinct().toArray();
		System.out.println(Arrays.toString(b));
		
		// to remove duplicate numbers
		
		int[] z= {1,1,2,3,4,5};
		
		int[] r= Arrays.stream(z).distinct().toArray();
		
		for(int remove: r ) 
		{
		System.out.print(remove +" ");
		}
		
		//OR
		
		//System.out.println(Arrays.toString(r));
		
		
		
		ArrayList<Object> uinput=new ArrayList<Object>();

		for(int i=0;i<5;i++){

		Scanner sc=new Scanner(System.in);

		System.out.println("Please enter the name");

		uinput.add(sc.nextLine());

		}

		System.out.println("Now print the array : "+ uinput);
		
		//int[] store=uinput;
		
	//	int [] afterremoves=Arrays.stream(store).distinct().toArray();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	     //--------------------------------------------------------     
		//to reverse number
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		int forward=number;
		int reverse=0;
		while(number>0)
		{
			reverse=reverse*10+number%10;
			number=number/10;
		}
		System.out.println(reverse);
		//-----------------------------------------------------
		//Palindrome Number
		if(forward==reverse)
		{
			System.out.println("The Number is polindrome");
		}
		else
		{
			System.out.println("The Number is  not polindrome");
		}
		//---------------------------------------------------------------------
		//to reverse string
		System.out.println("Enter a word");
		String word=sc.next();
		String forw=word;
		int length=word.length();
		String rev="";
		for(int i=0;i<length;i++)
		{
			rev=word.charAt(i)+rev;
		}
		
		System.out.println(rev);
		//-----------------------------------------------------------------------
		//Palindrome Number
		if(forw.equals(rev))
		{
			System.out.println("The Word is polindrome");
		}
		else
		{
			System.out.println("The Word is  not polindrome");
		}
		//-----------------------------------------------------------
		
		//swapping with third varibale
		
		int aa=10;
		int bb=20;
		System.out.println(aa + " " + bb);
		int cc=aa;
		aa=bb;
		bb=cc;
		
		System.out.println(aa + " " + bb);
		
		// only two variables
		
		aa=aa+bb; // 10+20 30
		aa=aa-bb;//30-20 10
		bb=aa-bb; // 30-10 20
		
		 
		System.out.println(aa + " " + bb);
		
		
		
		
		

	}

}
