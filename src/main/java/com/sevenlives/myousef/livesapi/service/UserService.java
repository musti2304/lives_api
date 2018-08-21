package com.sevenlives.myousef.livesapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sevenlives.myousef.livesapi.database.Database;
import com.sevenlives.myousef.livesapi.model.Live;
import com.sevenlives.myousef.livesapi.model.User;

public class UserService {

	private Map<String, User> users = Database.getUsers();

	public UserService() {
		users.put("musti1", new User(1L, "musti1", "Mustafa Yousef", "www.google.de/hello.png", "kifjsughauh",
				new ArrayList<Live>()));
	}

	public List<User> getAllUsers() {
		return new ArrayList<User>(users.values());
	}

	public User getUser(String userName) {
		return users.get(userName);
	}

	public User createUser(User user) {
		user.setId(users.size() + 1);
		users.put(user.getUserName(), user);
		return user;
	}

	public User updateUser(User user) {
		if (user.getUserName().isEmpty()) {
			return null;
		}
		users.put(user.getUserName(), user);
		return user;
	}

	public User removeUser(String userName) {
		return users.remove(userName);
	}

}
