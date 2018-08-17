package com.sevenlives.myousef.livesapi.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sevenlives.myousef.livesapi.model.Live;
import com.sevenlives.myousef.livesapi.service.LiveService;

@Path("/lives")
public class LiveResource {

	LiveService liveService = new LiveService();

	@GET
	@Path("/{liveId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Live getLive(@PathParam("liveId") long liveId) {
		return liveService.getLive(liveId);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Live> getAllLives() {
		return liveService.getAllLives();
	}

	@GET
	@Path("/users/{userId}/{liveId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Live getLiveForUser(@PathParam("userId)") long userId, @PathParam("liveId") long liveId) {
		return liveService.getLiveForUser(userId, liveId);
	}
	
	// TODO: Implement POST methods
	
	
	// TODO: Implement PUT methods
	
	
	// TODO: Implement DELETE methods
	
	

}