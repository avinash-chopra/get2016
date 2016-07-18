import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author Avinash
 * @Date 16 july 2016 Binary search use to find a number in a array of numbers
 *       condition is array must be sorted
 */
public class BinarySearch {

	int NUMBER_EXIST = 1;
	int NUMBER_NOT_EXIST = 0;

	/**
	 * 
	 * @param numbers
	 *            numbers store in array
	 * @param lowerIndex
	 *            lower index of array
	 * @param upperIndex
	 *            upper index of array
	 * @param target
	 *            target number to be search
	 * @return if number present then return 1 and if number not present then
	 *         return 0
	 * 
	 */
	public int searching(int numbers[], int lowerIndex, int upperIndex,
			int target) {

		int middleIndex;
		middleIndex = (lowerIndex + upperIndex) / 2;
		// upper index is greater then lower index
		// Base condition
		if (lowerIndex > upperIndex) {
			return NUMBER_NOT_EXIST;
		}
		// if number found at middle position
		else if (numbers[middleIndex] == target) {
			return NUMBER_EXIST;
		}
		// if number not found at middle position then recursion call to next
		// half array
		else if (numbers[middleIndex] > target) {
			return searching(numbers, lowerIndex, middleIndex - 1, target);
		} else {
			return searching(numbers, middleIndex + 1, upperIndex, target);
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
			System.out.println("Please Enter the Valid Number");
			inputNumber = inputMethod();
		}
		return inputNumber;
	}

	public static void main(String[] args) {

		int loopVariable = 1; // use to run multiple time this code

		// use to run multiple time a method
		while (loopVariable == 1) {
			BinarySearch binarySearch = new BinarySearch();
			int target; // number to be search
			int totalNumbers;
			int numbers[]; // use to hold numbers
			int resultOfSearching; // use to hold result of searching
			
			System.out.println("Enter the number of elements");
			totalNumbers = binarySearch.inputMethod();

			// number should be greater then zero to run method
			if (totalNumbers > 0) {
				System.out.println("Enter the elements");
				numbers = new int[totalNumbers];
				// getting numbers
				for (int i = 0; i < totalNumbers; i++) {
					numbers[i] = binarySearch.inputMethod();
				}
				System.out.println("Enter the number to be search");
				target = binarySearch.inputMethod();
				// calling searching function
				resultOfSearching = binarySearch.searching(numbers, 0,
						totalNumbers - 1, target);
				// showing output result
				if (resultOfSearching == binarySearch.NUMBER_EXIST) {
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
			System.out.println("For terminate the program give any other number");
			loopVariable = binarySearch.inputMethod();
		}
	}

}
