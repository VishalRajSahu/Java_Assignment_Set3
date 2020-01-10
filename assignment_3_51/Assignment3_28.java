package assignment_3_51;

import java.util.Scanner;

public class Assignment3_28 {
	
	public static void main(String[] args) {
		
/*		28) Pan Card Number Validation:
		    all letters should be in caps,should be of 8 chars.
		    first three letters must be alphabets.
		    next 4 letters should be digits and last letter should be an alphabet
*/	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Pan Card Number");
		String panCard = scanner.next();
		int caps = 0, digit = 0;
		
		for(int i=0; i<panCard.length(); i++)
		{
			if(i<3 || i==panCard.length()-1)
			{
				if (panCard.charAt(i) >= 'A' && panCard.charAt(i) <= 'Z')
					caps++;
			}
			else
			{
				if (panCard.charAt(i) >= '0' && panCard.charAt(i) <= '9')
					digit++;
			}
		}
		if(caps == 4 && digit == 4)
			System.out.println("Valid Pan Card Number");
		else
			System.out.println("Invalid Pan Card Number");	
				
		scanner.close();
	}
}
