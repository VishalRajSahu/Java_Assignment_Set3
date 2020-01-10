package assignment_3_51;

import java.util.HashMap;
import java.util.Map.Entry;

import java.util.Scanner;

public class Assignment3_6 {

	public static void main(String[] args) {
/*		6) I/P 1 = hashmap<String String>{"ram:hari","cisco:barfi","honeywell:cs","cts:hari"};
		   I/P 2 = "hari";
		   O/P string[]={"ram","cts"};
*/
		
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> company = new HashMap<String, String>();
		String choice;
		int i = 0, size = 0;
		do
		{
			System.out.println("Enter Key and Value of Employee (Key = Company Name & Value Employee Name)");
				company.put(scanner.next(), scanner.next());
				size++;
			System.out.println("Do You Want to Add More Records (Press 'Y' for Yes and 'N' for No)");
				choice = scanner.next();
		}while(choice.equalsIgnoreCase("Y"));
		
		System.out.println(company);
		System.out.println("Enter the Name of Employee to find Company Name");
		String empName = scanner.next();
		String companyArray[] = new String[size] ;
		for (Entry<String, String> entry : company.entrySet()) 
			{ 
            	if (entry.getValue().equals(empName)) 
            		{
            			companyArray[i] = entry.getKey();
            			i++;
            		}
            }
		
		for(int j=0; j<i; j++)
			System.out.println(companyArray[j]);
		scanner.close();
	}
}