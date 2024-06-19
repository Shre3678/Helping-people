package sample_programs;

public class CountNumberInADigit {

	public static void main(String[] args) 
	{
		int number=123456;
		int countingdigits=0;
		
		while(number>0)
		{
			number= number/10;
			countingdigits++;
			
		}
		System.out.println(countingdigits);

	}

}
