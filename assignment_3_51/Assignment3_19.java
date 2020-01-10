package assignment_3_51;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment3_19 {

	public static void main(String[] args) {
/*		input---input1 = 1;
        		input2 = 4;
        		input3 = 1;
		output = 4;
			operation--- print the element which is not repeated    
			if all the inputs are different sum all inputs
		input---input1 = 1;
        		input2 = 2;
        		input3 = 3;
		output = 6;
*/
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> inputList = new ArrayList<Integer>();
		int flag = 0, sum = 0, count = 0;
		String choice;
		do 
		{
			System.out.println("Enter an Integer Value");
			inputList.add(scanner.nextInt());
			System.out.println("Do you want add more value Press 'Y' for Yes and 'N' for No");
			choice = scanner.next();
		}while(choice.equalsIgnoreCase("Y"));
		
		System.out.println("List Elements: "+inputList);
		System.out.print("Non Repeated Elements: ");
		for(int i=0; i<inputList.size(); i++)
		{	flag = 0;
			for(int j=0; j<inputList.size(); j++)
			{
				if(i != j)
					if(inputList.get(i) == inputList.get(j))
					flag = 1;
			}
			if(flag==0)
				{
					System.out.print(inputList.get(i)+" ");
					count++;
				}
		}
		if(count == inputList.size())
			{
				for(int i=0; i<inputList.size(); i++)
					sum += inputList.get(i);
				System.out.println("\nAll are distinct elements: "+sum);
			}
		
		scanner.close();
	}

}
