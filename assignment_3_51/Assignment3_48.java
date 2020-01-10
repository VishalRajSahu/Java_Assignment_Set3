package assignment_3_51;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Assignment3_48 implements ActionListener{
	
	public static void main(String[] args) {
		/*		48) Leap year or not using API?
		*/		
					
					Assignment3_48 object = new Assignment3_48();
					Frame frame = new Frame();
					frame.add(button);
					frame.add(year);
					frame.add(text);
					frame.add(result);
					frame.add(resultLbl);
					frame.setSize(400,400);  
					frame.setLayout(null);  
					frame.setVisible(true);
					System.out.println("Object: "+object);
		}
		
	static TextField text = new TextField();
	static Button button = new Button("Check");
	static TextField result = new TextField();
	static Label year = new Label("Enter Year: "); 
	static Label resultLbl = new Label("Result: ");
	
	public Assignment3_48()
	{
		year.setBounds(50,100, 80,30); 
		text.setBounds(150,100, 200,30);
		resultLbl.setBounds(50,140, 80,30);
		result.setBounds(150,140, 200,30);
		button.setBounds(100, 180, 100, 30);
		button.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource()==button)
			{
				int textYear = Integer.parseInt(text.getText());
				if(textYear % 4 == 0 && textYear % 100 == 0 || textYear % 400 == 0)
					result.setText("Entered Year is Leap Year");
				else
					result.setText("Entered Year is Not Leap Year");
			}
	}
	
}
