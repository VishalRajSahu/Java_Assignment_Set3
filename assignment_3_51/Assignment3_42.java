package assignment_3_51;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Assignment3_42 {

	public static void main(String[] args) {
/*		42) input is a map<Integer,Float> {1: 2.31, 2: 15.39, 3: 7.74, 4: 15.10}
	    		Get the even number from keys and find the average of values of these keys.
	    		Answer should be rounded to two numbers after decimal.
	    		Example:- The output number 15.2499999 should be 15.25
*/
		Scanner scanner = new Scanner(System.in);
		Map<Integer, Float> inputMap = new HashMap<Integer, Float>();
		DecimalFormat decimalFormat = new DecimalFormat();
		decimalFormat.setMaximumFractionDigits(2);
		String choice;
		float sum = 0; 
		int counter = 0;
		do 
		{
			System.out.println("Enter Roll No. and Marks of Students");
			inputMap.put(scanner.nextInt(), scanner.nextFloat());
			System.out.println("Do you want add more value Press 'Y' for Yes and 'N' for No");
			choice = scanner.next();
		}while(choice.equalsIgnoreCase("Y"));
		System.out.println(inputMap);
		
		for(Entry<Integer, Float> entry: inputMap.entrySet())
		{
			int key = entry.getKey();
			if(key % 2 == 0)
			{
				sum += entry.getValue();
				counter++;
			}			
		}
		//Using printf function
		System.out.printf("Output: Upto 2 decimal Place %.2f ",sum/counter);
		
		//Using Decimal Format Class
		System.out.println("\nOutput: Upto 2 decimal Place "+decimalFormat.format(sum/counter));
		scanner.close();
	}

}

/*          Note: Pattern Format for DecimalFormat Class
			Pattern			Number			Formatted String
			###.###			123.456			123.456
			###.#			123.456			123.5
			###,###.##		123456.789		123,456.79
			000.###			9.95			009.95
			##0.###			0.95			0.95
*/