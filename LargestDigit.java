import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author Avinash
 * @Date 16 july 2016 This is use to find largest digit in a number from 0 to 9
 */
public class LargestDigit {

	/**
	 * 
	 * @param number
	 *            // number from which largest digit to find
	 * @return //return largest digit in number
	 */
	public int digit(int number) {
		// if number is zero then nothing to calculate and return zero
		// Base condition
		if (number == 0) {
			return 0;
		}
		// if digit is greater then current maximum digit
		if (number % 10 > digit(number / 10)) {
			return number % 10;
		}
		// recursive call to rest of number
		else {
			return digit(number / 10);
		}
	}

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * This method give integer value if input is give wrong then again it run
	 * till a correct input is not given
	 * @return		 user input value 
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
		
		int loopVariable = 1; // use to run multiple time this code
		LargestDigit largestDigit = new LargestDigit();
		// use to run multiple time a method
		while (loopVariable == 1) {
			int number;						// use to store number
			int largestDigitInNumber;		// store largest digit 
			System.out.println("Enter the number");
			number = largestDigit.inputMethod();		// get number from user
			largestDigitInNumber = largestDigit.digit(number);
			//output largest digit
			System.out.println(largestDigitInNumber);
			
			System.out.println("Enter 1 for run again");
			System.out
					.println("For terminate the program give any other number");
			loopVariable = largestDigit.inputMethod();
		}

	}

}
