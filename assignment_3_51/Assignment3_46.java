package assignment_3_51;

import java.util.Scanner;

public class Assignment3_46 {

	public static void main(String[] args) {
/*		46) input1 = "aBrd";
	    	input2 = "aqrbA";
	    	input3 = 2;
	    	output = boolean true;
	    	2nd char of ip1 and 2nd last char of ip2 show be equal
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String");
		String firstString = scanner.next();
		System.out.println("Enter Second String ");
		String secondString = scanner.next();
		System.out.println("Enter the index of String");
		int number = scanner.nextInt();
		boolean output = true;
		//Using Extra Variables for String Function
//		String firstIndex = Character.toString(firstString.charAt(number-1));
//		String lastIndex = Character.toString(secondString.charAt(secondString.length()-number));
//		if(firstIndex.equalsIgnoreCase(lastIndex))
//			System.out.println(output);
//		else
//			System.out.println(!output);
		
		//Using Type Casting
		if((int)firstString.charAt(number-1) == (int)secondString.charAt(secondString.length()-number)+32
		|| (int)firstString.charAt(number-1) == (int)secondString.charAt(secondString.length()-number)-32
		|| (int)firstString.charAt(number-1) == (int)secondString.charAt(secondString.length()-number))
			System.out.println(output);
		else
			System.out.println(!output);
		
		
		scanner.close();
	}

}
