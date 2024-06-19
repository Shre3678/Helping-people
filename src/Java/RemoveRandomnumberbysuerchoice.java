package Java;

import java.util.Scanner;

public class RemoveRandomnumberbysuerchoice 
{

	public static void main(String[] args) 
	{
		
		
		int a[]= {1,2,3,4,5,65,78,69};
		
		int b[] = new int [10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		int c=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(c!=a[i])
			{
				b[i]=a[i];
				System.out.print(b[i]+ " ");
			}
			
		}


	}

}
