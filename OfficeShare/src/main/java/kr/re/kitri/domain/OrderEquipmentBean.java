package kr.re.kitri.domain;

public class OrderEquipmentBean {
	private int orderId;
	private int equipmentId;
	private int userId;
	private int numberEquipment;

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
	 * Set ID of equipment.
	 * @param int equipmentId
	 * @see {@link kr.re.kitri.domain.EquipmentBean#getId() EquipmentBean.id}
	 */
	public void setEquipmentID (int equipmentId) {	
		this.equipmentId = equipmentId;
	}
	
	/**
	 * Get ID of equipment.
	 * @return int equipmentId
	 * @see {@link kr.re.kitri.domain.EquipmentBean#getId() EquipmentBean.id}
	 */
	public int getEquipmentId () {
		return equipmentId;
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
	 * Set number that using the equipment.
	 * @param int numberEquipment
	 */
	public void setNumber (int numberEquipment) {	
		this.numberEquipment = numberEquipment;
	}
	
	/**
	 * Get number that using the equipment.
	 * @return int numberEquipment
	 */
	public int getNumber () {
		return numberEquipment;
	}
}
	
	