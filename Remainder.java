import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Avinash
 * @Date 16 july 2016
 * 	This find remainder and use recursion method to solve. 
 */
public class Remainder {
	/**
	 * 
	 * @param dividend 		 number to be divided by another number
	 * @param divisor		 number by which another number is to be divided
	 * @return 				amount "left over" after performing division  
	 */
	
	public int remaining(int dividend , int divisor){
		// special case when divisor is zero
		if(divisor == 0 ){
			while(divisor==0){
				System.out.println("0 is not correct divisor"+ "\n"+" please enter correct divisor");
				divisor = inputMethod();
			}
		}
		// Base case 
		if(divisor > dividend ){
			return dividend;
		}
		// recursive call
		else{
			return remaining(dividend%divisor, divisor);
		}
	}

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	/**
	 * This method give integer value
	 * if input is not a integer number then it again ask for input till 
	 * a correct input not given
	 * @return		 user input value 
	 */
	public int inputMethod(){
		
		int inputNumber = 0 ;
		try{
			inputNumber = Integer.parseInt(br.readLine());
		}catch(Exception e){
			System.out.println("Enter the Valid Number");
			 inputNumber = inputMethod();
		}
		return inputNumber;
	}

	public static void main(String[] args) {
		Remainder remainder = new Remainder();
		int loopVariable = 1;		// use to run multiple time code
		while(loopVariable == 1){
			// take dividend
			
			System.out.println("Enter the dividend");
			int divident = remainder.inputMethod();
			
			// take divisor 
			System.out.println("Enter the divisor");
			int divisor = remainder.inputMethod();
			
			// call function to get remainder 
			System.out.println(remainder.remaining(divident, divisor));
			
			// ask user to run it again with new values
			System.out.println("Enter 1 for run again");
			System.out.println("For Terminate type any other number ");
			loopVariable = remainder.inputMethod();
		}
	}
}
