package kr.re.kitri.domain;

import java.sql.Date;

public class UserBean {
	private String id;
	private String pw;
	private String name;
	private String role;
	private Date birth;
	private String gender;
	private String phone;
	private String email;
	private String address;
	private String field;
	
	/**
	 * Set ID of user.
	 * @param id [String]
	 */
	public void setId (String id) {	
		this.id = id;
	}
	
	/**
	 * Get ID of user.
	 * @return id [String]
	 */
	public String getId () {
		return id;
	}
	
	/**
	 * Set PW of user.
	 * @param pw [String]
	 */
	public void setPw (String pw) {	
		this.pw = pw;
	}
	
	/**
	 * Get PW of user.
	 * @return pw [String]
	 */
	public String getPw () {
		return pw;
	}
	
	/**
	 * Set name of user.
	 * @param name [String]
	 */
	public void setName (String name) {	
		this.name = name;
	}
	
	/**
	 * Get name of user.
	 * @return name [String]
	 */
	public String getName () {
		return name;
	}
	
	/**
	 * Set role of user.
	 * @param role [String]
	 */
	public void setRole (String role) {	
		this.role = role;
	}
	
	/**
	 * Get role of user.
	 * @return role [String]
	 */
	public String getRole () {
		return role;
	}
	
	/**
	 * Set birth of user.
	 * @param birth [Date]
	 */
	public void setBirth (Date birth) {
		this.birth = birth;
	}
	
	/**
	 * Get birth of user.
	 * @return birth [Date]
	 */
	public Date getBirth () {
		return birth;
	}
	
	/**
	 * Set gender of user.
	 * @param gender [String]
	 */
	public void setGender (String gender) {
		this.gender = gender;
	}
	
	/**
	 * Get gender of user.
	 * @return gender [String]
	 */
	public String getGender () {
		return gender;
	}
	
	/**
	 * Set phone of user.
	 * @param phone [String]
	 */
	public void setPhone (String phone) {	
		this.phone = phone;
	}
	
	/**
	 * Get phone of user.
	 * @return phone [String]
	 */
	public String getPhone () {
		return phone;
	}
	
	/**
	 * Set email of user.
	 * @param email [String]
	 */
	public void setEmail (String email) {	
		this.email = email;
	}
	
	/**
	 * Get email of user.
	 * @return email [String]
	 */
	public String getEmail () {
		return email;
	}
	
	/**
	 * Set address of user.
	 * @param address [String]
	 */
	public void setAddress (String address) {	
		this.address = address;
	}
	
	/**
	 * Get address of user.
	 * @return address [String]
	 */
	public String getAddress () {
		return address;
	}
	
	/**
	 * Set field of user.
	 * @param field [String]
	 */
	public void setField (String field) {
		this.field = field;
	}
	
	/**
	 * Get field of user.
	 * @return field [String]
	 */
	public String getField () {
		return field;
	}
	
}