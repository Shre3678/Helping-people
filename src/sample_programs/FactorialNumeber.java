package sample_programs;

public class FactorialNumeber {

	public static void main(String[] args) 
	{
		int number =5;
		
		long facvalue=1;
		
		for(int i=1;i<=5;i++)
		{
			
			facvalue =facvalue*i;
			
		}
		System.out.println("factorial values of 5 is"+ facvalue);

	}

}
