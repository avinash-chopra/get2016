import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * This is to check given array is in sorted order or not. 
 *  2 if array is in ascending order, 1 if array is in descending order,
 *   0 if array is not in sorted
 * 
 */

/**
 * @author Avinash Chopra
 *	Date July 14  2016
 */
public class CheckSortedOrNot {
	
	public int sortedOrNOt(int[] inputArray){
		/*
		 * This function return 2 if array is sorted in ascending order
		 * and 1 if 1 if array is in descending order,
		 * 0 if array is not in sorted
		 */
		int arrayLength ;
		int countIncreasing ;
		int countDecreasing ;
		countIncreasing = 1;
		countDecreasing = 1;
		arrayLength = inputArray.length;
		for(int i=1; i < arrayLength ; i++){
			if(inputArray[i] >= inputArray[i-1]) {
				countIncreasing++ ;
			}else if(inputArray[i] < inputArray[i-1]){
				countDecreasing++ ;
			}else{
				
			}
			
		}
		if(countIncreasing == arrayLength ){
			return 2;
		}else if(countDecreasing == arrayLength){
			return 1;
		}else{
			return 0;
		}
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
			System.out.println("Please Enter the Valid Binary Number");
			 inputNumber = inputMethod();
		}
		return inputNumber;
	}
	public static void main(String[] args) {
		/*
		 * these line of code run if you give 1 when it ask to run again or not 
		 */
		int loopVariable = 1;
		while(loopVariable == 1){
			CheckSortedOrNot checkSortedOrNot = new CheckSortedOrNot();
			int lengthOfInputArray;
			int inputArray[] ;
			System.out.println("Enter the length of Array");
			lengthOfInputArray = checkSortedOrNot.inputMethod();
			inputArray = new int[lengthOfInputArray];
			System.out.println("Enter the Elements of array");
			for(int i=0;i<lengthOfInputArray ;i++){
				inputArray[i] = checkSortedOrNot.inputMethod();
			}
			int returnValue = checkSortedOrNot.sortedOrNOt(inputArray);
			if(returnValue == 2){
				System.out.println("Array is ascending sorted");
			}else if(returnValue == 1 ){
				System.out.println("Array is descending sorted");
			}else{
				System.out.println("Array is not sorted");
			}
			System.out.println("Enter 1 for run again else enter any othre number ");
			loopVariable = checkSortedOrNot.inputMethod();
		}
	}

}
