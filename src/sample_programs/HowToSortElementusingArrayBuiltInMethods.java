package sample_programs;

import java.util.Arrays;
import java.util.Collections;

public class HowToSortElementusingArrayBuiltInMethods 
{

	public static void main(String[] args) 
	{
		int a[]= {5,6,4,7,8,3};
		
		System.out.println("before sorting " + Arrays.toString(a));
		
		
		//approach 1- using parallelsort method

		//Arrays.parallelSort(a);// sorting going here
		
        // Aprroach 2 -using sort		// indirectly its an forward order we can say
		
		Arrays.sort(a);
		System.out.println("after sorting " + Arrays.toString(a));
		
		
		// Reverse order Approach 1 using collections
		
		Integer b[]= {4,3,5,6,7};
		System.out.println("Forward order " + Arrays.toString(b));
		Arrays.sort(b, Collections.reverseOrder());
		
		System.out.println("Reverse order " + Arrays.toString(b));
		
		
		

	}

}
