package sample_programs;

public class countsumofthenumber 
{
public static void main(String[] args) 
{
	int num =1234;
	int sum=0;
	
	while(num>0)
	{
		sum=sum+num%10;
		System.out.println(sum);
		num=num/10;
		System.out.println(num);
	}
 	System.out.println(sum);
}
}
