package session2_assignment1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * 
 * @author Avinash
 * @Date 29 july 2016
 * 
 */
public class StackByLiskList {

	/**
	 * 
	 * @return 			// input number given by user
	 */
	public static int getInputNumber() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(br.readLine());
			if (inputNumber > 0) {
				return inputNumber;
			} else {
				System.out.println("Enter a positive number");
				return getInputNumber();
			}
		} catch (Exception e) {
			System.out.println("Please Enter the Valid Number");
			inputNumber = getInputNumber();
		}
		return inputNumber;
	}

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		int loopVarible =1;
		int choice = 1;
		while(loopVarible == 1){
			System.out.println("Enter 1 for push");
			System.out.println("Enter 2 for pop");
			System.out.println("Enter 3 for show");
			System.out.println("Enter any thing else to exit");
			choice = getInputNumber();
			switch(choice){
			case 1 :
				System.out.println("Enter number ");
				stack.push(getInputNumber());
				break;
			case 2 :
				int data = stack.pop();
				System.out.println("pop element is"+data);
				break;
			case 3 :
				stack.showStack();
				break;
			default:
				loopVarible = 0;
			}
		}
		
	}

}
