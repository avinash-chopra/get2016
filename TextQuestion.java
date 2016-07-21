package session2;

import java.io.IOException;
/**
 * 
 * @author Avinash Chopra 
 * @Date 21 july 2016 
 * This class use to get feedback from user
 *         
 */
public class TextQuestion {
	GetInput getInput = new GetInput();
	/**
	 * 
	 * @param user 				// user inputing the value
	 * @param message			// what message should appear
	 * @param feedback			// get the feedback array
	*  @return				// return string which inputed by user
	 * @throws IOException		// if user give wrong input then through exception message
	 */
	public String textSelectQuestion(int user,String message,String feedback[]) throws IOException {
		String tempMessage = "hello user " + (user+1) + " Enter the " + message ;
		String tempInput = getInput.getInput(tempMessage);
		feedback[user] = tempInput;
		return tempInput;
	}

}
