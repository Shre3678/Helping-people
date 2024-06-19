package sample_programs;

public class RepeatedCharacterCountInAString {

    public static void main(String[] args) {
        String s1 = "Srinivasann";
        String s2 = s1.toLowerCase();
        int count = 0;

        for (int i = 0; i < s2.length(); i++) 
        {
            for (int j = i + 1; j < s2.length(); j++) 
            {
                if (s2.charAt(i) == (s2.charAt(j))) 
                {
                    count++;
                    char repeatedChar = s2.charAt(i);

                    // Print the repeated character count for each repetition

                    int count1 = 0;
                    for (int k = 0; k < s2.length(); k++) 
                    {
                        if (s2.charAt(i) == s2.charAt(k)) 
                        {
                            count1++;
                        }
                    }
                    
                    System.out.println("Character '" + repeatedChar + "' repeatedchar count: " + count1);
                }
            }
        }
    }

    }

