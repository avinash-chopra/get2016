import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Avinash
 * @Date 16 july 2016 </br> This use to get Greatest Common Divisor by recursion
 *       method
 */
public class GreatestCommonDivisor {

	/**
	 * 
	 * @param firstNumber
	 *            // first integer to find Greatest Common Divisor
	 * @param secondNumber
	 *            // second integer to find Greatest Common Divisor
	 * @return // return Greatest Common Divisor of two numbers
	 * 
	 *         This use recursion method to solve Greatest Common Divisor of two
	 *         number
	 */
	public int greatestCommonDivisorOfTwoNumbers(int firstNumber,
			int secondNumber) {

		// Base Condition 
		// second number zero then return first number
		if (secondNumber == 0) {
			return firstNumber;
		}
		// recursive call to numbers 
		else {
			return greatestCommonDivisorOfTwoNumbers(secondNumber, firstNumber
					% secondNumber);
		}
	}

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * This method give integer value if input is not a integer number then it
	 * again ask for input till a correct input not given
	 * 
	 * @return user input value
	 */
	public int inputMethod() {

		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Enter the Valid Number");
			inputNumber = inputMethod();
		}
		return inputNumber;
	}

	public static void main(String[] args) {
		
		GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
		int loopVariable = 1;		// use to run multiple time this code
		
		while (loopVariable == 1) {
			// take first number from user
			System.out.println("Enter the first number");
			int firstNumber = greatestCommonDivisor.inputMethod();
			// take second number from user
			System.out.println("Enter the second number");
			int secondNumber = greatestCommonDivisor.inputMethod();
			// call function to get Greatest Common Divisor
			System.out.println(greatestCommonDivisor
					.greatestCommonDivisorOfTwoNumbers(firstNumber, secondNumber));
			// ask user to run it again with new values
			System.out.println("Enter 1 for run again");
			System.out.println("For Terminate type any other number ");
			loopVariable = greatestCommonDivisor.inputMethod();
		}

	}

}
