package kr.re.kitri.domain;

public class EquipmentBean {
	private int id;
	private String species;
	private String name;
	private float price;
	private String introduction;
	private String imageURL;
	private String status;
	
	/**
	 * Set ID of equipment.
	 * @param int id
	 */
	public void setId (int id) {	
		this.id = id;
	}
	
	/**
	 * Get ID of equipment.
	 * @return int id
	 */
	public int getId () {
		return id;
	}
	
	/**
	 * Set species of equipment.
	 * @param String species
	 */
	public void setSpecies (String species) {
		this.species = species;
	}
	
	/**
	 * Get species of equipment.
	 * @return String species
	 */
	public String getSpecies () {
		return species;
	}
	
	/**
	 * Set name of equipment.
	 * @param String name
	 */
	public void setName (String name) {
		this.name = name;
	}
	
	/**
	 * Get name of equipment.
	 * @return String name
	 */
	public String getName () {
		return name;
	}
	
	/**
	 * Set price of equipment.
	 * @param float price
	 */
	public void setPrice (float price) {	
		this.price = price;
	}
	
	/**
	 * Get price of equipment.
	 * @return float price
	 */
	public float getprice () {
		return price;
	}
	
	/**
	 * Set introduction of equipment.
	 * @param String introduction
	 */
	
	public void setIntroduction (String introduction) {
		this.introduction = introduction;
	}
	
	/**
	 * Get introduction of equipment.
	 * @return String introduction
	 */
	public String getIntroduction () {
		return introduction;
	}
	
	/**
	 * Set representing image URL of equipment.
	 * @param String introduction
	 */
	
	public void setImageURL (String imageURL) {
		this.imageURL = imageURL;
	}
	
	/**
	 * Get representing image URL of equipment.
	 * @return String introduction
	 */
	public String getImageURL () {
		return imageURL;
	}
	
	/**
	 * Set status(대기/사용/고장/관리) of equipment.
	 * @param String status
	 */
	
	public void setStatus (String status) {
		this.status = status;
	}
	
	/**
	 * Get status(대기/사용/고장/관리) of equipment.
	 * @return String status
	 */
	public String getStatus() {
		return status;
	}
	
}
