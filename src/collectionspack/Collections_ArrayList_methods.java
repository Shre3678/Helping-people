package collectionspack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Collections_ArrayList_methods 
{

	public static void main(String[] args) 
	{
		/*ArrayList AL=new ArrayList();
		
		AL.add("Welcome");
		AL.add(10);
		AL.add(10);
		AL.add(null);
		AL.add(null);
		AL.add(10.4);
		AL.add(true);
        
		//To print the array
		System.out.println(AL);
		// adding the Element a specific location
		AL.add(3, 10);
		System.out.println(AL);
		//Remove element form the existed array
		AL.remove(5); //have to pass the values by index way
		System.out.println(AL);
		//find the length of the arrray
		System.out.println(AL.size());
       //print the specific element
		
		System.out.println(AL.get(6)); // have to pass the values by index way
		
	// print one by one element from the array
		
		for(Object a:AL)
		{
			System.out.println(a);
		}*/
		
		String input = "Reverse a String";

        char[] str = input.toCharArray();

        List<Character> revString = new ArrayList<>();

        for (char c : str)

            revString.add(c);

        Collections.reverse(revString);

        ListIterator li = revString.listIterator();

        while (li.hasNext())

            System.out.print(li.next());
	}

}
