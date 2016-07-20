/**
 * 
 */
package CodeChefProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author admin
 *
 */
class GCDEqualMux {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * This method give integer value if input is give wrong then again it run
	 * till a correct input is not given
	 * 
	 * @return //user input value
	 */
	public int inputMethod() {
		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Please Enter the Valid Number");
			inputNumber = inputMethod();
		}
		return inputNumber;
	}

	public int greatestCommonDivisorOfTwoNumbers(int firstNumber,
			int secondNumber) {

		// Base Condition 
		// second number zero then return first number
		if (secondNumber == 0) {
			return firstNumber;
		}
		// recursive call to numbers 
		else {
			return greatestCommonDivisorOfTwoNumbers(secondNumber, firstNumber
					% secondNumber);
		}
	}
	public static void main(String[] args) throws IOException {
		GCDEqualMux gcdEqualMux = new GCDEqualMux();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = gcdEqualMux.inputMethod();
		while(t-- > 0){
			
		//System.out.println("Enter the size of array");
		int n = gcdEqualMux.inputMethod();
		int arr[] = new int[n];
		//System.out.println("Enter the numbers ");
		String s[]=br.readLine().split(" ");
		
		for(int i = 1;i<=n;i++)
		{
			arr[i-1]=Integer.parseInt(s[i-1]);
		}
		
		int low=0;
		int high = 0;
		int first = 0;
		int last = 1;
		for(int i=first;i<n;i++){
			int mux = arr[i];
			int tempLow = i;
			int tempHigh  = 0 ;
			if(i >= last){
				last = i+1;
			}
			for(;last<n;){
				int tempGCD  = gcdEqualMux.greatestCommonDivisorOfTwoNumbers(mux, arr[last]);
				//System.out.println(tempGCD);
				if(tempGCD == 1 && arr[last]!=1){
					mux = mux*arr[last];
					tempHigh = last;
					last++;
				}else{
					if((tempHigh-tempLow) > (high-low)){
						low = tempLow;
						high = tempHigh;
					}
					//System.out.println("multiplie value " + mux);
					mux = mux/arr[i];
					break;
					
				}
				if((tempHigh-tempLow) > (high-low)){
					low = tempLow;
					high = tempHigh;
				}
			}
		}

		if(high-low > 0){
			//for(int i=low;i<=high;i++){
			//	System.out.print(arr[i]+"\t");
			//}
			System.out.println(high-low+1);
		}
		else{
			System.out.println("-1");
		}
	}
	}
}
