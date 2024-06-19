package collectionspack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class List_from_arraylist 
{

	public static void main(String[] args) 
	{
			
	ArrayList a= new ArrayList();
	a.add("abc");
    a.add("xall");
    a.add("dom");
    a.add(0.4f);
    a.add(2);
    a.add('e');
    a.add("f");
    a.add(null);
   Collections.sort(a);
    System.out.println(a);
	
		/*int[] arr = {1, 2, 2, 3, 4, 4, 5};

        // Use Java Streams to remove duplicates
        int[] uniqueArray = Arrays.stream(arr).distinct().toArray();

        // Print the unique elements
        for (int value:uniqueArray) {
            System.out.println(value);
        }*/
		
	}

}
