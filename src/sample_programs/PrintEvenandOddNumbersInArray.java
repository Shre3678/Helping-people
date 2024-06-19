package sample_programs;

public class PrintEvenandOddNumbersInArray 
{

	public static void main(String[] args) 
	{
	
		
		int a[]= {2,4,3,5,7,8};
		int evens=0;
		int odd=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+ " even");
				evens++;
			}
			
			if(a[i]%2!=0)
			{
			// we can use both above 1ith line nad else
			//else
				//{
				System.out.println(a[i]+ " odd");
				odd++;
			}
		}
	}

}
