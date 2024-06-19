package sample_programs;

import java.util.Arrays;

public class HowTOReversewordsInAString 
{

	public static void main(String[] args) 
	{
		
		//Approach 1
		
		/* String org_str="Good Morning";
		String rev_str="";
		String[] words=org_str.split(" ");
		System.out.println("Orginal String: " + org_str);
		//System.out.println("After spliting "+Arrays.toString(words));
		//System.out.println(words.length);
		
		for(String w:words)
		{
			String rev_word="";	
			

			
		    int words_len=w.length();
		
	//	System.out.println("This is length of word by word "  +words_len);
		
		for(int i=0;i<words_len;i++)
		{
			
			rev_word=w.charAt(i)+rev_word;
		}
		rev_str=rev_str+rev_word+ " ";
		
	}
		System.out.println("After Reverse String: " + rev_str);   */
		
		//Approach(2)
		
		String org_str="Welcome to java";
		String[] words= org_str.split(" ");
		
		String rev_words="";
		
		for(String w: words) 
		{
		
		StringBuffer SB= new StringBuffer(w);
		
		SB.reverse();
		
		rev_words=rev_words+SB.toString()+" ";
		}
		System.out.println(rev_words);
		
	}
	}
