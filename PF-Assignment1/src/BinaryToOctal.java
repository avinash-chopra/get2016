import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * This class convert binary number into octal number 
 * i make two functions to do this
 * first make binary to decimal and then decimal to binary
 */
/**
 * @author Avinash Chopra
 * Date July-14-2016
 *
 */
public class BinaryToOctal {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public int convertBinaryToOctal(int number){
		/*
		 * This function convert binary number into octal number 
		 * by using two functions convertBinaryToDecimal and
		 * convertDecimalToBinary 
		 */
		int octalNumber;
		int decimalNumber;
		
		decimalNumber = convertBinaryToDecimal(number);
		octalNumber = convertDecimalToOctal(decimalNumber);
		
		return octalNumber;
	}
	
	
	public int	convertBinaryToDecimal(int number){
		/*
		 * This Function convert binary to decimal by using very simple 
		 * divide and remainder 
		 */
		int decimalNumber;
		int position;		// To find out the 2's power according to position
		decimalNumber = 0 ;
		position = 0 ;
		
		while(number > 0){
			int lastDigit;
			int powerResult;
			powerResult = power(2,position);
			lastDigit = number%10;
			decimalNumber = decimalNumber + ( lastDigit * powerResult );
			number = number / 10;
			position++;
		}
		return decimalNumber;
	}
	
	public int convertDecimalToOctal(int number){
		/*
		 * This Function convert decimal to binary by using very simple 
		 * divide and remainder 
		 */
		int octalNumber;
		int remender;
		int position;		// To find out the 10's power according to position
		int remenderInTenMultiple;
		
		position =0;
		octalNumber = 0;
		remender = 0;
		
		while(number > 0){
			int tenPower;
			tenPower = power(10, position);
			remender = number % 8;
			remenderInTenMultiple = remender * tenPower;
			octalNumber = octalNumber + remenderInTenMultiple;
			number = number / 8;
			position++;
		}
		
		return octalNumber;
	}
	
	public int power(int base, int exponent){
		/*
		 * This function use to get power of a number
		 */
		int powerResult;
		powerResult = 1;
		
		while( exponent > 0 ){
			powerResult = powerResult * base;
			exponent-- ;
		}
		return powerResult;
	}
	
	public int inputMethod(){
		/*
		 * This method give integer value
		 * if input is give wrong then again it run till a correct input
		 * is not given 
		 */
		int inputNumber = 0 ;
		try{
			inputNumber = Integer.parseInt(br.readLine());
		}catch(Exception e){
			System.out.println("Please Enter the Valid Binary Number");
			 inputNumber = inputMethod();
		}
		return inputNumber;
	}
	
	public static void main(String[] args) {
		/*
		 * these line of code run if you give 1 when it ask to run again or not 
		 */
		BinaryToOctal binbaryToOctal = new BinaryToOctal();
		int loopVariable = 1 ;	
		while(loopVariable == 1){
			int inputNumber = 0 ;
			System.out.println("Please Enter the Binary Number");
			inputNumber = binbaryToOctal.inputMethod();
			System.out.println(binbaryToOctal.convertBinaryToOctal(inputNumber));
			System.out.println("Enter 1 for Again Run Otherwise give any other input");
			loopVariable = binbaryToOctal.inputMethod();
		}
	}
}
