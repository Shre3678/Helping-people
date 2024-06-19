package sample_programs;

import java.util.Random;

public class MixTwoStringfromreverseorder 
{

	public static void main(String[] args) 
	{
		
		String a="Srini";
		String b="123";
		 
		String c=a.substring(4, 5)+b.substring(2,3)+a.substring(3,4)
		+b.substring(1,2)+a.substring(2,3)+b.substring(0, 1)+a.substring(1, 2)+a.substring(0,1);

		System.out.println(c);
		
		//Random ran= new Random();
		
		//System.out.println(ran.nextInt(1000));
		
	}

}
