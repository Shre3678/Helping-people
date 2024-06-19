package sample_programs;

public class SumOfArrayElements {

	public static void main(String[] args) 
	
	{
		
	int a[]= {1,2,3,4,5};
	int sum =0;
	
	//approach 1
//	for(int i=0;i<a.length;i++)
	//{
		//sum=sum+a[i];
	//}
	//approach 2 enhanced for loop
	
	for(int values:a)
	{
		sum=sum+values;
	}
	
System.out.println(sum);
	}

}
