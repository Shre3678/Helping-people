package sample_programs;

import java.util.Random;

public class RandomNumbersANDStrings {

	public static void main(String[] args) 
	
	{
		//Approach 1 with Random class
		
		
		Random ran= new Random();
		System.out.println(ran.nextInt(3)); // here we have to pass parameter
		
		//Approach 2
		
        System.out.println(Math.random());
        
        // we need to add jars apache common.lang api
       // RandomStringUtils.RandomNumeric(10);
        //RandomStringUtils.RandomAlphabatic(10);// 
		
		
		
	}

}
