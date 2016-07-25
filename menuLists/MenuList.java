package menuItemClassBased;

import java.util.ArrayList;
import java.util.List;

public class MenuList {
	
	ConsoleOperations consoleOperations  =  new ConsoleOperations();
	
	
	public void action(){

		try{
			
			
			System.out.println("1. Notes and Assignments");

			System.out.println("2. Session Feedback");

			System.out.println("3. Exit");
			
			List<MenuList> menu = new ArrayList<MenuList>();
			
			menu.add(0, new NotesAndAssignments());
			
			menu.add(1, new SessionFeedback());
			
			int selectedChoice = consoleOperations.getPositiveInteger("Please enter a valid choice");
			
			menu.get(selectedChoice-1).action();

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
			
			(new MenuList()).action();
		}

	}
}