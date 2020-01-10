package assignment_3_51;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Assignment3_29 {

	public static void main(String[] args) {
/*		29) In a hashmap if key is odd then find average of value as integer
    		Example: h1={1:4,2:6,4:7,5:9}
        	Output = (4+9)/2
*/
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		String choice;
		int sum = 0, counter = 0;
		do 
		{
			System.out.println("Enter Roll No. and Marks of Students");
			hashmap.put(scanner.nextInt(), scanner.nextInt());
			System.out.println("Do you want add more value Press 'Y' for Yes and 'N' for No");
			choice = scanner.next();
		}while(choice.equalsIgnoreCase("Y"));
		System.out.println(hashmap);
		
		for(Entry<Integer, Integer> entry: hashmap.entrySet())
		{
			int key = entry.getKey();
			if(key % 2 != 0)
			{
				sum += entry.getValue();
				counter++;
			}			
		}
		System.out.println("Average of Odd Key Values: "+sum/counter);
		
		scanner.close();
	}

}
