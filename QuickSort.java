import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * 
 * @author Avinash
 * @Date 16 july 2016
 *
 */

public class QuickSort {


	/**
	 * 
	 * @param numbers 		numbers to be sort store in a numbers array
	 * @param lower			this is a index and represent lower elements index  
	 * @param upper			represent upper elements's index 
	 * @return				return a sorted array of numbers 
	 * 
	 * This function use recursion method to solve sorting.
	 * A number taken as a reference then smaller then this shifted to left side and 
	 * numbers greater then reference number shifted to right side.
	 *   
	 */
	public int[] quickSorting(int numbers[], int lower, int upper){
		//upper should be grater then lower if it is not then there is only one element in array
		if(upper > lower ){
			
			// pivot is the reference number 
			int pivot = numbers[lower];
			int firstIndexFromSortingStart = lower; 	//next of pivot index
			int lastIndexTillSortingDone = upper;		//last index or upper index of array
			int temp ;			// use in swapping of numbers
			
			//get Index of pivot element in array  
			while(lastIndexTillSortingDone > firstIndexFromSortingStart){
				
				// check if number is smaller then reference number
				while(numbers[firstIndexFromSortingStart] <= pivot && firstIndexFromSortingStart < upper){
					firstIndexFromSortingStart++;
				}
				
				// check if number is greater then reference number
				while(numbers[lastIndexTillSortingDone] > pivot){
					lastIndexTillSortingDone--;
				}
				
				//if smaller and greater number present then swap then
				if(lastIndexTillSortingDone > firstIndexFromSortingStart){
					// swapping the numbers
					temp = numbers[firstIndexFromSortingStart];
					numbers[firstIndexFromSortingStart] = numbers[lastIndexTillSortingDone];
					numbers[lastIndexTillSortingDone] = temp ;
				}
			}
			
			// swapping of numbers 
			temp = numbers[lower];
			numbers[lower] = numbers[lastIndexTillSortingDone];
			numbers[lastIndexTillSortingDone] = temp ;
			
			// recursion call to lower and upper  arrays
			quickSorting(numbers, lower, lastIndexTillSortingDone-1);
			quickSorting(numbers, lastIndexTillSortingDone+1, upper);

		}
		return numbers;
	}

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	/**
	 * This method give integer value
	 * if input is give wrong then again it run till a correct input
	 * is not given
	 *  
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
		int loopVariable = 1 ; // use to run multiple time quick sort function
		
		// use to run multiple time a function 
		while(loopVariable == 1){
			QuickSort quickSort = new QuickSort();
			int totalNumbers ;
			int numbers [];			// use to hold numbers
			System.out.println("Enter the number of elements to sort");
			totalNumbers = quickSort.inputMethod();
			
			// number should be greater then zero to run method 
			if(totalNumbers > 0){
				System.out.println("Enter the elements");
				numbers = new int[totalNumbers] ;
				// getting numbers 
				for(int i=0; i<totalNumbers ;i++){
					numbers[i] = quickSort.inputMethod();
				}
				
				//calling sorting function 
				numbers = quickSort.quickSorting(numbers, 0, totalNumbers-1);
				// showing output result
				for(int i=0; i<totalNumbers ;i++){
					System.out.print(numbers[i] +"\t");
				}
				System.out.println();
			}
			// if total numbers is less then zero 
			else{
				System.out.println("number of elements are not correct");
			}
			
			System.out.println("Enter 1 for run again");
			System.out.println("For terminate the program give any other number");
			loopVariable = quickSort.inputMethod();
		}
	}
}
