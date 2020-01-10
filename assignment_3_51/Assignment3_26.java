package assignment_3_51;

import java.util.Scanner;

public class Assignment3_26 {

	public static void main(String[] args) {
/*		26) prove whether a number is ISBN number or not
    		input="0201103311"
    		ISBN number:  sum=0*10 +2*9+ 0*8 +1*7+ 1*6 +0*5+ 3*4 +3*3+ 1*2 +1*1
    		sum%11==0 then it is ISBN number
*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an ISBN Number of a Book");
		String bookISBN = scanner.next();
		int sum = 0, j = bookISBN.length(), k = j;
		
		//Printing of Calculation 0*10 +2*9+ 0*8 +1*7+......
		for(int i=0; i<bookISBN.length(); i++)
		{	
			System.out.print(Character.getNumericValue(bookISBN.charAt(i)) +"*"+ j );
			j--;
			if(i == bookISBN.length()-1)	break;	
			System.out.print(" + ");
		}
		
		//Calculate the sum
		System.out.println("\n\nSum of Reverse Index * Number");
		for(int i=0; i<bookISBN.length(); i++)
		{	
			sum += (k * Character.getNumericValue(bookISBN.charAt(i)));
			System.out.print(sum+" ");
			k--;
		}
		
		if(sum % 11 == 0)
			System.out.println("\n\nValid ISBN number of a Book");
		else
			System.out.println("\n\nInvalid ISBN number of a Book");
		scanner.close();
	}

}
