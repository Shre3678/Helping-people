package sample_programs;

import java.util.Scanner;

public class RevereANumber {

	public static void main(String[] args) 
	{
	  
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value :");
		int num=sc.nextInt();
		
		int rev = 0;
		
		// one approach with algorithm
		/*while(num!=0)
		{
			rev=rev*10+num%10; //to reverse
			num=num/10;    // to eliminate the last digit
		}*/
		
		
		// using StringBuffer
		
		//StringBuffer sb= new StringBuffer(String.valueOf(num));
		//StringBuffer rev1 =sb.reverse();
		
		
		
		//using StringBulider
		
		
		StringBuilder sbl= new StringBuilder();
		sbl.append(num);
		StringBuilder rev2= sbl.reverse();
		
		
	    System.out.println("reverse value " +rev2);
		//System.out.println(num);

	}

	}

