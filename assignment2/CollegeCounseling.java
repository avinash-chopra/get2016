package session2_assignment2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * 
 * @author Avinash
 * @Date 29-july-2016
 * 
 */
public class CollegeCounseling {

	// number seats in every college 
	int collegeSeats[];
	// total number of college
	int totalCollege;
	// total number of student
	int totalStudent;
	// assign college for students
	int assignCollege[];
	// make a queue object
	Queue queue;
	/**
	 * 
	 * @return		//rank for every student 
	 */
	public int getInputRank() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(br.readLine());
			if (inputNumber > 0) {
				return inputNumber;
			} else {
				System.out.println("Enter a positive number");
				return getInputRank();
			}
		} catch (Exception e) {
			System.out.println("Please Enter the Valid Number");
			inputNumber = getInputRank();
		}
		return inputNumber;
	}

	/**
	 * 
	 * @return 		// get seats for every college
	 */
	public int getInputSeats() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(br.readLine());
			if (inputNumber > 0) {
				return inputNumber;
			} else {
				System.out.println("Enter a positive number");
				return getInputSeats();
			}
		} catch (Exception e) {
			System.out.println("Please Enter the Valid Number");
			inputNumber = getInputSeats();
		}
		return inputNumber;
	}

	/**
	 * 
	 * @return		//get user's college choice
	 */
	public int getInputCollege() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(br.readLine());
			if (inputNumber > 0 && inputNumber <= totalCollege) {
				return inputNumber;
			} else {
				System.out.println("Enter a positive number");
				return getInputCollege();
			}
		} catch (Exception e) {
			System.out.println("Please Enter the Valid Number");
			inputNumber = getInputCollege();
		}
		return inputNumber;
	}

	/**
	 * making constructor of default size 100
	 */
	public CollegeCounseling() {
		collegeSeats = new int[100];
	}

	/**
	 * 
	 * @param college 	// number of college
	 * @param student	// total number of student
	 */
	public CollegeCounseling(int college, int student) {
		collegeSeats = new int[college];
		assignCollege = new int[student];
		queue = new Queue(student);
		totalCollege = college;
		totalStudent = student;
	}

	/**
	 * for every college number of available seats
	 */
	public void getNumberOfSeats() {
		for (int i = 0; i < totalCollege; i++) {
			System.out.println("Enter " + (i + 1) + "college seats");
			collegeSeats[i] = getInputSeats();
		}
	}
	/**
	 * for every student set rank and require college
	 */
	public void getRankAndCollege() {
		for (int i = 0; i < totalStudent; i++) {
			System.out.println("Student " + (i + 1));
			System.out.println("Enter rank");
			int rank = getInputRank();
			System.out.println("Enter College Required ");
			int college = getInputCollege();
			queue.enqueue(rank, college);
		}
		// sorting of queue according to rank
		queue.sorting();
	}

	/**
	 * assign college according to there rank
	 */
	public void assign() {
		for (int i = 0; i < totalStudent; i++) {
			int college = (queue.getFront()).collegeRequire;
			if (collegeSeats[college-1] > 0) {
				assignCollege[i] = college;
				collegeSeats[college-1]--;
			}
			queue.dequeue();
		}
	}

	/**
	 * show assign college 
	 */
	public void showAssignCollege() {
		for (int i = 0; i < totalStudent; i++) {
			if (assignCollege[i] != 0) {
				System.out.println("student " + (i + 1) + " assign "
						+ assignCollege[i] + " college");
			}else{
				System.out.println("student "+ (i+1) +" is not assigned");
			}
		}
	}
}
