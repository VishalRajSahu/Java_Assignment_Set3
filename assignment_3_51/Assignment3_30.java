package assignment_3_51;

import java.util.Scanner;

public class Assignment3_30 {

	public static void main(String[] args) {
/*		30) Return 1 if the last & first characters of a string are equal else 
		    Return -1. Consider case.
		    Example: Input  = "this was great"
		        	 Output = 1
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String sentence = scanner.nextLine();
		int returns = 1;
		
		//Characters are case-sensitive.
		System.out.println("Case-Sensitive");
		if(sentence.charAt(0) == sentence.charAt(sentence.length()-1))
			System.out.println("Output: "+returns);
		else
			System.out.println("Output: "+-returns);
		
		//Characters are not case-sensitive.
		System.out.println("\nCase-Insensitive");
		String inSensitive = sentence.toLowerCase();
		if(inSensitive.charAt(0) == inSensitive.charAt(inSensitive.length()-1))
			System.out.println("First and Last Characters are Same");
		else
			System.out.println("First and Last Characters are not Same");
		scanner.close();
	}
	
}
