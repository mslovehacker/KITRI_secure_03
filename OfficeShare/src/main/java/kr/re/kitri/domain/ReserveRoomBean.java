package kr.re.kitri.domain;

public class ReserveRoomBean {
	private int roomId;
	private String reservedDate;
	private String roomName;
	private String category;
	private String start;
	private String end;
	private int count;
	
	
	
	/**
	 * Set id of room order.
	 * @param int roomId
	 */
	public void setRoomId (int roomId) {
		this.roomId = roomId;
	}
	
	/**
	 * Get id of room order.
	 * @return int roomId
	 */
	public int getRoomId () {
		return roomId;
	}
		
	/**
	 * Set name of room.
	 * @param String roomName
	 */
	public void setRoomName (String roomName) {
		this.roomName = roomName;
	}
	
	/**
	 * Get name of room.
	 * @return roomName name
	 */
	public String getRoomName () {
		return roomName;
	}
	
	/**
	 * Set start time of rent.
	 * @param String start
	 */
	public void setReservedDate (String reservedDate) {	
		this.reservedDate = reservedDate;
	}
	
	/**
	 * Get start time of rent.
	 * @return String start
	 */
	public String getReservedDate () {
		return reservedDate;
	}
	
	
	/**
	 * Set category of rent.
	 * @param String category
	 */
	public void setCategory (String category) {	
		this.category = category;
	}
	
	/**
	 * Get category of rent.
	 * @return String category
	 */
	public String getCategory () {
		return category;
	}
	
	/**
	 * Set start of rent.
	 * @param String start
	 */
	public void setStart (String start) {	
		this.start = start;
	}
	
	/**
	 * Get start of rent.
	 * @return String start
	 */
	public String getStart () {
		return start;
	}
	
	/**
	 * Set end of rent.
	 * @param String end
	 */
	public void setEnd (String end) {	
		this.end = end;
	}
	
	/**
	 * Get end of rent.
	 * @return String end
	 */
	public String getEnd () {
		return end;
	}

	public void setCount(int count) {
		this.count = count;
		
	}
	
	public int getCount() {
		return count;
	}

	
}