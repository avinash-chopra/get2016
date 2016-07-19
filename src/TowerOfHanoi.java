import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Avinash Chopra
 * @Date 18 july 2016 This use recursion method to solve tower of hanoi problem
 */
public class TowerOfHanoi {

	public List<String> towerOfHanoi(String source, String auxiliary,
			String destination, int numOfDisk, List<String> requiredStepsList) {

		// base condition if number of disk remain 1
		if (numOfDisk == 1) {
			requiredStepsList.add("Move Disk " + (numOfDisk) + " from "
					+ source + " to " + destination);
		}

		// recursion call to remaining disk
		else {
			towerOfHanoi(source, destination, auxiliary, numOfDisk - 1,
					requiredStepsList);
			requiredStepsList.add("Move Disk " + (numOfDisk) + " from "
					+ source + " to " + destination);
			towerOfHanoi(auxiliary, source, destination, numOfDisk - 1,
					requiredStepsList);
		}

		return requiredStepsList;
	}

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public int inputMethod() {
		/*
		 * This method give integer value if input is give wrong then again it
		 * run till a correct input is not given
		 */
		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Please Enter the Valid Number");
			inputNumber = inputMethod();
		}
		return inputNumber;
	}

	public int readNumberOfDisk() {
		// till a correct value is not input, run again and again
		while (true) {
			try {
				System.out
						.println("Please enter the valid value for number of disks");

				int numOfDisks = Integer.parseInt(new BufferedReader(
						new InputStreamReader(System.in)).readLine());

				// number of disks should be grater then 0
				while (numOfDisks <= 0) {
					System.out
							.println("Please enter the valid value for number of disks");

					numOfDisks = Integer.parseInt(new BufferedReader(
							new InputStreamReader(System.in)).readLine());

				}

				return numOfDisks;

			} catch (Exception ex) {
				System.out.println("invalid input: " + ex.getMessage());
			}
		}
	}

	public static void main(String[] args) {

		int loopVariable = 1;
		while (loopVariable == 1) {

			TowerOfHanoi hanoiProblem = new TowerOfHanoi();
			// solution store in a array list
			List<String> requiredStepsList = new ArrayList<String>();
			// call method
			requiredStepsList = hanoiProblem.towerOfHanoi("A", "C", "B",
					hanoiProblem.readNumberOfDisk(), requiredStepsList);
			// show all the moves of disks
			for (String s : requiredStepsList) {
				System.out.println(s);
			}
			// now check if user want to enter more test case

			System.out.println("\nIf want to execute again enter 1 "
					+ "otherwise enter any other number");
			loopVariable = hanoiProblem.inputMethod();
		}
	}
}