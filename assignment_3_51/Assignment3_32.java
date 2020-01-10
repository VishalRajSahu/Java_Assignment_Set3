package assignment_3_51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assignment3_32 {

	public static void main(String[] args) {
/*		32) i/p: Honesty is my best policy
    		o/p: Honesty
    		Return the maximum word length from the given string.
    		If there are two words of same length then,
    		return the word which comes first based on alphabetical order.
*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String sentence = scanner.nextLine();
		String [] stringArray = sentence.split(" ");
		int max = 0;
		ArrayList<String> maxWord = new ArrayList<String>(); 
		
		for(int i=0; i<stringArray.length; i++)
			{
				if(max <= stringArray[i].length())
					{
						maxWord.add(stringArray[i]);
						max = stringArray[i].length();
					}				
			}
		Collections.sort(maxWord);
		System.out.println(maxWord);
				
		scanner.close();
	}

}
