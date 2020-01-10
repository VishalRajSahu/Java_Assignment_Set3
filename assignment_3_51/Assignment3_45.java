package assignment_3_51;

import java.util.Scanner;

public class Assignment3_45 {

	public static void main(String[] args) {
/*		45) Getting the first and last n letters from a word where wordlength > 2n.
    		Example: Input : California, 3.
        			 Output: Calnia.
*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Values in form (String str, int n)");
		System.out.println("Enter a String ");
		String string = scanner.next();
		System.out.println("Enter the value of 'n' ");
		int number = scanner.nextInt();
		
		if(string.length() > 2*number)
			firstNlast(string, number);
		else
			System.out.println("Entered String Length is not greater than 2*n");
		
		scanner.close();
	}

	public static void firstNlast(String string, int number)
	{
		/*First Method
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(string.substring(0, number));
		strBuffer.append(string.substring(string.length()-number, string.length()));
		System.out.println(strBuffer);
		*/
		
		/*Second Method
		StringBuffer strBuffer = new StringBuffer(string);
		strBuffer.delete(number, string.length()-number);
		System.out.println(strBuffer);
		*/
		
		//Third Method
		String outputStr = "";
		for(int i=0; i<string.length(); i++)
		{
			if(i<number)
				outputStr += string.charAt(i);
			if(i >= string.length()-number && i < string.length())
				outputStr += string.charAt(i);
		}
		System.out.println(outputStr);
	}
}
