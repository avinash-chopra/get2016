/**
This remove Duplicate Number from a array

 * 
 */

/**
 * @author admin
 *
 */
public class RemoveDuplicateNumber {

	/**
	 * @param args
	 */
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
	public static void main(String[] args) {
	RemoveDuplicateNumber r = new RemoveDuplicateNumber();
	int input[] = {2,5,4,6,3,8,5,9,3,3,6,3,9,0};
	int output[] = r.removeDuplicate(input);
	for(int i=0;i<r.numberOfElementsInOutput;i++){
		System.out.println(output[i]);
	}
		// TODO Auto-generated method stub

	}

}
