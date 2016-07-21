package session2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Avinash Chopra 
 * @Date 21 july 2016 
 * This get the string and define type
 *         of question like single select or multi select or only text
 */
public class SelectQuestion {

	String feedback[] = new String[100];			// store the feedback of users
	int overallRating[] = new int[100];				// store the overall rating of users
	String areaOfImprovement[] = new String[100]; 	// store are of improvement field by user
	// use to get input from user
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	GetInput getInput = new GetInput();
	/**
	 * 
	 * @param checkForQuesttion  // string to check type of question
	 * @param user				// which user inputing what
	 * @param message			// question for user
	 * @param rating			// possible answers for the question
	 * @return					// return string which is input by user
	 * @throws IOException			// if user give wrong input then through exception message
	 */
	public String select(String checkForQuesttion, int user, String message,
			String rating) throws IOException {

		// check if question is single select type or not 
		if (checkForQuesttion.equals("Single Select")) {
			SingleSelect singleSelect = new SingleSelect();
			overallRating[user] = singleSelect.singleSelectQuestion(user,
					message, rating);
		}
		// check if question is multi select type or not
		else if (checkForQuesttion.equals("Multi Select")) {
			MultiSelect multiSelect = new MultiSelect();
			areaOfImprovement[user] = multiSelect.multiSelectQuestion(user,
					message, rating);
		}
		// other wise feedback is possible so for feed back
		else {
			TextQuestion textQuestion = new TextQuestion();
			textQuestion.textSelectQuestion(user, message, feedback);
		}
		return "";
	}

}
