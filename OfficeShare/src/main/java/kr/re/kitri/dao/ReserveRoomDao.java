package kr.re.kitri.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.re.kitri.domain.BoardBean;
import kr.re.kitri.domain.ReserveRoomBean;
import kr.re.kitri.domain.RoomBean;

public class ReserveRoomDao extends CommonDao{

	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
    
	//데이터 베이스 연결 메소드
	public ReserveRoomDao() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@14.36.28.200:1521:xe", "KITRI02", "KITRI5678");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // ReserveRoomDao 종료

	/**
	 * All of booking list
	 * @return a_tb
	 */
	// 전체 예약 리스트 출력하는 메소드
	public List<ReserveRoomBean> getReservationAll() {
		
		List<ReserveRoomBean> a_rrb = new ArrayList<ReserveRoomBean>();
		try {
			stmt = con.createStatement();
			String sql = "SELECT ROOM_ID, RESERVED_DATE, ROOM_NAME FROM RESERVED_ROOM"; //카테고리는 조회용으로만 필요해서 넣지 않았습니다
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				ReserveRoomBean rrb = new ReserveRoomBean();
				rrb.setRoomId(rs.getInt(1));
				rrb.setReservedDate(rs.getString(2));
				rrb.setRoomName(rs.getString(3));
				

				a_rrb.add(rrb);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null) 
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return a_rrb;
	} // getReservationAll 메소드 종료
	
	
	
	/**Search the empty room
	 * 
	 * 
	 * @param start
	 * @param end
	 * @param category
	 * @return
	 */
	// 예약 조회 메소드
	// 2개이상 조회되면 예약불가(방 종류가 2개이므로 1개가 조회되면 예약은 가능함)
	// 2개가 조회되는 경우 roomId가 같으면 예약 가능 (RoomId가 다른 방은 비어있기 때문에)
	public List<ReserveRoomBean> getSelected(String start, String end, String category) {
	     	List<ReserveRoomBean> a_rrb = new ArrayList<ReserveRoomBean>();
		try {
			stmt = con.createStatement();  
			String sql = "SELECT COUNT(ROOM_ID), ROOM_ID FROM RESERVED_ROOM\r\n" 
					+ "WHERE ROOM_CATEGORY = '" + category + "' AND TO_CHAR(RESERVED_DATE, 'YYYY-MM-DD') BETWEEN '" + start + "' AND '" + end + "'\r\n" 
					+ "GROUP BY ROOM_ID";
			
			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				ReserveRoomBean rrb = new ReserveRoomBean();
				rrb.setCount(rs.getInt(1));
				rrb.setRoomId(rs.getInt(2));
				
				a_rrb.add(rrb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null) // Connection 이 있을경우만 닫기
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return a_rrb;
	} // getSelected 메소드 종료 지점
	
	/**get id of room
	 * 
	 * @param start
	 * @param end
	 * @param category
	 * @return
	 */
	//비어있는 방의 아이디를 가져오는 메소드
	public List<RoomBean> getRoomId(String start, String end, String category) {
     	List<RoomBean> a_rb = new ArrayList<RoomBean>();
	try {
		stmt = con.createStatement();  
		String sql = "SELECT ID FROM ROOM "
				+ " WHERE CATEGORY = '" + category + "' AND ID NOT IN (SELECT ROOM_ID FROM RESERVED_ROOM WHERE ROOM_CATEGORY = '" 
				+ category + "' AND TO_CHAR(RESERVED_DATE,'YYYY-MM-DD') BETWEEN '" + start + "' AND '" + end + "')";

		System.out.println(sql);
		rs = stmt.executeQuery(sql);
		if (rs.next()) {   //if로 하면 하나의 값만 저장
			RoomBean rb = new RoomBean();
			rb.setId(rs.getInt(1));
			
			a_rb.add(rb);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (con != null) // Connection 이 있을경우만 닫기
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return a_rb;
} // getRoomId 메소드 종료 지점
	
	
	
	/**
	 * insert booking detail into database
	 */
	// 예약내용 데이터베이스에 입력하는 메소드
	public int insertReservation(ReserveRoomBean rrb) {
		// Driver Load
		int result_cnt = 0;
		CallableStatement cs = null;
		try {
			String sql = "{call KITRI02.RESERVED_DATE(?,?,?,?)}";
			cs = con.prepareCall(sql);
			cs.setInt(1, rrb.getRoomId());
			cs.setString(2, rrb.getCategory());
			cs.setString(3, rrb.getStart());
			cs.setString(4, rrb.getEnd());
			System.out.println(rrb.getRoomId() + " " + rrb.getCategory() + " " + rrb.getStart() + " " + rrb.getEnd());
			// result_cnt => DML문 실행 시켰을 시 반영된 결과의 갯수
			boolean test = cs.execute();
			System.out.println(test);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (cs != null)
					cs.close();
				if (con != null) // Connection 이 있을경우만 닫기
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result_cnt;
	} // insertReservation 메소드 종료

	
	
	
	/** 
	 * delete booking
	 */
	// 예약취소하는 메소드
	public int deleteReservation(ReserveRoomBean rrb) {
		int result_cnt = 0;
		try {
			String sql = "DELETE FROM RESERVATED_ROOM\r\n" + "WHERE ROOM_ID = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, rrb.getRoomId());
			// result_cnt => DML문 실행 시켰을 시 반영된 결과의 갯수
			result_cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null) // Connection 이 있을경우만 닫기
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result_cnt;
	}//deleteReservation 메소드 종료

	/*public int searchRoom(ReserveRoomBean rrb) {
		int resultCount = 0;
		try {
			String sql = "SELECT RESERVED_DATE, ROOM_NAME FROM RESERVED_ROOM "
					+ " WHERE CATEGORY = ? AND TO_CHAR(RESERVED_DATE) IN ? AND ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, rrb.getCategory());
			pstmt.setString(2, rrb.getStart());
			pstmt.setString(3, rrb.getEnd());
			resultCount = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null) // Connection 이 있을경우만 닫기
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultCount;
	}*/
	
	
	


} //클래스 종료
