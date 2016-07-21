package session2;
import java.io.IOException;
/**
 * 
 * @author Avinash Chopra 
 * @Date 21 july 2016 
 * This class use to handle multi select
 *         
 */
public class  MultiSelect {
	GetInput getInput = new GetInput();
	
	
	/**
	 * 
	 * @param user 				// user inputing the value
	 * @param message			// what message should appear
	 * @param rating			// give possible ratings
	 * @return					// return string which inputed by user
	 * @throws IOException		// if user give wrong input then through exception message
	 */
	public String multiSelectQuestion(int user, String message, String rating)
			throws IOException {
		String tempMessage = "hello user " + (user+1) + " Enter the " + message +" "+rating+", seperate multiple value by /";
		String tempGetInput = getInput.getInput(tempMessage);
		// remove the brackets if there are in the string
		String stringWithoutBracket = (rating.replace("(", "")).replace(")", "");
		// original string
		String subStringOfOriginal[] = stringWithoutBracket.split("/") ;
		// break the original string
		String subStringOfInput[] = tempGetInput.split("/");
		
		int valid = 0;	// use to check string is valid or not		
		for(String s : subStringOfInput){
			int temp =0;
			for(int i= 0;i<subStringOfOriginal.length;i++){
				if(subStringOfOriginal[i].equals(s)){
					temp = 1;
				}
			}
			if(temp == 0){
				valid = 0;
				break;
			}else{
				valid++;
			}
		}
		// if valid then return
		if(valid == subStringOfInput.length){
			return tempGetInput;
		}
		// if not then call again
		else{
			System.out.println("Input is not correct");
			return multiSelectQuestion(user, message, rating);
		}
		
	}

}
