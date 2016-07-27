package session4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Avinash Chopra
 * @Date 26 july 2016
 */
public class Menu {
	
	static final int TYPE_IS_NON_MENU = 0;// if the menu item does not contain
	// sub menu
static final int TYPE_IS_MENU = 1;// if the menu item contains sub menu
static final int TYPE_IS_BACK = 2;// if the menu item is to perform back
// operation
static final int TYPE_IS_STRING_INPUT = 3;// if the input to be checked is
		// for string type
static final int TYPE_IS_NUMBER_INPUT = 4;// if the input to be checked is
		// for integer type

	// menu can have multiple menu items
	private List<MenuItem> menuItems;

	/**
	 * Constructor-intializes the menuItems list
	 */
	public Menu() {
		this.menuItems = new ArrayList<MenuItem>();
	}

	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
	
	/**
	 * 
	 * @param menu
	 *            denotes the menu to be printed on the console
	 * @param level
	 *            denotes the level of the whole system
	 */
	public void display(Menu menu, int level) {
		try {
			List<MenuItem> menuItemList = menu.getMenuItems();
			int totalMenuItems = menuItemList.size();
			for (int index = 0; index < totalMenuItems; index++) {
				System.out.println((index + 1 + " ")
						+ menuItemList.get(index).getLabel());

			}
			int userInput = 0;
			String input = "";
			boolean toContinue = false;
			// take user input to perform action-move forward move backward or
			// exit
			while (!toContinue) {
				System.out.println("Please choose an option");
				input = new Scanner(System.in).next();
				toContinue = Menu.isInputValid(input,
						Menu.TYPE_IS_NUMBER_INPUT, totalMenuItems);
			}
			userInput = Integer.parseInt(input);
			if (menuItemList.get(userInput - 1).getType() == Menu.TYPE_IS_MENU) {
				Stack.pointer += 1;
				Stack.menu[Stack.pointer] = menu;
				display(menuItemList.get(userInput - 1).menu, level + 1);
			} else if (menuItemList.get(userInput - 1).getType() != Menu.TYPE_IS_MENU
					&& menuItemList.get(userInput - 1).getType() != Menu.TYPE_IS_BACK) {
				System.out
						.println("There is nothing to display in the chosen option");
				display(menu, level);
			} else if (menuItemList.get(userInput - 1).getType() == Menu.TYPE_IS_BACK
					&& level == 1) {
				System.exit(-1);
			} else if (menuItemList.get(userInput - 1).getType() == Menu.TYPE_IS_BACK
					&& level != 1) {
				Stack.pointer -= 1;
				display(Stack.menu[Stack.pointer + 1], level - 1);
			}
		} catch (Exception exception) {
			System.out.println("Sorry something went wrong \n"
					+ exception.getMessage());
		}
	}
	/**
	 * 
	 * @param input
	 *            - represents the input string entered by the user
	 * @param type
	 *            -type can be either a number input or string input
	 * @param length
	 * @return
	 */
	public static boolean isInputValid(String input, int type, int length) {
		boolean status = true;
		if ((type == Menu.TYPE_IS_NUMBER_INPUT && (input.length() > 1
				|| input.codePointAt(0) < 48 || input.codePointAt(0) > 57 || Integer
				.parseInt(input) > length))
				|| (type == Menu.TYPE_IS_STRING_INPUT && input.length() == 0)) {
			status = false;

		}
		return status;
	}

}
