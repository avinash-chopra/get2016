package menuItemClassBased;

import java.util.ArrayList;
import java.util.List;

public class NotesAndAssignments extends MenuList {
	
	ConsoleOperations consoleOperations = new ConsoleOperations();
	
	
	public void action(){
		try{	
		System.out.println("1. Programming Fundamentals");
		
		System.out.println("2. Object Oriented Design");
		
		System.out.println("3. Back");
		
		NotesAndAssignments notesAndAssignments = new NotesAndAssignments();
		
		List<NotesAndAssignments> notesList = new ArrayList<NotesAndAssignments>();
		
		notesList.add(0,new ProgrammingFundamentals());
		
		notesList.add(1,new ObjectOrientedDesign());
		
		int selectedChoice = consoleOperations.getPositiveInteger("Please enter valid input");
		
		notesList.get(selectedChoice-1).action();
		
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
			
			(new NotesAndAssignments()).action();
		}
	}	
}