package Java;

public class Reverse_String {

	public static void main(String[] args) 
	{
		
	String a= "Hai";
	String rev="";
	for(int i=0;i<a.length();i++)
	{
		rev= a.charAt(i)+rev;
		
	}
	System.out.println(rev);
	}

}
