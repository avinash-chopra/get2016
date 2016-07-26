package session4;

/**
 * 
 * @author Avinash
 * @Date 26 july 2016
 */
public class Stack {

	// a stack of menus
	static Menu[] menu;

	// stack pointer
	static int pointer;

	public Menu[] getMenu() {
		return menu;
	}

	public void setMenu(Menu[] menu) {
		Stack.menu = menu;
	}

	/**
	 * initializes the menu stack a capacity to hold 10 menus at a time
	 */
	public static void InitializeStack() {
		Stack.menu = new Menu[10];
		Stack.pointer = -1;
		for (int index = 0; index < 10; index++) {
			Stack.menu[index] = new Menu();
		}
	}

}
