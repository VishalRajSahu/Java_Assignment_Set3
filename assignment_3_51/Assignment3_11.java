package assignment_3_51;

import java.util.Scanner;

public class Assignment3_11 {

	public static void main(String[] args) {
/*			11) Input = "hello"
			    Output= "hlo"; Alternative positions...
*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.next();
		String outputString = "";
		for(int i=0; i<string.length();  )
		{
			outputString += string.charAt(i);
			i += 2;
		}
		System.out.println("Output String (Alternate Characters): "+outputString);
		scanner.close();
	}

}
