package sample_programs;

import java.util.Scanner;

public class HowtoCountLowercasesandUppercasesandSpacesInstring {

	public static void main(String[] args) {
		
		int count_uppers=0;
		int count_lowers=0;
		String sen="Good Morning"; 

		
		int org_len=sen.length();
		System.out.println("Length of the sen "+org_len);
		
String a=sen.replaceAll(" ", "");
int b=a.length();

int spaces_count=org_len-b;
System.out.println("the spaces are "+spaces_count);


String Uppercases=sen.replaceAll("[^A-Z]", "");
System.out.println("The Uppers letters are "+sen.replaceAll("[^A-Z]", ""));
int upper_len=Uppercases.length(); 
for(int i=0;i<upper_len;i++)
{
	count_uppers++;
}
System.out.println("The Upper letters are "+ count_uppers);

String lowercases=sen.replaceAll("[^a-z]", "");

int lower_len=lowercases.length();

System.out.println("The Lowers letters are "+ lowercases);
for(int i=0;i<lower_len;i++)
{
	count_lowers++;
}
System.out.println("The Lower letters are "+ count_lowers);

	}

}
