import java.io.BufferedReader;
import java.io.InputStreamReader;


public class PyramidPattern {
	
	public String upperPartSpaceBefore(int sizePyramid,int rowPyramid){
		/*
		 * for get spaces before pyramid
		 */
		String space ="" ;
		for(int i=1; i <= sizePyramid-rowPyramid ;i++){
			space += String.valueOf(' ');
		}
		return space;
	}
	public String upperPartAddNumbers(int rowPyramid){
		/*
		 * get numbers
		 */
		String space ="" ;
		for(int i=1;i<=rowPyramid;i++){
			space += String.valueOf(i);
		}
		return space;
	}
	public String upperPartBackNumber(int rowPyramid){
		/*
		 * now add back numbers
		 */
		String space = "" ;
		for(int i=rowPyramid-1 ;i>0 ;i--){
			space += String.valueOf(i);
		}
		return space;
	}
	public String lowerSpaceBefore(int sizePyramid,int rowPyramid){
		/*
		 * for get spaces before pyramid at lower part
		 */
		String space ="" ;
		for(int i=1; i <= rowPyramid - sizePyramid ;i++){
			space += String.valueOf(' ');
		}
		return space;
	}
	public String lowerAddNumber(int sizePyramid,int rowPyramid){
		/*
		 * get numbers
		 */
		String space ="" ;
		for(int i=1;i<=(2*sizePyramid)-rowPyramid;i++){
			space += String.valueOf(i);
		}
		return space;
	}
	public String lowerBackNumber(int sizePyramid,int rowPyramid){
		/*
		 * now add back numbers
		 */
		String space ="" ;
		for(int i=((2*sizePyramid)-rowPyramid)-1 ;i>0 ;i--){
			space += String.valueOf(i);
		}
		return space;
	}
	public String pyramid(int sizePyramid,int rowPyramid){
		/*
		 * This function use to get a particular row of a pyramid
		 * This function brack in two part when upper part and lower part
		 */
		String outputRow = "";		// main string that hold all variable
		if(rowPyramid <= sizePyramid){
			/*
			 * This is upper part when row is greater and equal to pyramid size
			 */
			outputRow += upperPartSpaceBefore(sizePyramid, rowPyramid);
			outputRow += upperPartAddNumbers(rowPyramid);
			outputRow += upperPartBackNumber(rowPyramid);
		}else{
			/*
			 * This is lower part when row is grater then pyramid size
			 */
			outputRow += lowerSpaceBefore(sizePyramid, rowPyramid);
			outputRow += lowerAddNumber(sizePyramid, rowPyramid);
			outputRow += lowerBackNumber(sizePyramid, rowPyramid);	
		}
		return outputRow;
	}
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
			System.out.println("Please Enter the Valid Number");
			 inputNumber = inputMethod();
		}
		return inputNumber;
	}
	

	public static void main(String[] args) {
		
		int loopVariable = 1;
		PyramidPattern pyramidPattern = new PyramidPattern();
		while(loopVariable == 1){
			int patternSize ;
			
			/*
			 * take input from the user to get size of pattern
			 */
			System.out.println("Enter size of pattern");
			patternSize = pyramidPattern.inputMethod();
			/*
			 * now get the pattern by calling function and get the row 
			 */
			for(int i=1;i<=(2*patternSize-1);i++){
				System.out.println(pyramidPattern.pyramid(patternSize, i));
			}
			
			/*
			 * now check if user want to enter more test case
			 */
			System.out.println("want to print more pattern enter 1 "
					+ "otherwise enter any other number");	
			loopVariable = pyramidPattern.inputMethod();
		}
		

	}

}
