package session5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * 
 * @author Avinash Chopra
 * @Date 04-08-2016
 * Link List by recursion in increasing order   
 */
public class LinkList {

	/**
	 * This method give integer value if input is give wrong then again it run
	 * till a correct input is not given
	 * 
	 * @return //user input value
	 */
	public static int inputNumber() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Please Enter the Valid Number");
			inputNumber = inputNumber();
		}
		return inputNumber;
	}

	public static void main(String[] args) {

		// make a list 
		List list = new List();
		int loopVariable = 1;
		while (loopVariable == 1) {
			System.out.println("Enter 1 for add number ");
			System.out.println("Enter 2 for display list ");
			System.out.println("Enter any other number for Exit ");
			int choice = inputNumber();
			switch (choice) {
			case 1:
				System.out.print("Enter the number: ");
				int number = inputNumber();
				list.insert(number);
				break;
			case 2:
				System.out.print("Current List: ");
				list.showList();
				System.out.println();
				break;
			default:
				loopVariable = 0;
				break;
			}
		}
	}
}
