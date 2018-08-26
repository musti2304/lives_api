package com.sevenlives.myousef.livesapi.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.sevenlives.myousef.livesapi.database.Database;
import com.sevenlives.myousef.livesapi.model.Live;
import com.sevenlives.myousef.livesapi.model.User;

public class LiveService {

	private Map<String, User> users = Database.getUsers();

	// GET
	public List<Live> getAllLives(String username) {
		Map<Long, Live> lives = users.get(username).getLives();
		return new ArrayList<Live>(lives.values());
	}

	public Live getLivesForUser(String username, long liveId) {
		Map<Long, Live> lives = users.get(username).getLives();
		return lives.get(liveId);
	}

	// POST, CREATE
	public Live createLive(String username, Live live) {
		Map<Long, Live> lives = users.get(username).getLives();
		live.setId(lives.size() + 1);
		lives.put(live.getId(), live);
		return live;
	}

	// PUT, UPDATE
	public Live saveLive(String username, Live live) {
		Map<Long, Live> lives = users.get(username).getLives();
		if (live.getId() <= 0) {
			return null;
		}
		lives.put(live.getId(), live);
		return live;
	}

	// DELETE
	public Live destroyLive(String username, long liveId) {
		Map<Long, Live> lives = users.get(username).getLives();
		return lives.remove(liveId);
	}

//	public List<Live> getAllLivesForYear(int year) {
//		List<Live> livesForYear = new ArrayList<>();
//		Calendar cal = Calendar.getInstance();
//		for (Live live : lives.values()) {
//			cal.setTime(live.getBirthDate());
//			if (cal.get(Calendar.YEAR) == year) {
//				livesForYear.add(live);
//			}
//		}
//		return livesForYear;
//	}
//
//	public List<Live> getAllLivesPaginated(int start, int size) {
//		ArrayList<Live> list = new ArrayList<Live>(lives.values());
//		if (start + size > list.size())
//			return new ArrayList<Live>();
//		return list.subList(start, start + size);
//	}
//
//	// GET
//	public Live getLive(long id) {
//		return lives.get(id);
//	}
//
}