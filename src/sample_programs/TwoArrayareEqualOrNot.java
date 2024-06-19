package sample_programs;

import java.util.Arrays;

public class TwoArrayareEqualOrNot 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,8,5};
		
		//approach 1
		
		boolean status=Arrays.equals(a, b);
		System.out.println(status);//if equal it return true otherwise false
		
	   if(status==true)
		{
			System.out.println("arrays are equal");
		}
		else
		{
			System.out.println("arrays are not equal");
		}
		
		///approach 2
	   
	   for(int i=0;i<a.length;i++)
	   
		   if(a[i]==b[i])
	   
		   {
			   System.out.println("are equal");
		   
		   if(a[i]!=b[i])		   
		   {
			   System.out.println("not eqaul");
		   
		   }
		   
	   }
	   }	
		
	   }
	   
	


