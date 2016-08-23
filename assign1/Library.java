package assign1;

import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
/**
 * 
 * @author Avinash Chopra
 * search books by author name  
 */
public class Library {

	// getting input string 
	public static String inputString() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = "";
		try {
			inputString = br.readLine();
		} catch (Exception e) {
			System.out.println("Please Enter the Valid String");
			inputString = inputString();
		}
		return inputString;
	}
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		// creating a dow managr object
		DAOManager daoManager = DAOManager.getInstance() ;
		// book dao creating and passing connection
		BookDAO bookDAO = new  BookDAO(daoManager.getConnection());
		// getting author's first name 
		System.out.println("Enter the First name of Author");
		String fname = inputString();
		//  getting author's last name 
		System.out.println("Enter the Last name of Author");
		String lname =inputString();
		// list of all books belong to that author
		List<Books> bookList = bookDAO.getDetails(fname, lname);
		// if there is nothing then show nothing else show result
		if(bookList != null){
			System.out.println("There is following Detail");
			for (Books books : bookList){
				System.out.println("Title " + books.getTitleName());
				System.out.println("Type " + books.getTitleType());
				System.out.println("price " + books.getTitlePrice());
			}
		}
		// if nothing to show then show message 
		else{
			System.out.println("there is nothing to show");
		}
		// close the connection 
		daoManager.closeConnection();
	}

}
