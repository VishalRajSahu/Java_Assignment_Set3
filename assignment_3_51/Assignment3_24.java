package assignment_3_51;

import java.util.Calendar;
import java.util.Scanner;

public class Assignment3_24 {

	public static void main(String[] args) {
/*		24) Input1  String DOJ = 2012;
	    	Input2  String Exp = 5;
	    IF EXPERIENCE IS GREATER THAN INPUT 2 THEN TRUE;
*/
		Scanner scanner = new Scanner(System.in);
		Calendar calender = Calendar.getInstance();
		boolean result = true; 
		
		System.out.println("Enter Year of Joining");
		String dateOfJoining = scanner.next();
		System.out.println("Enter Total Year of Experience");
		String Experience = scanner.next();
				
		int difference = calender.get(Calendar.YEAR)-Integer.parseInt(dateOfJoining);
			if(difference >= 0)
				{
					if(difference > Integer.parseInt(Experience))
						System.out.println("Experience is More than Input: "+result);
					else
						System.out.println("Experience is Less than or Equal to Input: "+!result);
				}
			else
				System.out.println("Date of Joining Year must be before of Current Year");
			
		scanner.close();
	}

}
