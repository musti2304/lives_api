package com.sevenlives.myousef.livesapi.database;

import java.util.HashMap;
import java.util.Map;

import com.sevenlives.myousef.livesapi.model.Live;
import com.sevenlives.myousef.livesapi.model.User;


public class Database {
	
	private static Map<Long, Live> lives = new HashMap<>();
	private static Map<String, User> users = new HashMap<>();

	public static Map<Long, Live> getLives() {
		return lives;
	}

	public static Map<String, User> getUsers() {
		return users;
	}

}
