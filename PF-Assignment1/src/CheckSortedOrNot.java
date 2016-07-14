/**
 * This is to check given array is in sorted order or not. 
 *  1 if array is in ascending order, 2 if array is in descending order,
 *   0 if array is not in sorted

 * 
 */

/**
 * @author Avinash
 *
 */
public class CheckSortedOrNot {

	/**
	 * @param args
	 */
	public int sortedOrNOt(int[] inputArray){
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckSortedOrNot sample = new CheckSortedOrNot();
		int temp[]={1,2,3,4,5,6};
		int returnValue = sample.sortedOrNOt(temp);
		if(returnValue == 2){
			System.out.println("Array is ascending sorted");
		}else if(returnValue == 1 ){
			System.out.println("Array is descending sorted");
		}else{
			System.out.println("Array is not sorted");
		}
		
	}

}
