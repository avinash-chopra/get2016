package assign2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class BookAvailableOrNot {

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
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// creating a dao manager
				DAOManager daoManager = DAOManager.getInstance() ;
				//creating a book dao and pass connection object 
				BookDAO bookDAO = new  BookDAO(daoManager.getConnection());
				// input title name of book
				System.out.println("Enter the Title name of book");
				String titleName = inputString();
				// execute query 
				bookDAO.getDetails(titleName);
				//System.out.println("Total delete row " + totalDeleteBooks);
				// close the connection
				daoManager.closeConnection();

	}

}
