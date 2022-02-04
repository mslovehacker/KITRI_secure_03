package kr.re.kitri.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import kr.re.kitri.domain.UserBean;

public class UserDao extends CommonDao{
	private String USER_TABLE = "SO1_USER";
	private String USER_COLUMNS = "ID, NAME, ROLE, BIRTH, GENDER, PHONE, EMAIL, ADDRESS, FIELD";
	//private String USER_COLUMNS = "ID, PW, NAME, ROLE, BIRTH, GENDER, PHONE, EMAIL, ADDRESS, FIELD";
	
	/**
	 * Search user input ID from database.
	 * If you set optionExist true (default), search from database except deleted users.
	 * And if you set optionExist false, search from database including deleted users.
	 * @param id [String]
	 * @param optionExist [boolean, default: true]
	 * @return returnValue [int]
	 */
	public int searchId(String id, boolean optionExist) {
		int returnValue = 0;
		connectDB();
		String sql = "SELECT ID\nFROM "+USER_TABLE+"\nWHERE "
				+EXIST_CONDITION+" AND ID = ?";
		if(!optionExist) {
			sql = "SELECT ID\nFROM "+USER_TABLE+"\nWHERE ID = ?";
		}
		PreparedStatement query = prepareQuery(sql);
		try {
			query.setString(1, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ResultSet result = getResult(query);
		returnValue = getResultCount(result);
		closeAll(query, result);
		return returnValue;
	}
	
	/**
	 * Search user input ID from database.
	 * If you set optionExist true (default), search from database except deleted users.
	 * And if you set optionExist false, search from database including deleted users.
	 * @param id [String]
	 * @return returnValue [int]
	 */
	public int searchId(String id) {
		return searchId(id, true);
	}
	
	/**
	 * Judge whether user input PW is same or not with PW from database.
	 * @param userB [UserBean] id, pw
	 * @return returnValue [boolean]
	 */
	public int matchPw(UserBean userB) {
		int returnValue = 0;
		connectDB();
		String sql = "SELECT PW\nFROM "+USER_TABLE+"\nWHERE "
			+EXIST_CONDITION+" AND ID = ?";
		PreparedStatement query = prepareQuery(sql);
		try {
			query.setString(1, userB.getId());
			ResultSet result = getResult(query);
			while(result.next()) {
				if(result.getString(1).equals(userB.getPw())) {
					returnValue = 1;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeQuery(query);
		disconnectDB();
		return returnValue;
	}
	
	/**
	 * Get user data by user input ID from database.
	 * If you set optionAll true, search all information of user from database.
	 * And if you set optionAll false(default), search only ID, name, and role of user from database.
	 * @param id [String]
	 * @param optionAll [boolean, default: false]
	 * @return returnB [UserBean]
	 */
	public UserBean getUser(String id, boolean optionAll) {
		UserBean returnB = new UserBean();
		connectDB();
		String sql = null;
		PreparedStatement query = null;
		try {
			if(!optionAll) {
				sql = "SELECT ID, NAME, ROLE\nFROM "+USER_TABLE+"\nWHERE "
						+EXIST_CONDITION+" AND ID = ?";
					query = prepareQuery(sql);
					query.setString(1, id);
					ResultSet result = getResult(query);
					while(result.next()) {
						returnB.setId(result.getString(1));
						returnB.setName(result.getString(2));
						returnB.setRole(result.getString(3));
					}
			} else {
				sql = "SELECT "+USER_COLUMNS+"\nFROM "+USER_TABLE+"\nWHERE "
						+EXIST_CONDITION+" AND ID = ?";
					query = prepareQuery(sql);
					query.setString(1, id);
					ResultSet result = getResult(query);
					while(result.next()) {
						returnB.setId(result.getString(1));
						returnB.setName(result.getString(2));
						returnB.setRole(result.getString(3));
						returnB.setBirth(result.getDate(4));
						returnB.setGender(result.getString(5));
						returnB.setPhone(result.getString(6));
						returnB.setEmail(result.getString(7));
						returnB.setAddress(result.getString(8));
						returnB.setField(result.getString(9));
					}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeQuery(query);
		disconnectDB();
		return returnB;
	}
	
	/**
	 * Get all user data by user input ID from database.
	 * @return returnB [UserBean[]]
	 */
	public UserBean[] getAllUser() {
		UserBean[] returnB = null;
		connectDB();
		String sql = null;
		PreparedStatement query = null;
		try {
			sql = "SELECT "+USER_COLUMNS+"\nFROM "+USER_TABLE+"\nWHERE "
					+EXIST_CONDITION;
				query = prepareQuery(sql);
				ResultSet result = getResult(query);
				returnB = new UserBean[getResultCount(result)];
				int i = 0;
				while(result.next()) {
					UserBean userB = new UserBean();
					userB.setId(result.getString(1));
					userB.setName(result.getString(2));
					userB.setRole(result.getString(3));
					userB.setBirth(result.getDate(4));
					userB.setGender(result.getString(5));
					userB.setPhone(result.getString(6));
					userB.setEmail(result.getString(7));
					userB.setAddress(result.getString(8));
					userB.setField(result.getString(9));
					returnB[i++] = userB;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeQuery(query);
		disconnectDB();
		return returnB;
	}
	
	/**
	 * Get user data by user input ID from database.
	 * If you set optionAll true, search all information of user from database.
	 * And if you set optionAll false(default), search only ID, name, and role of user from database.
	 * @param id [String]
	 * @return returnB [UserBean] id, name, role
	 */
	public UserBean getUser(String id) {
		return getUser(id, false);
	}
	
	/**
	 * Insert user data to database.
	 * @param userB [UserBean]
	 * @return resultCount [int]
	 */
	public int insertUser(UserBean userB) {
		connectDB();
		int resultCount = 0;
		String sql = "INSERT INTO "+USER_TABLE+"(ID, PW, NAME, BIRTH, GENDER, PHONE, EMAIL, ADDRESS, FIELD)"
		    +"\nVALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement query = prepareQuery(sql);
		try {
			query.setString(1, userB.getId());
			query.setString(2, userB.getPw());
			query.setString(3, userB.getName());
			query.setDate(4, userB.getBirth());
			query.setString(5, userB.getGender());
			query.setString(6, userB.getPhone());
			query.setString(7, userB.getEmail());
			query.setString(8, userB.getAddress());
			query.setString(9, userB.getField());
			resultCount = query.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeQuery(query);
		disconnectDB();
		return resultCount;
	}

	/**
	 * Modify user data to database.
	 * @param userB [UserBean]
	 * @return resultCount [int]
	 */
	public int modifyUser(UserBean userB) {
		connectDB();
		int resultCount = 0;
		String sql = "UPDATE "+USER_TABLE+"\r\n"
		    +"SET PW=?, NAME=?, BIRTH=?, GENDER=?, PHONE=?, EMAIL=?, ADDRESS=?, FIELD=?\r\n"
		    +"WHERE "+EXIST_CONDITION+"AND ID=?";
		PreparedStatement query = prepareQuery(sql);
		try {
			query.setString(1, userB.getPw());
			query.setString(2, userB.getName());
			query.setDate(3, userB.getBirth());
			query.setString(4, userB.getGender());
			query.setString(5, userB.getPhone());
			query.setString(6, userB.getEmail());
			query.setString(7, userB.getAddress());
			query.setString(8, userB.getField());
			query.setString(9, userB.getId());
			resultCount = query.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeQuery(query);
		disconnectDB();
		return resultCount;
	}
	
	/**
	 * Delete user data to database.
	 * @param userId [String]
	 * @return resultCount [int]
	 */
	public int deleteUser(String userId) {
		connectDB();
		int resultCount = 0;
		String sql = "UPDATE "+USER_TABLE+"\r\n"
		    +"SET ISEXIST='F'\r\nWHERE ID=?";
		PreparedStatement query = prepareQuery(sql);
		try {
			query.setString(1, userId);
			resultCount = query.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeQuery(query);
		disconnectDB();
		return resultCount;
	}
}
