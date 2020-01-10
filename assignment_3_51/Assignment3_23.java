package assignment_3_51;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Assignment3_23 {

	public static void main(String[] args) {
/*		23) HashMap<String,Integer> Input = {“Vishal”:50,”Kumar”:70};
	    		if the mark is less than 60 then put the output in the
	    	HashMap<String,String> Output = {“Vishal”:”fail”,”Kumar”:”pass”}
*/
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> inputHM = new HashMap<String, Integer>();
		HashMap<String, String> outputHM = new HashMap<String, String>();
		String choice;
		do 
		{
			System.out.println("Enter Name and Marks of Students");
			inputHM.put(scanner.next(), scanner.nextInt());
			System.out.println("Do you want add more value Press 'Y' for Yes and 'N' for No");
			choice = scanner.next();
		}while(choice.equalsIgnoreCase("Y"));
		System.out.println(inputHM);
		
		for(Entry<String, Integer> entry: inputHM.entrySet())
		{
			String name = entry.getKey();
			int marks = entry.getValue();
			String result;
				if(marks >= 60)
					result = "Pass";
				else
					result = "Fail";
			outputHM.put(name, result);
		}
		System.out.println(outputHM);
		
		scanner.close();
	}

}
