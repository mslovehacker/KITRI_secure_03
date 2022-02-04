package kr.re.kitri.domain;

import java.sql.Date;

public class OrderTotalBean {
	private int id;
	private int userId;
	private float totalPrice;
	private Date startAt;
	private Date endAt;
	private Date reserveAt;
	private String status;
	private boolean noShow;
	
	/**
	 * Set ID of order.
	 * @param int id
	 */
	public void setId (int id) {	
		this.id = id;
	}
	
	/**
	 * Get ID of order.
	 * @return int id
	 */
	public int getId () {
		return id;
	}
	
	/**
	 * Set ID of user ordering.
	 * @param int userId
	 * @see {@link kr.re.kitri.domain.UserBean#getId() UserBean.id}
	 */
	public void setUserId (int userId) {	
		this.userId = userId;
	}
	
	/**
	 * Get ID of user ordering.
	 * @return int useId
	 */
	public int getUserId () {
		return userId;
	}
	
	/**
	 * Set total price of order.
	 * @param float totalPrice
	 */
	public void setTotalPrice (float totalPrice) {	
		this.totalPrice = totalPrice;
	}
	
	/**
	 * Get total price of order.
	 * @return float totalPrice
	 */
	public float getTotalPrice () {
		return totalPrice;
	}
	
	/**
	 * Set room rental start time.
	 * @param Date startAt
	 */
	public void setStartAt (Date startAt) {	
		this.startAt = startAt;
	}
	
	/**
	 * Get room rental start time.
	 * @return Date maxNumber
	 */
	public Date getStartAt () {
		return startAt;
	}
	
	/**
	 * Set room rental end time.
	 * @param Date endAt
	 */
	public void setEndAt (Date endAt) {	
		this.endAt = endAt;
	}
	
	/**
	 * Get room rental end time.
	 * @return Date endAt
	 */
	public Date getEndAt () {
		return endAt;
	}
	
	/**
	 * Set ordering time.
	 * @param Date reserveAt
	 */
	public void setReservAt(Date reserveAt) {
		this.reserveAt = reserveAt;
	}
	
	/**
	 * Get ordering time.
	 * @return Date reserveAt
	 */
	public Date getReservAt () {
		return reserveAt;
	}
	
	/**
	 * Set status (예약/완료/취소) of order.
	 * @param String status
	 */
	
	public void setStatus (String status) {
		this.status = status;
	}
		
	/**
	 * Get status (예약/완료/취소) of order.
	 * @return String status
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * Set check whether user show or not for order.
	 * @param boolean noShow
	 */
	public void setNoShow (boolean noShow) {
		this.noShow = noShow;
	}
	
	/**
	 * Get check whether user show or not for order.
	 * @return boolean noShow
	 */
	public boolean getNoShow () {
		return noShow;
	}

}
