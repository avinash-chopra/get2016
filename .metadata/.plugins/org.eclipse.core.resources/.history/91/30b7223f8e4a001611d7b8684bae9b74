import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *  @author Avinash Chopra
 * Date july 15 2016 
 *  Display triangle Pattern.
 *  modular approach is used.
 */
public class TrianglePattern {
	/**
	 * 
	 * @param numRow		Total number of rows in the pattern
	 * @param position		row position in the pattern
	 * @return 				Return pattern actual row 
	 */
	// first store the spaces
	public String pattern(int numRow,int position){
		String outputString ="";
		int charPos = 0;
		
		for(int i = 1; i < position ;i++ ){
			outputString += String.valueOf(' ');
			charPos++;
		}
		
		// It store the integers after the spaces
		for(int i=1 ;charPos < numRow ;i++ ){
			outputString += String.valueOf(i);
			charPos++;
		}
		return outputString;
	}
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	/**
	 * This method give integer value
	 * if input is give wrong then again it run till a correct input
	 * is not given 
	 * @return		 Return value from user
	 */
	public int inputMethod(){
		int inputNumber = 0 ;
		try{
			inputNumber = Integer.parseInt(br.readLine());
		}catch(Exception e){
			System.out.println("Please Enter the Valid Number");
			 inputNumber = inputMethod();
		}
		return inputNumber;
	}
	
	public static void main(String[] args) {
		int loopVariable = 1;
		TrianglePattern trianglePattern = new TrianglePattern();
		while(loopVariable == 1){
			int patternSize ;
			
			 // get size of pattern in input
			System.out.println("Enter size of pattern");
			patternSize = trianglePattern.inputMethod();
			
			// get the pattern  
			for(int i=1; i<=patternSize;i++){
				String display = trianglePattern.pattern(patternSize, i);
				System.out.println(display);
			}
			
			// check if user want to enter more test case
			System.out.println("want to print more pattern enter 1 "
					+ "otherwise enter any other number");	
			loopVariable = trianglePattern.inputMethod();
		}
	}
}
