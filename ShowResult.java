package session2;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ShowResult {
	
	public void showResult(SelectQuestion selectQuestion, int totalUser) throws FileNotFoundException{
		int tempArray[] = new int[10] ;
		for(int i=0;i<totalUser;i++){
			int tempRating = selectQuestion.overallRating[i] ;
			tempArray[tempRating]++;
		}
		for(int i=0;i<5;i++){
			double percentUser = tempArray[(i+1)];
			percentUser *=100;
			percentUser = (percentUser/totalUser);
			System.out.println((i+1)+" - "+percentUser+"%");
		}
		
		String allThings = "";
		for(int i=0;i<totalUser;i++){
			String tempString = selectQuestion.overallRating[i] +"\t";
			tempString += selectQuestion.areaOfImprovement[i]+"\t";
			tempString += selectQuestion.feedback[i]+"\t";
			System.out.println("user " +(i+1)+" Enter these things \n" +tempString );
			allThings += tempString;
		}
		
		PrintWriter out = new PrintWriter("output.txt");
		out.print(allThings);
		out.close();
	}

}
