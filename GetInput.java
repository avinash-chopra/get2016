package session2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author Avinash Chopra 
 * @Date 21 july 2016 
 * This get the input from user as a string 
 *         
 */
public class GetInput {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	/**
	 * 
	 * @param message // this message show before user input
	 * @return			//user entered value
	 * @throws IOException	// if user give wrong input then through exception message
	 * This method take input from the user
	 */
	public String getInput(String message) throws IOException {
		System.out.println(message);
		String tempInput = br.readLine();
		return tempInput;
	}
}

