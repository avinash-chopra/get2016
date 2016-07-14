/**
This is calculate waiting time 
 * 
 */

/**
 * @author admin
 *
 */
public class FirstComeFirstServer {

	/**
	 * @param args
	 */
	int jobIndex;
	int jobWaitingTimeIndex;
	int jobStartedIndex;
	int jobFinishedIndex;
	
	public int[][] FCFS(int arrivalTime[] , int jobSize[]){
		int[][] result;
		int time;
		jobIndex = 1;
		jobWaitingTimeIndex = 2;
		jobStartedIndex = 3;
		jobFinishedIndex = 4;
		result = new int[5][5] ; 
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstComeFirstServer tempObject = new FirstComeFirstServer();
			int[] arrivalTime = {1,5,9,25} ;
			int[] jobSize = {12,7,2,5} ;
			int[][] result ;
			result = tempObject.FCFS(arrivalTime,jobSize);
			System.out.println("Job" + "\t" +"Job Arrival Time" + "\t" +
			"Job Waiting Time"+
					"\t"+ "Job Start at" + "\t" + "Job Finished At");
			for(int i=0;i < 4;i++){
				System.out.println(result[1][i] + "\t" + arrivalTime[i] +
						"\t " + result[2][i] +
						"\t" + result[3][i] + "\t" + result[4][i]);
			}
	}

}
