package kr.re.kitri.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CommonDao {
	protected Connection connection = null;
	protected String EXIST_CONDITION="ISEXIST = 'T'";
	
	/**
	 * Connect to database.
	 * @return Connection connection
	 */
	public void connectDB() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@14.36.28.200:1521:xe", "KITRI02", "KITRI5678");
			//connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ujin4", "1234");
			connection.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Disconnect to database.
	 * @param Connection connection
	 */
	public void disconnectDB() {
		if (connection != null) {
			try {
				connection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Prepare query to send to database.
	 * @param Connection connection
	 * @param String sql
	 * @return PreparedStatement query
	 */
	public PreparedStatement prepareQuery(String sql) {
		PreparedStatement query = null;
		try {
			query = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return query;
	}
	
	/**
	 * CLose query.
	 * @param PreparedStatement query
	 */
	public void closeQuery(PreparedStatement query) {
		if (query != null) {
			try {
				query.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Get result using prepared query.
	 * @param PreparedStatement query
	 * @return ResultSet result
	 */
	public ResultSet getResult(PreparedStatement query) {
		ResultSet result = null;
		try {
			result = query.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Get number of rows of result.
	 * @param ResultSet result
	 * @return int resultCount
	 */
	public int getResultCount(ResultSet result) {
		int resultCount = 0;
		if (result != null) {
			try {
				result.last();
				resultCount = result.getRow();
				result.beforeFirst();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	    return resultCount;
	}
	
	/**
	 * Close result.
	 * @param ResultSet result
	 */
	public void closeResult(ResultSet result) {
		if (result != null) {
			try {
				result.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void closeAll(PreparedStatement query, ResultSet result) {
	/**
	 * Close result, query, and connection.
	 * @param ResultSet result
	 * @param PreparedStatement query
	 * @param Connection connection
	 */
		closeResult(result);
		closeQuery(query);
		disconnectDB();
	}
}
