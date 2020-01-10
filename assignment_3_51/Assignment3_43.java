package assignment_3_51;

import java.util.Scanner;

public class Assignment3_43 {

	public static void main(String[] args) {
/*		43) Color Code Validation:
				String should starts with the Character '#'.
				Length of String is 7. 
				It should contain 6 Characters after '#' Symbol.
				It should contain Characters Between 'A-F' and Digits '0-9'.
				if String is acceptable then Output = 1
				else  Output = -1; 
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Color Code Validation: Guidlines\n1. String should starts with the Character '#'.\n2. Length of String is 7.\n3. It should contain 6 Characters after '#' Symbol.\n4. It should contain Characters Between 'A-F' and Digits '0-9'.");
		String colorCode = scanner.next();
		boolean output = true;
		int counter_Alfa = 0, counter_Digit = 0;
		if(colorCode.startsWith("#"))
		{
			if(colorCode.length() == 7)
			{
				for(int i=1; i<colorCode.length(); i++)
				{
					if((colorCode.charAt(i) >= 'A' && colorCode.charAt(i) <= 'F')
							|| (colorCode.charAt(i) >='a' && colorCode.charAt(i) <='f'))
						counter_Alfa++;
					else if(colorCode.charAt(i) >= '0' && colorCode.charAt(i) <= '9')
						counter_Digit++;
					else
						{
							System.out.println("last 6 characters must be in between 'A-F' and Digits '0-9'");
							break;
						}
				}
				
			}
			else
				System.out.println("Color Code must have 7 characters");
		}
		else
			System.out.println("Color Code must starts with # ");
		
		if(counter_Alfa >= 1 && counter_Digit >= 1 && counter_Alfa+counter_Digit == 6)
			System.out.println("Color Code is Valid ---> "+output);
		else
			System.out.println("Color Code is Invalid ---> "+!output);
		
		scanner.close();
	}

}
