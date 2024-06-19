package sample_programs;

public class CountEvenOddNumbersInANumber {

	public static void main(String[] args) 
	{
	int number=123456;
	int evens=0;
	int odds=0;
	
	while(number>0)
	{
		int reminder=number%10; //this gives extract the number like from 6 5 4 3 2 1 
		
		if(reminder%2==0) 
		{
			evens++;
		}
		else
		{
			odds++;
		}
		number=number/10;
		
	}
	System.out.println(evens);
	System.out.println(odds);
	
    }
}
