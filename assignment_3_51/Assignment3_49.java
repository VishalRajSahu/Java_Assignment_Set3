package assignment_3_51;

import java.util.Scanner;

public class Assignment3_49 {

	public static void main(String[] args) {
/*		49) perfect no or not?
 			Example: 28 is a perfect number.
 			28 is divisible by 1, 2, 4, 7, 14 and 28 
 			The sum of these values are: 1 + 2 + 4 + 7 + 14 = 28 
 			(Remember, we have to exclude the number itself)
 			Perfect No. - 6, 28, 496, 8128 and 33550336.....
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = scanner.nextInt();
		int sum = 0;
		
		for(int i=1; i<=number/2; i++)
		{
			if(number % i == 0)
				sum += i;
		}
		if(sum == number)
			System.out.println("Number is Perfect Number: "+number);
		else
			System.out.println("Not a Perfect Number");
		
		scanner.close();
	}

}
