package session2;

import java.io.IOException;
public class  MultiSelect {
	GetInput getInput = new GetInput();
	public String multiSelectQuestion(int user, String message, String rating)
			throws IOException {
		String tempMessage = "hello user " + (user+1) + " Enter the " + message +" "+rating+", seperate multiple value by /";
		String tempGetInput = getInput.getInput(tempMessage);
		String stringWithoutBracket = (rating.replace("(", "")).replace(")", "");
		String subStringOfOriginal[] = stringWithoutBracket.split("/") ;
		String subStringOfInput[] = tempGetInput.split("/");
		int valid = 0;		
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
		if(valid == subStringOfInput.length){
			return tempGetInput;
		}
		else{
			System.out.println("Input is not correct");
			return multiSelectQuestion(user, message, rating);
		}
		
	}

}
