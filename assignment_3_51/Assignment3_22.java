package assignment_3_51;

import java.util.Scanner;

public class Assignment3_22 {

	public static void main(String[] args) {
/*		22) Input -- String input  = "xaXafxsd"
			Output-- String output = "aXafsdxx"
			Operation-- remove the character "x"(only lower case) from string and place at the end
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.next();
		StringBuffer strBuffer = new StringBuffer();
		int counter = 0;
		
		for(int i=0; i<string.length(); i++)
		{
			if(string.charAt(i) != 'x')
				strBuffer.append(string.charAt(i));
			else
				counter++;
		}
		for(int i=0; i<counter; i++)
		strBuffer.append('x');
		
		System.out.println(strBuffer);
		scanner.close();		
	}

}
