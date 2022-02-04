package kr.re.kitri.domain;

public class OrderRoomBean {
	private int orderId;
	private int roomId;
	private int userId;
	private int numberPeople;
	
	/**
	 * Set ID of order.
	 * @param int orderId
	 * @see {@link kr.re.kitri.domain.OrderTotalBean#getId() OrderTotalBean.id}
	 */
	public void setOrderId (int orderId) {
		this.orderId = orderId;
	}
	
	/**
	 * Get ID of order.
	 * @return int orderId
	 * @see {@link kr.re.kitri.domain.OrderTotalBean#getId() OrderTotalBean.id}
	 */
	public int getOrderId () {
		return orderId;
	}
	
	/**
	 * Set ID of room.
	 * @param int roomId
	 * @see {@link kr.re.kitri.domain.RoomBean#getId() RoomBean.id}
	 */
	public void setRoomId (int roomId) {	
		this.roomId = roomId;
	}
	
	/**
	 * Get ID of room.
	 * @return int roomId
	 * @see {@link kr.re.kitri.domain.RoomBean#getId() RoomBean.id}
	 */
	public int getRoomId () {
		return roomId;
	}
	
	/**
	 * Set ID of user.
	 * @param int userId
	 * @see {@link kr.re.kitri.domain.UserBean#getId() UserBean.id}
	 */
	public void setUserId (int userId) {
		this.userId = userId;
	}
	
	/**
	 * Get ID of user.
	 * @return int userId
	 * @see {@link kr.re.kitri.domain.UserBean#getId() UserBean.id}
	 */
	public int getUserId () {
		return userId;
	}
	
	/**
	 * Set number of people using the room.
	 * @param int numberPeople
	 */
	public void setNumber (int numberPeople) {	
		this.numberPeople = numberPeople;
	}
	
	/**
	 * Get number of people using the room.
	 * @return int numberPeople
	 */
	public int getNumber () {
		return numberPeople;
	}
}
	
	