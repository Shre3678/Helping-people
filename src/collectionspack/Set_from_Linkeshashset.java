package collectionspack;

import java.util.Collections;
import java.util.LinkedHashSet;

public class Set_from_Linkeshashset {
public static void main(String[] args) {

	LinkedHashSet g = new LinkedHashSet();
	g.add(null);
	g.add("zee");
	g.add("Shree");
	g.add("Honey");
   g.add(1);
    g.add("Honey");
    g.add(5.6f);
    g.add(true);
   // g.add(1);
    g.add("fork");
    g.add('g');
    //Collections.sort(g);
	System.out.println(g);
	
}
}
