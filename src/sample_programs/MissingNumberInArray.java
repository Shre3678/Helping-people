package sample_programs;

public class MissingNumberInArray 
{

	public static void main(String[] args) 
	{
	
		
		int a[]= {1,2,3,5};
		int sum=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
         System.out.println("this is the sum of 'a' array " +sum);
         
         int sum1=0;
         for(int i=1;i<=5;i++)
         {
        	 sum1=sum1+i;
         }
         System.out.println("this is sum of 1 to 5 number "+sum1);
         
         System.out.println("This is the missing number in array " + (sum1-sum));
	}
	
      
}
