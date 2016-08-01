package session2_assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author Avinash 
 * @Date 29 july 2016
 *
 */
public class InfixToPrefix {
/**
 * 
 * @param str 		// string 
 * @return			//string, contain prefix of input string
 */
	public static String printPreFix(String str){
        Stack<Character> stack = new Stack<Character>();
        String prefix = "";
        for(int i=str.length()-1;i>=0;i--){
            char c = str.charAt(i);
            if(Character.isLetter(c)){
                prefix = ((Character)c).toString() + prefix;
            }
            else if(c == '('){
            	Character tempChar = (Character)stack.pop();
            	if(tempChar != null ){
            		prefix = (tempChar).toString() + prefix;
            	}
            }
            else if(c == ')'){
                continue;
            }
            else{
                stack.push(c);
            }
        }
        return prefix;
 
    }
	public static void main(String[] args) throws IOException {
		int loopVariable =1 ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(loopVariable == 1){
			String infix = br.readLine();
			System.out.println("Prefix : " + printPreFix(infix));
		}
		 
	}

}
