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
		users.put("musti", new User(1L, "musti", "Mustafa Yousef", "www.google.de/hello.png", "Hello, my name is Mustafa.",
				new ArrayList<Live>()));
	}

	public List<User> getAllUsers() {
		return new ArrayList<User>(users.values());
	}

	public User getUser(String username) {
		return users.get(username);
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

	public User removeUser(String username) {
		return users.remove(username);
	}

}
