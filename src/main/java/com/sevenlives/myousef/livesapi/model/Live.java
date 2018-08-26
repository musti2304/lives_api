package com.sevenlives.myousef.livesapi.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author myousef
 * 
 * This class defines the model of a Live
 * 
 */
@XmlRootElement
public class Live {

	/**
	 * These are the properties of a Live.
	 * 
	 * @id: Is the unique ID of one Live
	 * @url: Is the URL path of where the Live is being saved
	 * @age: Is the age of a Live. It will be calculated from the birthDate until
	 *       the date of today and will be printed out as a unit (seconds, minutes,
	 *       hours, days, weeks, months, years)
	 * @birthDate: When was the Live created
	 * @deathDate: When was the Live destroyed
	 * @aliveSince: The same as the @age
	 * @aliveUntil: How long will the Live be alive
	 * @saves: The count of the saves for a specific Live
	 * @isDead: Determines whether the Live is already dead or not
	 * @isAlive: Determines whether the Live is still alive or not
	 * 
	 */
	private long id;
	private User user;
	private String url;
	private int age;
	private Date birthDate;
	private Date deathDate;
	private Date aliveSince;
	private Date aliveUntil;
	private int saves;
	private boolean isDead;
	private boolean isAlive;
	
	/**
	 * Default constructor
	 */
	public Live() {}

	public Live(long id, String url, int age, Date birthDate, Date deathDate, Date aliveSince, Date aliveUntil,
			int saves, boolean isDead, boolean isAlive) {
		this.id = id;
		this.url = url;
		this.age = age;
		this.birthDate = birthDate;
		this.deathDate = deathDate;
		this.aliveSince = aliveSince;
		this.aliveUntil = aliveUntil;
		this.saves = saves;
		this.isDead = isDead;
		this.isAlive = isAlive;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getDeathDate() {
		return deathDate;
	}

	public void setDeathDate(Date deathDate) {
		this.deathDate = deathDate;
	}

	public Date getAliveSince() {
		return aliveSince;
	}

	public void setAliveSince(Date aliveSince) {
		this.aliveSince = aliveSince;
	}

	public Date getAliveUntil() {
		return aliveUntil;
	}

	public void setAliveUntil(Date aliveUntil) {
		this.aliveUntil = aliveUntil;
	}

	public int getSaves() {
		return saves;
	}

	public void setSaves(int saves) {
		this.saves = saves;
	}

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
}