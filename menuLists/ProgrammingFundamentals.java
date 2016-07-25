package menuItemClassBased;


import java.util.ArrayList;
import java.util.List;

public class ProgrammingFundamentals extends NotesAndAssignments{

	public void action(){
		
		ConsoleOperations consoleOperations = new ConsoleOperations();

		System.out.println("1. PF Session 1");

		System.out.println("2. PF Session 2");

		System.out.println("3. Back");

		ProgrammingFundamentals programmingFundamentals = new ProgrammingFundamentals();

		List<ProgrammingFundamentals> programmingFundametalsList = new ArrayList<ProgrammingFundamentals>();

		int selectedChoice = consoleOperations.getPositiveInteger("Please enter valid input");

		programmingFundametalsList.add(0,new PF_Session_1());

		programmingFundametalsList.add(1,new PF_Session_2());

		programmingFundametalsList.get(selectedChoice-1).action();
	}
}
