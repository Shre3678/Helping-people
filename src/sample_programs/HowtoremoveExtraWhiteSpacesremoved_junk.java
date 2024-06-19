package sample_programs;

public class HowtoremoveExtraWhiteSpacesremoved_junk 

{
      public static void main(String[] args) 
      {
    	  String str= "   Hello   Morning   ";
    	  
    	  System.out.println(str.trim()); // it removes spaces at string string and ending Stirng 
    	  System.out.println(str.replaceAll("\\s", "")); //it removes all space
	
      }
}
