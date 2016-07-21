package session2;

import java.io.IOException;

public class SingleSelect {
	GetInput getInput = new GetInput();
	public int singleSelectQuestion(int user, String message, String rating)
			throws IOException {
		String tempMessage = "hello user " + (user+1) + " Enter the " + message + rating;
		String tempGetInput = getInput.getInput(tempMessage);
		SingleSelect singleSelect =new SingleSelect();
		try {
			int tempNumber = Integer.parseInt(tempGetInput);
			if (tempNumber >= 1 && tempNumber <= 5) {
				return tempNumber;
			} else {
				System.out.println("Enter the Correct value" + rating);
				return singleSelect.singleSelectQuestion(user, message, rating);
			}
		} catch (Exception e) {
			System.out.println("Enter the Correct input");
			
			return singleSelect.singleSelectQuestion(user, message, rating);
		}
	}

}
