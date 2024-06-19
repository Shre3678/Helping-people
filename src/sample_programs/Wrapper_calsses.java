package sample_programs;

public class Wrapper_calsses 
{

	public static void main(String[] args) 
	{
		
		int a=10; // a is primitive type variable
		//Integer a=100;// a is object type variable by using wrapper class of int data type
		Integer a_object=a;// here Integer is an wrapper calss, once you are using a is has to consider as a object
		System.out.println("Forward "+a);
		String b=a_object.toString();
		int len=b.length();
		String rev="";
		for(int i=0;i<len;i++)
		{
			rev=b.charAt(i)+rev;
		}
	System.out.println("Reverse "+ rev);
	}
	//hello bee

}
// the wrapper calsses, using this classes we can converting primitive type to object type is called as AUTOBOXING and as well as object to primitive is called as UNBOXING.

//USAGE 1: we can get methods
//int a=10;
//Integer a_object=a;// AUTOBOXING
// int a=a_object//UNBOXING
// each built-in datatype have a wrapper calss
//datatypes-----wrapper calsses
//int------Integer
//float----Float
//double---Double
//char------Character
//short-----Short
//long----Long
//boolean-Boolean

//USAGE 2: we can do using data conversion using wrapper calsses

//int to string----

//Integer.parseint()

//String to int-----

//String.valueOf(data);

// string to char --- not possible
//char to string =---possible