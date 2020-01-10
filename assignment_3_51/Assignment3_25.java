package assignment_3_51;

import java.util.Scanner;

public class Assignment3_25 {

	public static void main(String[] args) {
/*		25) Input string = "hello", 
 			Input int  n = 2
			Output: lolo
*/
		Scanner scanner = new Scanner(System.in);
		StringBuffer strBuffer = new StringBuffer();
		
		System.out.println("Enter a String");
		String inputString = scanner.next();
		System.out.println("Enter a Number");
		int inputInt = scanner.nextInt();
				
		for(int i=0; i<inputInt; i++)
		strBuffer.append(inputString, inputString.length()-inputInt, inputString.length());
		
		System.out.println(strBuffer);
		
		scanner.close();
	}
}

