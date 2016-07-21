package check;
import java.util.Arrays;
/**
 * 
 * @author Avinash Chopra
 * Date 21 july 2016
 *	This use  compararator to sort the array of object
 */
public class QuestionComparator {
	public static void main(String[] args) {

		// make a array of question type object
		Questions[] questionsArray = new Questions[4];
		questionsArray[0] = new Questions("Overall Rating", "Single Select", "1/2/3/4/5");
		questionsArray[1] = new Questions("Area of improvement", "Multi Select", "Service Quality/ Communication/ Delivery Process");
		questionsArray[2] = new Questions("Feedback", "Text", "");
		questionsArray[3] = new Questions("Strengths", "Text", "");
		// call the sort array
		Arrays.sort(questionsArray);
		System.out.println("Default Sorting :\n"
				+ Arrays.toString(questionsArray));
System.out.println("-----------------------------------------------------------------------------------------------\n");
		
		// sort employees array using Comparator by Name
		Arrays.sort(questionsArray, Questions.TextComparator);
		System.out
				.println("Employee  list sorted by Name:\n" + Arrays.toString(questionsArray));
	}

}
