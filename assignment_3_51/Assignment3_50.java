package assignment_3_51;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Assignment3_50 {

	public static void main(String[] args) {
/*		50) HashMap<String,String> input1={“mouse”:”100.2”,”speaker”:”500.6”,”Monitor”:”2000.23”};
	    String[] input2={“speaker”,”mouse”};
	    Float output=600.80(500.6+100.2);
*/
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> inputHMap = new HashMap<String, String>();
		DecimalFormat decimalFormat = new DecimalFormat();
		decimalFormat.setPositivePrefix("₹ ");
		decimalFormat.setMinimumFractionDigits(2);
		String choice;
		float sum = 0; 
		int counter = 0, index = 0;
		do 
		{
			System.out.println("Computer Accessories & Peripherals Devices and Prices");
			inputHMap.put(scanner.next(), scanner.next());
			counter++; //counter to define String array size for Cart
			System.out.println("Do you want add more value Press 'Y' for Yes and 'N' for No");
			choice = scanner.next();
		}while(choice.equalsIgnoreCase("Y"));
		System.out.println(inputHMap);
		
		//String Array Cart to Store Cart Items
		String[] cart = new String[counter];
		do 
		{
			System.out.println("Add items on Cart");
			cart[index] = scanner.next();
			index++;
			System.out.println("Do you want add more items on cart Press 'Y' for Yes and 'N' for No");
			choice = scanner.next();
		}while(choice.equalsIgnoreCase("Y"));
		
		
		for(int j=0; j<index; j++)
		{
			if(inputHMap.containsKey(cart[j]))
			{
				for(Entry<String, String> entry: inputHMap.entrySet())
				{
					String key = entry.getKey();
					if(key.equals(cart[j]))
					{
						sum += Float.parseFloat(entry.getValue());
					}
				}
			}			
		}
		System.out.println("Total Cart Value: "+decimalFormat.format(sum));
		
		
		scanner.close();

	}

}
