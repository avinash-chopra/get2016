import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortingArray {
	public int[] join(int a[], int asize, int b[], int bsize, int c[]){
		int aIndex ;
		int bIndex ;
		int cIndex ;
		
		aIndex = 0;
		bIndex = 0;
		cIndex = 0;
		 for(int i = 0; aIndex < asize && bIndex < bsize ; i++){
			 if(a[aIndex] > b[bIndex] ){
				 c[i] = b[bIndex] ;
				 bIndex++; 
			 }else{
				 c[i] = a[aIndex];
				 aIndex++;
			 }	 
			 cIndex = i;
		 }
		 if(aIndex == asize){
			 for(int i = bIndex ; i < bsize ; i++){
				 cIndex++ ;
				 c[cIndex] = b[bIndex] ;
				 bIndex++;
			 }
		 }else{
			 for(int i = aIndex ; i < asize ; i++){
				 cIndex++ ;
				 c[cIndex] = a[aIndex] ;
				 aIndex++;
			 }
		 }
		 
		
		return c;
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
			int MAX_ARRAY_SIZE = 20;
			SortingArray sortingArray = new SortingArray();
			System.out.println("Enter the a array length");
			int aLength = sortingArray.inputMethod();
			System.out.println("Enter the b array length");
			int bLength = sortingArray.inputMethod();
			int [] aArray = new int[aLength];
			int [] bArray = new int[bLength];
			System.out.println("Enter the A array");
			for(int i=0;i<aLength;i++){
				aArray[i] = sortingArray.inputMethod();
			}
			System.out.println("Enter the B array");
			for(int i=0;i<bLength;i++){
				bArray[i] = sortingArray.inputMethod();
			}
			int c[] = new int[MAX_ARRAY_SIZE] ;
			int d[] = sortingArray.join(aArray,aLength , bArray, bLength, c);
			for(int i=0;i<(aArray.length+bArray.length);i++){
				System.out.println(d[i]);
			}
			System.out.println("Enter 1 for run again else enter any othre number ");
			loopVariable = sortingArray.inputMethod();
		}
	}
}
