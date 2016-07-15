import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
This remove Duplicate Number from an array
 * 
 */
public class RemoveDuplicateNumber {
	
	final int MAX_NUMBER_LIMIT = 1000000 ;
	int MAX_INPUT_SIZE = 100;
	int numberOfElementsInOutput = 0;
	public int[] removeDuplicate(int givenArray[]){
		/*
		 * this method use hasing method if item is not present then add into output array
		 * and hasing value is update to 1 next time item come then check hasing value and if
		 * it is 1 then skip it 
		 */
		MAX_INPUT_SIZE = givenArray.length;
		int[] referanceArray ;				// this is reference hasing array
		int[] withoutDuplicateArray; 			// output array 
		referanceArray = new int[MAX_NUMBER_LIMIT];
		withoutDuplicateArray = new int[MAX_INPUT_SIZE];
		for(int arrayElement : givenArray){
			if( referanceArray[arrayElement] == 0){
				referanceArray[arrayElement] = 1;
				withoutDuplicateArray[numberOfElementsInOutput] = arrayElement;
				numberOfElementsInOutput++;
			}
		}
		int [] returnArray = new int[numberOfElementsInOutput];
		for(int i=0;i<numberOfElementsInOutput;i++){
			returnArray[i] = withoutDuplicateArray[i];
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
		int loopVariable = 1 ;
		while(loopVariable == 1 ){
			RemoveDuplicateNumber removeDuplicateNumber = new RemoveDuplicateNumber();
			System.out.println("Enter the length of Array");
			int lengthArray = removeDuplicateNumber.inputMethod();
			int arrayElements[] = new int[lengthArray] ;
			System.out.println("Enter the Elemets");
			for(int i =0 ;i<lengthArray;i++){
				arrayElements[i] = removeDuplicateNumber.inputMethod();
			}
			int output[] = removeDuplicateNumber.removeDuplicate(arrayElements);
			for(int i=0;i<removeDuplicateNumber.numberOfElementsInOutput;i++){
				System.out.println(output[i]);
			}
			System.out.println("Enter 1 for run again else enter any othre number ");
			loopVariable = removeDuplicateNumber.inputMethod();
		}
	}
}
