package assignment_3_51;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment3_17 {

	public static void main(String[] args) {
/*		17) input-- String input1="AAA/abb/CCC"
			    char input2='/'
			    output-- String[] output1;
			    output1[]={"aaa","bba","ccc"};

			    operation-- get the strings from input1  using stringtokenizer
			                reverse each string
			                then to lower case
			                finally store it in output1[] string array
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String in format AAA/abb/CCC");
		String firstInput = scanner.next();
		System.out.println("Enter a char(/) to split the First String");
		String secondInput = scanner.next();
		StringTokenizer stringTokens = new StringTokenizer(firstInput,secondInput); 
		String strReversed [] = new String[stringTokens.countTokens()];
		int index = 0;
		while (stringTokens.hasMoreTokens())
		{
			String word = stringTokens.nextToken();
			String reverseWord = "";
				
			for(int j = word.length()-1; j >= 0; j--)
					reverseWord += word.charAt(j);
			
			reverseWord = reverseWord.toLowerCase();
			strReversed[index] = reverseWord;
						index++;
		}
		for(int i=0; i<index; i++)
		System.out.print(strReversed[i]+" ");

		scanner.close();
	}

}
