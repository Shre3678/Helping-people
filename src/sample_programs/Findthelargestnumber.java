package sample_programs;

import java.util.Scanner;

public class Findthelargestnumber {

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a= sc.nextInt();
        System.out.println("Enter b value");
        int b= sc.nextInt();
        System.out.println("Enter c value");
        int c= sc.nextInt();
        //approach 1
       /* if(a>b && a>c)
        {
        	System.out.println(a);
        }
        else if(b>a && b>c)
        {
        	System.out.println(b);
        }
        else
        {
        	System.out.println(c);
        }*/
        //approach 2
        int largest=a>b?a:b;// for two numbers
        int largest1=c>(a>b?a:b)?c:(a>b?a:b);//for three numbers
        System.out.println(largest1);

        
	}

}
