package session2;
/**
 * 
 * @author Avinash Chopra 
 * @Date 21 july 2016 
 * This select single input from user 
 *         
 */
import java.io.IOException;

public class SingleSelect {
	GetInput getInput = new GetInput();

	/**
	 * 
	 * @param user
	 *            // user inputing the value
	 * @param message
	 *            // what message should appear
	 * @param rating
	 *            // give possible ratings
	 * @return // return string which inputed by user
	 * @throws IOException
	 *             // if user give wrong input then through exception message
	 *             get a single input between 1 to 5
	 */
	public int singleSelectQuestion(int user, String message, String rating)
			throws IOException {
		// show message before user input string
		String tempMessage = "hello user " + (user + 1) + " Enter the "
				+ message + rating;
		String tempGetInput = getInput.getInput(tempMessage);
		SingleSelect singleSelect = new SingleSelect();
		try {
			int tempNumber = Integer.parseInt(tempGetInput);
			// check number should be in between 1 to 5
			if (tempNumber >= 1 && tempNumber <= 5) {
				return tempNumber;
			}
			// if number is not between 1 to 5 then call this function again
			else {
				System.out.println("Enter the Correct value" + rating);
				return singleSelect.singleSelectQuestion(user, message, rating);
			}
		} catch (Exception e) {
			System.out.println("Enter the Correct input");
			return singleSelect.singleSelectQuestion(user, message, rating);
		}
	}

}
