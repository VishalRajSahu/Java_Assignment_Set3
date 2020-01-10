package assignment_3_51;

import java.util.Scanner;

public class Assignment3_40 {

	public static void main(String[] args) {
/*		40) String format : CTS-LLL-XXXX
    		ip1: CTS-hyd-1234
    		ip2: hyderabad
    		-> LLL must be first 3 letters of ip2.
    		-> XXXX must be a 4-digit number
*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First String in Format (CTS-LLL-XXXX)");
		String firstString = scanner.next();
		System.out.println("Enter the City String");
		String secondString = scanner.next();
		String stringArray [] = firstString.split("-");
		int flag = 0;
						
		if(stringArray[0].equals("CTS"))
			if(stringArray[1].equals(secondString.substring(0, 3)))
				{
					for(int i=0; i<stringArray[2].length(); i++)
					{
						if(stringArray[2].charAt(i) >= '0' && stringArray[2].charAt(i) <= '9')
								flag ++;
						else break;
					}
						if(flag == 4)
							System.out.println("Valid Input: String is in Format (CTS-LLL-XXXX)");
						else 
							System.out.println("Last Four Places must be digits");
				}
			else
				System.out.println("First input string does not matched with City String");
		else
			System.out.println("First three characters must be CTS");
							
		scanner.close();
	}

}
