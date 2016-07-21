package session2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 * 
 * @author Avinash Chopra
 * Date 21 july 2016
 *	This is basic form for different users get the feedback and store in a file
 */
public class Survey {

	public static void main(String[] args) throws IOException {
		
		SelectQuestion selectQuestion = new SelectQuestion();
		InputNumber inputNumber = new InputNumber();
		System.out.println("Enter the Number of user");
		// get the number of user 
		int numberOfUser = inputNumber.inputMethod();
		for (int i = 0; i < numberOfUser; i++) {
			
			//  read the question file from specific location 
			File file = new File(
					"C:\\Users\\admin\\Desktop\\Codes\\OOPS\\src\\session2\\Questions.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s = "";
			// get the one by one line from the file
			s = br.readLine();
			while (s != null) {
				
				String tempArray[] = s.split(",");
				// type of question example single select or multi select or text 
				String question = tempArray[1];
				// which user filling the survey
				int user = i;
				// question ask from user example rating or feedback or are of improvement
				String message = tempArray[0];
				// answer belong to question
				String rating ="";
				// for feedback there is no particular answer
				if (tempArray.length > 2) {
					 rating = tempArray[2];
				}
				// calling select function 
				selectQuestion.select(question, user, message, rating);
				s = br.readLine();
				System.out.println();
			}
			br.close();
		}
		// show the result and store into a file 
		ShowResult showResult = new ShowResult();
		showResult.showResult(selectQuestion, numberOfUser);
	}

}
