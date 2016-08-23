package assign2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
/**
 * 
 * @author Avinash Chopra
 * Book's Data Access Object
 */
public class BookDAO {

	// connection object
	Connection connection;
	/**
	 * @param conn Connection instance or object
	 */
	public BookDAO(Connection conn){
		this.connection = conn;
	}
	/**
	 * set connection instance 
	 * @param conn Connection instance
	 */
	public void setConnection(Connection conn){
		this.connection = conn;
	}
	/**
	 * give details of book have author name as require 
	 * @param fname First name of Author
	 * @param lname Last Name of Author	
	 * @return  List of Books 
	 * @throws SQLException
	 */
	public void getDetails(String titleName) throws SQLException{
		try{
			// query to execute at data base
			String query = "SELECT COUNT(*) from books b"
					+ " INNER JOIN Titles t ON b.title_id = t.title_id "
					+ "LEFT JOIN book_issue bi ON b.accession_number = bi.accession_number "
					+ "LEFT JOIN book_return br ON b.accession_number = br.accession_number"
					+ " WHERE t.title_name = ? "
					+ "AND (bi.issue_date is NULL || (bi.issue_date is not NULL && br.return_date is not NULL));";
			
			PreparedStatement preparedStatement = null;
			preparedStatement = (PreparedStatement) this.connection.prepareStatement(query);
			preparedStatement.setString(1, titleName);
			ResultSet resultSet = preparedStatement.executeQuery();
			// if result set is null
			if(resultSet != null){
				while(resultSet.next()){
					if(resultSet.getInt(1) > 0){
						System.out.println("Book is available");
					}else{
						System.out.println("Book not available");
					}
				}	
			}
			// if query is not executed
			else{
				System.out.println("Error,Query not executed");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}


}
