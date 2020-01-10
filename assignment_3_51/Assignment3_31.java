package assignment_3_51;

import java.util.Scanner;

public class Assignment3_31 {

	public static void main(String[] args) {
/*		31) Concatenate two string if length of two string is equal.
    		if length of one string is greater, then remove the character from 
    		largest string and then add. The number of characters removed from 
    		largest string is equal to smallest string's length
    		for example: Input 1 = "hello";
                 		 Input 2 = "helloworld";
                 		 Output  = "worldhello";
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String");
		String firstString = scanner.next();
		System.out.println("Enter Second String");
		String secondtString = scanner.next();
		StringBuffer strBuffer = new StringBuffer();
		
		if(firstString.length() == secondtString.length())
			{
				System.out.println("\nBoth String Have Same Length");
				System.out.println(firstString.concat(secondtString));
			}
		else if (firstString.length() > secondtString.length())
			{
				System.out.println("\nFirst String is Larger Than Second String");
				strBuffer.append(firstString, secondtString.length(), firstString.length());
				System.out.println(strBuffer.append(secondtString));
			}
			else
				{
					System.out.println("\nSecond String is Larger Than First String");
					strBuffer.append(secondtString, firstString.length(), secondtString.length());
					System.out.println(strBuffer.append(firstString));
				}
		
		scanner.close();
	}

}
