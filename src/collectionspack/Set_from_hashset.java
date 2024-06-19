package collectionspack;

import java.util.Collections;
import java.util.HashSet;

public class Set_from_hashset {

	public static void main(String[] args) {

		HashSet f = new HashSet();
		/*f.add(null);
		f.add('f');
		f.add(2);
		f.add(0.4f);
		f.add(2);*/
		f.add("Shree");
		f.add("Honey");
		f.add("cg");
		f.add("ff");
		f.add("ee");
	//	Collections.sort(f);
	System.out.println(f);
	//Removing
	System.out.println(f.remove("Honey")); //it returns true
	System.out.println(f);
	//we can read one by one value
	for(Object d:f)
	{
		System.out.println(d);
	}
	
	

	}

}
