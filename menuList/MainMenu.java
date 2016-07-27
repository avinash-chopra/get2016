package session4;

/**
 * 
 * @author Avinash Chopra 
 * @Date 26 july 2016
 */
public class MainMenu {

	public static void main(String[] args) {

		// create the first menu
		Menu menu = new Menu();

		// ask the user to enter the menu items in main menu
		User.getUserInput(menu, "Main Menu");

		// initialize the stack and stack pointer to store menus
		Stack.InitializeStack();
		Stack.pointer = 0;

		// push the main menu into the stack
		Stack.menu[Stack.pointer] = menu;

		// display the menu to the user
		new Menu().display(menu, 1);

	}

}
