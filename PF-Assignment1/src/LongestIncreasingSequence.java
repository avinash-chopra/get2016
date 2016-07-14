/**
 * This is use for get longest cont. sequence in a sequence
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Avinash Chopra
 *	Date july 14 2016
 */
public class LongestIncreasingSequence {

	public int[] lonestSequence(int inputArray[]){
		int maxNumOfElement ; 		//store maximum number of elements in result
		int lowerIndex ;		//lower index of result
		int higherIndex ;		// higher 
		maxNumOfElement = 0;
		lowerIndex = 0;
		higherIndex = 0 ;
		for(int i = 1;i<inputArray.length ;i++){
			int tempMaxNumOfElement ;
			int tempLowerIndex ;
			int tempHigherIndex ;
			tempLowerIndex = i;
			while( i < inputArray.length ){
				if(inputArray[i] > inputArray[i-1]){
					i++ ;
				}
				else{
					break ;
				}
			}
			tempHigherIndex = i;
			tempMaxNumOfElement = tempHigherIndex - tempLowerIndex + 1 ;
			if(maxNumOfElement < tempMaxNumOfElement){
				lowerIndex = tempLowerIndex ;
				higherIndex = tempHigherIndex ;
				maxNumOfElement = higherIndex - lowerIndex + 1 ; 
			}
		}
		int[] returnArray = new int [higherIndex-lowerIndex+1];
		int temp;
		temp = 0 ;
		for(int i=lowerIndex-1;i<higherIndex;i++){
			returnArray[temp] = inputArray[i];
			temp++;
		}
		return returnArray;
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
		
		LongestIncreasingSequence longestIncreasingSequence = new LongestIncreasingSequence();
		System.out.println("Enter the length of array");
		int lengthOfArray = longestIncreasingSequence.inputMethod();
		int []arrayElements = new int[lengthOfArray];
		System.out.println("Enter the Elements");
		for(int i=0;i<lengthOfArray;i++){
			arrayElements[i] = longestIncreasingSequence.inputMethod();
		}
		int[] result = longestIncreasingSequence.lonestSequence(arrayElements);
		for(int i : result){
			System.out.print(i+ "\t");
		}

	}

}
