package com.sevenlives.myousef.livesapi.database;

import java.util.HashMap;
import java.util.Map;

import com.sevenlives.myousef.livesapi.model.Live;
import com.sevenlives.myousef.livesapi.model.User;


public class Database {
	
	private static Map<Long, Live> lives = new HashMap<>();
	private static Map<String, User> users = new HashMap<>();
	private static Map<Long, Live> livesForUser = new HashMap<>();

	public static Map<Long, Live> getLives() {
		return lives;
	}
	
	// TODO: Implement correct logic
	public static Map<Long, Live> getLiveForUser() {
		return livesForUser;
	}

	public static Map<String, User> getUsers() {
		return users;
	}

}
