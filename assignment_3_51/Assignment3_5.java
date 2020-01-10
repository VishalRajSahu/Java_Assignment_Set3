package assignment_3_51;

import java.util.Scanner;

public class Assignment3_5 {

	public static void main(String[] args) {
/*		5) Square root calculation of
	   		((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2))
	   		o/p should be rounded of to int;
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Value of X1 & X2 AND Y1 & Y2");
		int X1, X2, Y1, Y2, sum = 0, squareRoot = 0;
		X1 = scanner.nextInt();
		X2 = scanner.nextInt();
		Y1 = scanner.nextInt();
		Y2 = scanner.nextInt();
		sum = ((X1+X2)*(X1+X2))+((Y1+Y2)*(Y1+Y2));
		squareRoot = (int) Math.sqrt(sum);
		
		System.out.println("Sum of function: ((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2)) = "+sum);
		System.out.println("Square Root: "+squareRoot);
				
		scanner.close();
	}
}