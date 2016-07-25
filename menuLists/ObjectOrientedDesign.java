package menuItemClassBased;

import java.util.ArrayList;
import java.util.List;

public class ObjectOrientedDesign extends NotesAndAssignments {
	
	ConsoleOperations consoleOperations = new ConsoleOperations();

	public void action(){
		
		try{

		System.out.println("1. OOP Session 1");

		System.out.println("2. OOP Session 2");
		
		System.out.println("3. Back");
		
		ObjectOrientedDesign objectOrientedDesign = new ObjectOrientedDesign();
		
		List<ObjectOrientedDesign> objectOrientedList = new ArrayList<ObjectOrientedDesign>();
		
		int selectedChoice = consoleOperations.getPositiveInteger("Please enter valid input");
		
		objectOrientedList.add(0,new OOP_Session_1());
		
		objectOrientedList.add(1,new OOP_Session_2());
		
		objectOrientedList.get(selectedChoice-1).action();
		
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
			
		}
	}
}