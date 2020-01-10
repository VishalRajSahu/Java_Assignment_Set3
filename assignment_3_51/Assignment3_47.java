package assignment_3_51;

import java.util.Scanner;

public class Assignment3_47 {

	public static void main(String[] args) {
/*		47) Add elements of digits: 9999 
    		Output: 9+9+9+9 = 3+6 = 9;
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number (Upto 18 Digits)");
		long digit = scanner.nextLong();
				
		System.out.println(sumOfDigits(sumOfDigits(sumOfDigits(digit))));
		
		scanner.close();		
	}
	public static int sumOfDigits(long number)
	{
		int sum = 0;
			while(number != 0)
			{
				long remainder = number % 10;
				sum += remainder;
				number = number / 10;
			}
		return(sum);
	}
}
