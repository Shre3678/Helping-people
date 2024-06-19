package sample_programs;

public class HowtoCountOccuranceOfaCharacterIna_String 
{

	public static void main(String[] args) 
	{
		String str= "Hello Good Morning";
		
		int with_o_len= str.length();
		
		String removing_O=str.replace("o", "");
		
		int without_o_len=removing_O.length();
		
		int Occ_char_O=with_o_len-without_o_len;
		
		System.out.println("occurance of character 'o' count is "+Occ_char_O);
		

	}

}
