package assign3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 
 * @author Avinash Chopra
 * Data Access Object Manager
 */
public class DAOManager {

	// Connection reference
	Connection connection;
	// a static dao manager for singleton use
	private static DAOManager daoManager ;
	/**
	 * private constructor for singleton class
	 */
	private DAOManager() {
		connection = null;
	}

	/**
	 * @return // return connection object
	 * @throws SQLException // if sql run time error come
	 * @throws ClassNotFoundException //if class not found
	 */
	public Connection getConnection() throws SQLException, ClassNotFoundException{
		if(this.connection == null || this.connection.isClosed() ){
			try{
				String host = "jdbc:mysql://localhost:3306/";
				String dbName = "library";
				String mysqlURL = host+dbName;
				String userId = "root";
				String password = "root";
				Class.forName("com.mysql.jdbc.Driver");
				this.connection = DriverManager.getConnection(mysqlURL, userId, password);
			}
			catch(SQLException sqlEx){
				sqlEx.printStackTrace();
			}
		}
		return connection;
	}
	/**
	 * 
	 * @return if connection close successfully then return true else false
	 */
	public boolean closeConnection() throws SQLException{
		if(this.connection.isClosed() == false ){
			this.connection.close();
			return true;
		}
		else{
			return false;
		}
	}
	/**
	 * use to open or initialize connection 
	 * @return if already open then return false else return true 
	 * @throws SQLException // if sql run time error come
	 * @throws ClassNotFoundException //if class not found
	 */
	public boolean openConnection() throws SQLException, ClassNotFoundException{
		if(this.connection == null || this.connection.isClosed()){
			this.connection = getConnection();
			return true;
		}
		else{
			return true;
		}
	}
	
	/**
	 * use to implement singleton class of dao manager
	 * @return return dao manager
	 */
	public static DAOManager getInstance(){
		// if null then create object 
		if(daoManager == null){
			daoManager = new DAOManager();
		}
		return daoManager;
	}
		
}
