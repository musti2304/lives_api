package com.sevenlives.myousef.livesapi.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sevenlives.myousef.livesapi.model.Live;
import com.sevenlives.myousef.livesapi.service.LiveService;

@Path("/lives")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LiveResource {

	LiveService liveService = new LiveService();

	@GET
	@Path("/{liveId}")
	public Live getLive(@PathParam("liveId") long liveId) {
		return liveService.getLive(liveId);
	}

	@GET
	public List<Live> getAllLives() {
		return liveService.getAllLives();
	}

//	@GET
//	@Path("/users/{userId}/{liveId}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Live getLiveForUser(@PathParam("userId)") long userId, @PathParam("liveId") long liveId) {
//		return liveService.getLiveForUser(userId, liveId);
//	}
	
	// TODO: Implement POST methods
	@POST
	public Live createLive(Live live) {
		
		return liveService.createLive(live);
	}
	
	// TODO: Implement PUT methods
	@PUT
	@Path("/{liveId}")
	public Live saveLive(@PathParam("liveId") long id, Live live) {
		live.setId(id);
		
		return liveService.saveLive(live);
	}
	
	
	// TODO: Implement DELETE methods
	@DELETE
	@Path("/{liveId}")
	public void destroyLive(@PathParam("liveId") long id) {
		liveService.destroyLive(id);
	}

}