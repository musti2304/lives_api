package com.sevenlives.myousef.livesapi.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.sevenlives.myousef.livesapi.database.Database;
import com.sevenlives.myousef.livesapi.model.Live;
import com.sevenlives.myousef.livesapi.model.User;

public class LiveService {

	private Map<Long, Live> lives = Database.getLives();
//	private Map<Long, Live> livesForUser = Database.getLiveForUser();

	public LiveService() {
		lives.put(1L, new Live(1, "w", 2, new Date(), new Date(), new Date(), new Date(), 12, false, true));
		lives.put(2L, new Live(2, "ww", 4, new Date(), new Date(), new Date(), new Date(), 1, false, true));
		lives.put(3L, new Live(3, "www", 6, new Date(), new Date(), new Date(), new Date(), 2, false, true));
	}

	// GET
	public List<Live> getAllLives() {
		return new ArrayList<Live>(lives.values());
	}
	
	// GET
	public Live getLive(long id) {
		return lives.get(id);
	}

	// GET
	// TODO: Implement correct logic
	public Live getLiveForUser(long userId, long liveId) {
		return null;
	}

	// POST, CREATE
	public Live createLive(Live live) {
		live.setId(lives.size() + 1);
		lives.put(live.getId(), live);
		return live;
	}

	// PUT, UPDATE
	public Live saveLive(Live live) {
		if (live.getId() <= 0) {
			return null;
		}
		lives.put(live.getId(), live);
		return live;
	}

	// DELETE
	public void destroyLive(long id) {
		lives.remove(id);
	}
}