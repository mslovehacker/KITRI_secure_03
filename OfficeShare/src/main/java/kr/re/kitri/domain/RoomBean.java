package kr.re.kitri.domain;

public class RoomBean {
	private int id;
	private String name;
	private int price;
	private int basicNumber;
	private int maxNumber;
	private int area;
	private String introduction;
	private String imageURL;
	private String status;
	
	/**
	 * Set ID of room.
	 * @param int id
	 */
	public void setId (int id) {	
		this.id = id;
	}
	
	/**
	 * Get ID of room.
	 * @return int id
	 */
	public int getId () {
		return id;
	}
	
	/**
	 * Set name of room.
	 * @param String name
	 */
	public void setName (String name) {
		this.name = name;
	}
	
	/**
	 * Get name of room.
	 * @return String name
	 */
	public String getName () {
		return name;
	}
	
	/**
	 * Set price of room.
	 * @param int price
	 */
	public void setPrice (int price) {	
		this.price = price;
	}
	
	/**
	 * Get price of room.
	 * @return int price
	 */
	public int getPrice () {
		return price;
	}
	
	/**
	 * Set basic number of people for each room.
	 * @param int basicNumber
	 */
	public void setBasicNumber (int basicNumber) {	
		this.basicNumber = basicNumber;
	}
	
	/**
	 * Get basic number of people for each room.
	 * @return int basicNumber
	 */
	public int getBasicNumber () {
		return basicNumber;
	}
	
	/**
	 * Set maximum number of people for each room.
	 * @param int maxNumber
	 */
	public void setMaxNumber (int maxNumber) {	
		this.maxNumber = maxNumber;
	}
	
	/**
	 * Get maximum number of people for each room.
	 * @return int maxNumber
	 */
	public int getMaxNumber () {
		return maxNumber;
	}
	
	/**
	 * Set area of room.
	 * @param int area
	 */
	public void setArea (int area) {	
		this.area = area;
	}
	
	/**
	 * Get area of room.
	 * @return int area
	 */
	public int getArea () {
		return area;
	}
	
	/**
	 * Set introduction of room.
	 * @param String introduction
	 */
	public void setIntroduction (String introduction) {
		this.introduction = introduction;
	}
	
	/**
	 * Get introduction of room.
	 * @return String introduction
	 */
	public String getIntroduction () {
		return introduction;
	}
	
	/**
	 * Set representing image URL of room.
	 * @param String imageURL
	 */
	public void setImageURL (String imageURL) {
		this.imageURL = imageURL;
	}
	
	/**
	 * Get representing image URL of room.
	 * @return String imageURL
	 */
	public String getImageURL () {
		return imageURL;
	}
	
	/**
	 * Set status (대기/사용/관리) of room.
	 * @param String status
	 */
	public void setStatus (String status) {
		this.status = status;
	}
	
	/**
	 * Get status (대기/사용/관리) of room.
	 * @return boolean availability
	 */
	public String getStatus () {
		return status;
	}
	
}