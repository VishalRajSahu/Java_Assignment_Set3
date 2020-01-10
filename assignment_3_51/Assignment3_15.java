package assignment_3_51;

import java.util.Scanner;

public class Assignment3_15 {

	public static void main(String[] args) {
/*		15) count the number of words in the string
    		Input string = "i work in cognizant.";
    		output = 4;
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String ");
		String string = scanner.nextLine();
		int counter = 1;
		for(int i=0; i<string.length(); i++)
		{
			if(string.charAt(i) == ' ')
				counter++;
		}
		System.out.println("Number of Words in String: "+counter);
		scanner.close();
	}
}
