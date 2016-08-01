package session2_assignment2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Admission {

	// get user input number
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
		// total number of college
		int totalCollege;
		// total number of student
		int totalStudent;
		System.out.println("Enter the number of college");
		totalCollege = getInputNumber();
		System.out.println("Enter the number of student");
		totalStudent = getInputNumber();
		CollegeCounseling counseling = new CollegeCounseling(totalCollege,
				totalStudent);
		// for every college assign number of seats
		counseling.getNumberOfSeats();;
		// for every student assign rank and require college
		counseling.getRankAndCollege();
		// assign college according to rank
		counseling.assign();
		// show output
		counseling.showAssignCollege();	
	}
}
