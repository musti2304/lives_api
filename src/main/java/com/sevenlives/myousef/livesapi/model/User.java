package com.sevenlives.myousef.livesapi.model;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

	private long id;
	private String username;
	private String fullName;
	private String profilePictureUrl;
	private String bio;
	private Map<Long, Live> lives;

	public User() {
	}

	public User(long id, String username, String fullName, String profilePictureUrl, String bio, Map<Long, Live> lives) {
		this.id = id;
		this.username = username;
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
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
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

	public Map<Long, Live> getLives() {
		return lives;
	}

	public void setLives(Map<Long, Live> lives) {
		this.lives = lives;
	}

}
