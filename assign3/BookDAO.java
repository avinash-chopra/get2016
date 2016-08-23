package assign3;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
/**
 * 
 * @author Avinash Chopra
 * Book's Data Access Object Class
 */
public class BookDAO {

	// Connection object 
	Connection connection;

	// connection set 
	public BookDAO(Connection conn){
		this.connection = conn;
	}

	// setting connection
	public void setConnection(Connection conn){
		this.connection = conn;
	}
	/**
	 * Delete the books not issue in past year
	 * @return 	// number of row effected
	 */
	public int deleteBooks() throws SQLException{
		int  rowsDeleted = 0;
		try{
			String query = "DELETE b.* FROM Books b "
					+ "LEFT JOIN book_issue bi ON b.accession_number = bi.accession_number "
					+ "WHERE bi.issue_date IS NULL OR bi.accession_number NOT IN "
					+ "(SELECT accession_number FROM Book_Issue WHERE DATEDIFF(CURRENT_TIMESTAMP,issue_date) <= 365);";
			PreparedStatement preparedStatement;
			preparedStatement = (PreparedStatement) this.connection.prepareStatement(query);
			rowsDeleted = preparedStatement.executeUpdate();

		}catch(Exception e){
			e.printStackTrace();
		}
		return rowsDeleted;
	}


}
