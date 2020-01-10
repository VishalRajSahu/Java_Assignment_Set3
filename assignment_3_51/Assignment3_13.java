package assignment_3_51;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment3_13 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
/*		13) Collect no’s from list1 which is not present in list2 
    		& Collect no’s from list2 which is not present in list1
    		and store it in output1[].
    		ex: input1={1,2,3,4}; input2={1,2,3,5}; output1={4,5};
*/
		
		List<Integer> firstList = new ArrayList<Integer>();
		List<Integer> secondList = new ArrayList<Integer>();
		
		System.out.println("Enter element for First List");
		addElement(firstList);
		System.out.println("Enter element for Second List");
		addElement(secondList);
		System.out.println(firstList);
		System.out.println(secondList);
		int output[]=commonSet(firstList,secondList);
	      for(int i:output)
	      System.out.print(i+" ");
		
	}
	public static void addElement(List<Integer> list)
	{
		String choice;
		do 
			{
				list.add(scanner.nextInt());			
				System.out.println("Do you want to add more elements, Press 'Y' for Yes & 'N' for No");
				choice = scanner.next();
			}while(choice.equalsIgnoreCase("Y"));
	}
	
	public static int[] commonSet(List<Integer> list1, List<Integer> list2) {
	      List<Integer> list3=new ArrayList<Integer>();
	      List<Integer> list4=new ArrayList<Integer>();
	     
	      list3.addAll(list1);
	      list4.addAll(list2);
	      list1.removeAll(list2);
	      list4.removeAll(list3);
	      list1.addAll(list4);
	     
	      int output[]=new int[list1.size()];
	      for(int j=0;j<output.length;j++)
	    	  output[j]=list1.get(j);
	      return output;
	}

}
