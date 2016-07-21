package session2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * 
 * @author Avinash Chopra 
 * @Date 21 july 2016 
 * This take number from user in input
 *         
 */
public class InputNumber {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * This method give integer value if input is give wrong then again it run
	 * till a correct input is not given
	 * 
	 * @return //user input value
	 */
	public int inputMethod() {
		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Please Enter the Valid Number");
			inputNumber = inputMethod();
		}
		return inputNumber;
	}
}
