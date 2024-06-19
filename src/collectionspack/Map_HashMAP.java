package collectionspack;

import java.util.HashMap;

public class Map_HashMAP 
{

	public static void main(String[] args) 
	{
		
		// Declaration of HashMAP
		
		HashMap<Integer,String> Hm= new HashMap<Integer,String>();
		
		// add the element pair to the HashMap, here we have store like key and value (Key, value)
		
		Hm.put(105, "Jack");
		Hm.put(102, "Selena");
		Hm.put(null, null);
		Hm.put(103, "Elena");
		Hm.put(104, "Zyan");
		
		System.out.println(Hm);
		
		//remove a specific element pair
		Hm.remove(103);
		System.out.println(Hm);
		
		//Print only keys
		
		System.out.println(Hm.keySet());
		//print specific value
		
		System.out.println(Hm.get(102));
		
		// print the one by onevalues
		
		for (Object a:Hm.keySet())
		{
			System.out.println(Hm.get(a));
		}
		//print the size
		
		System.out.println(Hm.size());
		
		//clear the hashmap
		
		Hm.clear();
		System.out.println(Hm);

	}

}
