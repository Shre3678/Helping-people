package sample_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ReverseString_UsingAArayList {

	public static void main(String[] args) {
		
		
		String word="Srinivas";
		
		char a[]=word.toCharArray();
		
		System.out.println(a);
		
		ArrayList revString= new ArrayList();

         for(char b:a)
        	 
         revString.add(b);
         
         System.out.println(revString);
         
         
         Collections.reverse(revString);
         
         Iterator loo=revString.listIterator();  
                 while(loo.hasNext())
                 
         System.out.print(loo.next());
                 
         
	}

}
