package sample_programs;

public class HowToRemoveJunkFromString 
{

	public static void main(String[] args) 
	{
		
         String orf=" Hello ^$*&^@() Morning 143@$^%";
         
         String removed_junk=orf.replaceAll("[^a-zA-Z0-9]", "");
         
         System.out.println(removed_junk);


	}

}
