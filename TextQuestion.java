/**
 * 
 */
package session2;

import java.io.IOException;

/**
 * @author admin
 *
 */
public class TextQuestion {
	GetInput getInput = new GetInput();
	public void textSelectQuestion(int user,String message,String feedback[]) throws IOException {
		String tempMessage = "hello user " + (user+1) + " Enter the " + message ;
		String tempInput = getInput.getInput(tempMessage);
		feedback[user] = tempInput;
	}

}
