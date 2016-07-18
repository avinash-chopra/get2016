import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author Avinash
 * @Date 16 july 2016 
 * This is use to find number and this use linear recursive
 *       method.
 */
public class LinearSearch {

	int NUMBER_EXIST = 1;
	int NUMBER_NOT_EXIST = 0;

	/**
	 * 
	 * @param numbers
	 *            // use to hold numbers in array
	 * @param currentIndex
	 *            // current index number to check
	 * @param target
	 *            // number to be find
	 * @return // if number not exist return 0and if number exist return 1
	 */
	public int searching(int numbers[], int currentIndex, int target) {
		int numberOfInteger;
		numberOfInteger = numbers.length;
		// if index is greater then length
		if (currentIndex >= numberOfInteger) {
			return NUMBER_NOT_EXIST;
		}
		// number find successfully
		else if (numbers[currentIndex] == target) {
			return NUMBER_EXIST;
		}
		// recursive call
		else {
			return searching(numbers, currentIndex + 1, target);
		}
	}

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * This method give integer value if input is give wrong then again it run
	 * till a correct input is not given
	 * 
	 * @return user input value
	 */
	public int inputMethod() {
		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Please Enter the Valid Number");
			inputNumber = inputMethod();
		}
		return inputNumber;
	}

	public static void main(String[] args) {

		int loopVariable = 1; // use to run multiple time code

		// use to run multiple time this code
		while (loopVariable == 1) {
			LinearSearch linearSearch = new LinearSearch();
			int target; // number to be search
			int totalNumbers;
			int numbers[]; // use to hold numbers
			int resultOfSearching; // use to hold result of searching

			System.out.println("Enter the number of elements");
			totalNumbers = linearSearch.inputMethod();

			// number should be greater then zero to run method
			if (totalNumbers > 0) {
				System.out.println("Enter the elements");
				numbers = new int[totalNumbers];
				// getting numbers
				for (int i = 0; i < totalNumbers; i++) {
					numbers[i] = linearSearch.inputMethod();
				}
				System.out.println("Enter the number to be search");
				target = linearSearch.inputMethod();
				// calling sorting function
				resultOfSearching = linearSearch.searching(numbers, 0, target);
				// showing output result
				if (resultOfSearching == linearSearch.NUMBER_EXIST) {
					System.out.println("Number is exist");
				} else {
					System.out.println("Number is not exist");
				}

			}
			// if total numbers is less then zero
			else {
				System.out.println("number of elements are not correct");
			}

			System.out.println("Enter 1 for run again");
			System.out
					.println("For terminate the program give any other number");
			loopVariable = linearSearch.inputMethod();
		}

	}
}
