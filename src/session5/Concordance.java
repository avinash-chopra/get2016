package session5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author Avinash Chopra
 * @Date 04-08-2016 create a concordance of characters occurring in a string
 */
public class Concordance {

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

	public static void main(String[] args) throws IOException {

		int loopVariable = 1;
		while (loopVariable == 1) {
			// input string by command line or user input value
			String inputString = "";
			if (args.length > 0) {
				for (String s : args) {
					inputString += s;
				}
			} else {
				System.out.println("Enter String");
				BufferedReader br = new BufferedReader(new InputStreamReader(
						System.in));
				inputString = br.readLine();
			}

			@SuppressWarnings("unchecked")
			List<Integer>[] list =  new List[300];
			// making each list object into liked list type
			for (int i = 0; i < 300; i++) {
				list[i] = new LinkedList<Integer>();
			}
			// assign each character position
			for (int i = 0; i < inputString.length(); i++) {
				char c = inputString.charAt(i);
				list[c].add(i);
			}
			// show output
			for (int i = 0; i < 300; i++) {
				if (list[i].size() > 0) {
					char ch = (char) i;
					System.out.print(ch);
					for (int j : list[i]) {
						System.out.print(" " + j + " ");
					}
					System.out.println();
				}
			}
			System.out
					.println("Enter 1 for run again else enter any other number");
			loopVariable = inputNumber();

		}

	}

}
