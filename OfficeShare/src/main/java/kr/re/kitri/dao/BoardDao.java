package kr.re.kitri.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import kr.re.kitri.domain.BoardBean;
import kr.re.kitri.domain.UserBean;

/**
 * @see {@link kr.re.kitri.util.CommonDao CommonDao}
 */
public class BoardDao extends CommonDao {
	private String SOURCE_TABLE = "BOARD";
	private String ALL_COLUMNS = "ID, USER_ID, SUBJECT, CONTENT, WRITE_AT, PROTECT, HIT";

	/**
	 * Get all post list from database.
	 * 
	 * @return BoardBean[] allPost
	 */
	public BoardBean[] getAllBoard() {
		connectDB();
		ALL_COLUMNS = "ID, USER_ID, SUBJECT, WRITE_AT, PROTECT, HIT, CONTENT, ROUND(SYSDATE-WRITE_AT)";
		String sql = "SELECT " + ALL_COLUMNS + "\nFROM " + SOURCE_TABLE + "\nWHERE " + EXIST_CONDITION + "  ORDER BY WRITE_AT DESC";
		PreparedStatement query = prepareQuery(sql);
		ResultSet result = getResult(query);

		BoardBean[] allPost = new BoardBean[getResultCount(result)];
		int i = 0;

		try {
			while (result.next()) {
				BoardBean boardBean = new BoardBean();

				boardBean.setId(result.getInt(1));
				boardBean.setUserId(result.getString(2));
				boardBean.setSubject(result.getString(3));
				boardBean.setWriteAt(result.getDate(4));
				if (result.getString(5).equals("T")) {
					boardBean.setProtect(true);
				} else {
					boardBean.setProtect(false);
				}
				boardBean.setHit(result.getInt(6));
				boardBean.setContent(result.getString(7));
				boardBean.setNewyn(result.getInt(8));
				allPost[i++] = boardBean;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeAll(query, result);

		return allPost;
	}

	/**
	 * Get selected post list from database.
	 * 
	 * @return BoardBean onePost
	 */
	public BoardBean getOneBoard(int postId) {
		connectDB();
		ALL_COLUMNS = "ID, USER_ID, SUBJECT, WRITE_AT, PROTECT, HIT, CONTENT";
		String sql = "SELECT " + ALL_COLUMNS + "\nFROM " + SOURCE_TABLE + "\nWHERE " + EXIST_CONDITION + " AND ID = ?";
		PreparedStatement query = prepareQuery(sql);
		BoardBean onePost = new BoardBean();
		ResultSet result = null;
		try {
			query.setInt(1, postId);
			result = getResult(query);
			if (result.next()) {
				onePost.setId(result.getInt(1));
				onePost.setUserId(result.getString(2));
				onePost.setSubject(result.getString(3));
				onePost.setWriteAt(result.getDate(4));
				if (result.getString(5).equals("T")) {
					onePost.setProtect(true);
				} else {
					onePost.setProtect(false);
				}
				onePost.setHit(result.getInt(6));
				onePost.setContent(result.getString(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeAll(query, result);

		return onePost;
	}

	public String getDate() {
		connectDB();
		String sql = "select SYSDATE FROM BOARD";
		try {
			PreparedStatement query = prepareQuery(sql);
			ResultSet result = getResult(query);

			if (result.next()) {
				return result.getString(1);
			} else
				return "";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	public int getNext() {
		connectDB();
		String sql = "select ID from BOARD order by ID desc";
		try {
			PreparedStatement query = prepareQuery(sql);
			ResultSet result = getResult(query);

			if (result.next()) {
				return result.getInt(1) + 1;
			}
			return 1; // first
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; // error
	}

	// 조회수
	public int updateHitCount(int num) {
		connectDB();
		int result = 0;
		String sql = "update BOARD set HIT = HIT + 1";
		sql += "where ID=?"; // or num instead of ID
		try {
			PreparedStatement pstmt = prepareQuery(sql);
			pstmt.setInt(1, num);

			result = pstmt.executeUpdate();// SQL문 수행
			closeQuery(pstmt);
			connection.commit();
			disconnectDB();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}

		return result;
	}

	public int insertBoard(BoardBean bb) {
		connectDB();
		int result = 0;

		try {
			ALL_COLUMNS = "(ID, USER_ID, SUBJECT, CONTENT, PROTECT)";
			String sql = "INSERT INTO BOARD" + ALL_COLUMNS + "VALUES" + "((SELECT MAX(ID+1) FROM BOARD),?,?,?,?)";

			PreparedStatement pstmt = prepareQuery(sql);

			pstmt.setString(1, bb.getUserId());
			pstmt.setString(2, bb.getSubject());
			pstmt.setString(3, bb.getContent());
			// pstmt.setBoolean(6, bb.getProtect());
			pstmt.setInt(4, 0); // zero initialize
			if (bb.getProtect()) {
				pstmt.setString(4, "T");
			} else {
				pstmt.setString(4, "F");
			}

			System.out.println(bb.getUserId());

			result = pstmt.executeUpdate();
			closeQuery(pstmt);
			connection.commit();
			disconnectDB();

		} catch (Exception ex) {
			ex.printStackTrace();

		}

		return result;

	}

	// 수정
	public int updateBoard(BoardBean bb) {
		connectDB();
		int result = 0;

		String sql = "UPDATE BOARD SET SUBJECT = ?, CONTENT = ?, PROTECT = ?";
		sql += "WHERE ID = ?";

		PreparedStatement pstmt = prepareQuery(sql);

		try {
			pstmt.setString(1, bb.getSubject());
			pstmt.setString(2, bb.getContent());
			// pstmt.setString(3, getDate());// DATE?
			pstmt.setString(3, "T");
			pstmt.setInt(4, bb.getId());
			System.out.println(bb.getId());

			result = pstmt.executeUpdate();
			closeQuery(pstmt);
			connection.commit();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnectDB();
		}

		return result;
	}

	public int deleteBoard(int id) {
		connectDB();
		int result = 0;

		String sql = "UPDATE BOARD SET ISEXIST = ?";
		sql += "WHERE ID = ?";

		PreparedStatement pstmt = prepareQuery(sql);

		try {
			pstmt.setBoolean(1, false);
			pstmt.setInt(2, id);

			result = pstmt.executeUpdate();
			closeQuery(pstmt);
			connection.commit();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnectDB();
		}

		return result;
	}
	
	public int hitBoard(int id) {
	      connectDB();
	      int result = 0;

	      String sql = "UPDATE BOARD SET HIT = HIT+1";
	      sql += "WHERE ID = ? AND ISEXIST = 'T'";

	      PreparedStatement pstmt =prepareQuery(sql);

	      try {	         
	         pstmt.setInt(1, id);
	         
	         result = pstmt.executeUpdate();
	         closeQuery(pstmt);
	         connection.commit();
	         
	      } catch (SQLException e) {         
	         e.printStackTrace();
	      } finally {
	         disconnectDB();
	      }

	      

	      return result;
	   }
}