package assignment_3_51;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment3_51 {

	public static void main(String[] args) {
/*		51) Input = 845.69; output = 3:2;
	    	Input = 20.789; output = 2:3;
	    	Input = 20.0; 	 output = 2:1;  
	    	Output is in Hashmap format.
	    	Hint: count the no of digits.
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Decimal Number (Ex. 230.30)");
		String decimalNo = scanner.next();
		
		StringTokenizer strToken = new StringTokenizer(decimalNo, ".");
		int intPart = strToken.nextToken().length();
		int fractionPart = strToken.nextToken().length();
		
		System.out.println("Output: "+intPart+":"+fractionPart);
		scanner.close();
	}

}
