import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
This is calculate waiting time and Job Started and Job Finished time  
 * 
 */
public class FirstComeFirstServer {
	
	int jobIndex;
	int jobWaitingTimeIndex;
	int jobStartedIndex;
	int jobFinishedIndex;
	
	public int[][] FCFS(int arrivalTime[] , int jobSize[]){
		/*
		 * In this method we take a variable time through we check 
		 * if arrival time < time then process should wait
		 * and assign value according to it
		 */
		int[][] result;
		int time;
		jobIndex = 1;
		jobWaitingTimeIndex = 2;
		jobStartedIndex = 3;
		jobFinishedIndex = 4;
		
		result = new int[arrivalTime.length+1][arrivalTime.length+1] ; 
		time = 0;
		for(int i=0; i < arrivalTime.length ;i++){
			result[jobIndex][i] = i+1;
			if(arrivalTime[i] >= time){
				result[jobWaitingTimeIndex][i] = 0;
				result[jobStartedIndex][i] = arrivalTime[i];
				result[jobFinishedIndex][i] = arrivalTime[i] + jobSize[i] - 1 ;
				time = arrivalTime[i] + jobSize[i] ;
			}else{
				result[jobWaitingTimeIndex][i] = time- arrivalTime[i];
				result[jobStartedIndex][i] = time;
				result[jobFinishedIndex][i] = time + jobSize[i] - 1 ;
				time = time + jobSize[i] ;
			}
		}	
		return result;
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
		
		FirstComeFirstServer firstComeFirstServer = new FirstComeFirstServer();
		System.out.println("Enter the length of array of Arrival time or Job Time");
		int arrayLength = firstComeFirstServer.inputMethod();
		System.out.println("Enter the Arrival times of jobs");
		int[] arrivalTime = new int[arrayLength] ;
		int[] jobSize = new int[arrayLength] ;
		for(int i=0 ;i < arrayLength ;i++){
			arrivalTime[i] = firstComeFirstServer.inputMethod();
		}
		System.out.println("Enter the Job Sizes");
		for(int i=0 ;i < arrayLength ;i++){
			jobSize[i] = firstComeFirstServer.inputMethod();
		}
			int[][] result ;
			result = firstComeFirstServer.FCFS(arrivalTime,jobSize);
			System.out.println("Job" + "\t" +" Arrival Time" + "\t" +
			"Waiting Time"+
					"\t"+ "Start at" + "\t" + "Finished At");
			for(int i=0;i < 4;i++){
				System.out.println(result[1][i] + "\t" + arrivalTime[i] +
						"\t\t " + result[2][i] +
						"\t\t" + result[3][i] + "\t\t" + result[4][i]);
			}
	}

}
