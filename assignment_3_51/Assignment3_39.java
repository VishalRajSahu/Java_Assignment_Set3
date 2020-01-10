package assignment_3_51;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment3_39 {

	public static void main(String[] args) {
/*		39) Input  = "the sun raises in the east";
	        Output = raises;
	    			 count no vowels in each word and print the word which has max
	    			 no of vowels if two word has max no of vowel print the first one
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String sentence = scanner.nextLine();
		StringTokenizer strTokens = new StringTokenizer(sentence);
		int vowel_count, max = 0;
		String max_word = "";
		while(strTokens.hasMoreTokens())
		{
			vowel_count = 0;
			String word = strTokens.nextToken();
			for(int i=0; i<word.length(); i++)
			{
				if((word.charAt(i) == 'a' || word.charAt(i) == 'A')
						|| word.charAt(i) == 'e' || word.charAt(i) == 'E'
								|| word.charAt(i) == 'i' || word.charAt(i) == 'I'
										|| word.charAt(i) == 'o' || word.charAt(i) == 'O'
												|| word.charAt(i) == 'u' || word.charAt(i) == 'U')
					vowel_count++;
			}
			if(max < vowel_count)
			{
				max = vowel_count;
				max_word = word;
			}
		}
		System.out.println("Output: \nMaximum No. of Vowels: "+max+"\nWord consists of Max Vowels: "+max_word);
		
		scanner.close();
	}

}
