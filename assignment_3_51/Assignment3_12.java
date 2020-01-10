package assignment_3_51;

import java.util.Scanner;

public class Assignment3_12 {

	public static void main(String[] args) {
/*		12) Input = ”Hello World”;  
 			output = “dello WorlH”.
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.nextLine();
		
		char[] charArray = string.toCharArray();
		char first = charArray[0];
		charArray[0] = charArray[charArray.length -1];
		charArray[charArray.length -1] = first;
		for(int i=0; i<string.length(); i++)
			System.out.print(charArray[i]);
				
		scanner.close();
	}

}
