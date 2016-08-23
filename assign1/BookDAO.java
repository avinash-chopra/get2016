package assign1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
/**
 * 
 * @author Avinash Chopra
 * Book's Data Access Object
 */
public class BookDAO {

	// connection object
	Connection connection;
	// list of books that are going to update
	List<Books> booksDetails;
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
	public List<Books> getDetails(String fname, String lname) throws SQLException{
		try{
			// query to execute at data base
		String query = "SELECT t.title_name,t.title_type,t.title_price "
				+ "FROM titles t "
				+ "INNER JOIN title_author ta "
				+ "ON ta.title_id = t.title_id "
				+ "INNER JOIN authors au "
				+ "ON au.author_id = ta.author_id "
				+ "WHERE au.author_fname = ? AND au.author_lname = ?;";
		PreparedStatement preparedStatement;
		preparedStatement = (PreparedStatement) this.connection.prepareStatement(query);
		preparedStatement.setString(1, fname);
		preparedStatement.setString(2, lname);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()){
			Books books = new Books();
			books.setTitleName(resultSet.getString(1));
			books.setTitleType(resultSet.getString(2));
			books.setTitlePrice(resultSet.getString(3));	
			booksDetails.add(books);
		}	
		}catch(Exception e){
			e.printStackTrace();
		}
		return booksDetails;
	}
	
	
}
