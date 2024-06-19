package collectionspack;

import java.util.Collections;
import java.util.LinkedList;

public class List_from_linkedlist {
public static void main(String[] args) {
	
	
	LinkedList c= new LinkedList();
	c.add("zee");
	c.add("Shree");
	c.add("Honey");
   /* c.add(1);
    c.add("Honey");
    c.add(5.6f);
    c.add(true);
    c.add(null);*/
    Collections.sort(c);
    System.out.println(c);
}
}
