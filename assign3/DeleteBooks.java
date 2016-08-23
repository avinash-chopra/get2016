package assign3;

import java.sql.SQLException;
/**
 * @author Avinash Chopra
 *
 */
public class DeleteBooks {	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		// creating a dao manager
		DAOManager daoManager = DAOManager.getInstance() ;
		//creating a book dao and pass connection object 
		BookDAO bookDAO = new  BookDAO(daoManager.getConnection());
		// execute query 
		int totalDeleteBooks = bookDAO.deleteBooks();
		System.out.println("Total delete row " + totalDeleteBooks);
		// close the connection
		daoManager.closeConnection();
	}
}
