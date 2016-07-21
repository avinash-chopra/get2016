package session2;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * 
 * @author Avinash Chopra
 * @Date 21 july 2016 This show the result and store into a file output.txt
 * 
 */
public class ShowResult {
	/**
	 * 
	 * @param selectQuestion
	 *            // selectQuestion type object
	 * @param totalUser
	 *            // total number of user
	 * @throws FileNotFoundException
	 *             // exception if file not found
	 */
	public void showResult(SelectQuestion selectQuestion, int totalUser)
			throws FileNotFoundException {
		// get ratings
		int ratingnArray[] = new int[10];
		for (int i = 0; i < totalUser; i++) {
			int tempRating = selectQuestion.overallRating[i];
			ratingnArray[tempRating]++;
		}
		// calculate percent age and show the result
		for (int i = 0; i < 5; i++) {
			double percentUser = ratingnArray[(i + 1)];
			percentUser *= 100;
			percentUser = (percentUser / totalUser);
			System.out.println((i + 1) + " - " + percentUser + "%");
		}
		// make a string and store it into a file
		String allThings = "";
		for (int i = 0; i < totalUser; i++) {
			String tempString = selectQuestion.overallRating[i] + "\t";
			tempString += selectQuestion.areaOfImprovement[i] + "\t";
			tempString += selectQuestion.feedback[i] + "\t";
			System.out.println("user " + (i + 1) + " Enter these things \n"
					+ tempString);
			allThings += tempString;
		}
		// write into the file
		PrintWriter out = new PrintWriter("output.txt");
		out.print(allThings);
		out.close();
	}

}
