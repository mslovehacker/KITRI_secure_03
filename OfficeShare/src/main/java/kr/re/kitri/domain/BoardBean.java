package kr.re.kitri.domain;

import java.sql.Date;

public class BoardBean {
	private int id;
	private String userId;
	private String subject;
	private String content;
	private Date writeAt;
	private boolean protect;
	private int hit;
	private int newyn;
	
	public int getNewyn() {
		return newyn;
	}

	public void setNewyn(int newyn) {
		this.newyn = newyn;
	}

	/**
	 * Set ID of post.
	 * @param int id
	 */
	public void setId (int id) {	
		this.id = id;
	}
	
	/**
	 * Get ID of post.
	 * @return int id
	 */
	public int getId () {	
		return id;
	}
	
	/**
	 * Set ID of user writing post.
	 * @param String userID
	 * @see {@link kr.re.kitri.domain.UserBean#getId() UserBean.id}
	 */
	public void setUserId (String userId) {	
		this.userId = userId;
	}
	
	/**
	 * Get ID of user writing post.
	 * @return String userId
	 * @see {@link kr.re.kitri.domain.UserBean#getId() UserBean.id}
	 */
	public String getUserId () {
		return userId;
	}
	
	/**
	 * Set subject of post.
	 * @param String subject
	 */
	public void setSubject (String subject) {
		this.subject = subject;
	}
	
	/**
	 * Get subject of post.
	 * @param String subject
	 */
	public String getSubject () {
		return subject;
	}
	
	/**
	 * Set content of post.
	 * @param String content
	 */
	public void setContent (String content) {
		this.content = content;
	}
	
	/**
	 * Get content of post.
	 * @param String content
	 */
	public String getContent () {
		return content;
	}
	
	/**
	 * Set writing time of post.
	 * @param Date writeAt
	 */
	public void setWriteAt (Date writeAt) {	
		this.writeAt = writeAt;
	}
	
	/**
	 * Get writing time of post.
	 * @return Date writeAt
	 */
	public Date getWriteAt () {
		return writeAt;
	}
	
	/**
	 * Set protection for post.
	 * @param Boolean protect
	 */
	public void setProtect (boolean protect) {
		this.protect = protect;
	}
	
	/**
	 * Get protection for post.
	 * @param Boolean protect
	 */
	public boolean getProtect () {
		return protect;
	}
	
	/**
	 * Set count of views(hit) of post.
	 * @param int hit
	 */
	public void setHit (int hit) {	
		this.hit = hit;
	}
	
	/**
	 * Get count of views(hit) of post.
	 * @return int hit
	 */
	public int getHit () {
		return hit;
	}
	
}