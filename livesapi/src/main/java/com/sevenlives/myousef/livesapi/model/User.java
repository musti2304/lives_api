package com.sevenlives.myousef.livesapi.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

	private long id;
	private String userName;
	private String fullName;
	private String profilePictureUrl;
	private String bio;
	private List<Live> lives;

	public User() {
	}

	public User(long id, String userName, String fullName, String profilePictureUrl, String bio, List<Live> lives) {
		super();
		this.id = id;
		this.userName = userName;
		this.fullName = fullName;
		this.profilePictureUrl = profilePictureUrl;
		this.bio = bio;
		this.lives = lives;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getProfilePictureUrl() {
		return profilePictureUrl;
	}

	public void setProfilePictureUrl(String profilePictureUrl) {
		this.profilePictureUrl = profilePictureUrl;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public List<Live> getLives() {
		return lives;
	}

	public void setLives(List<Live> lives) {
		this.lives = lives;
	}

}
