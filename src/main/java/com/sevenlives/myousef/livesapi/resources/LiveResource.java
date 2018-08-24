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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.sevenlives.myousef.livesapi.model.Live;
import com.sevenlives.myousef.livesapi.service.LiveService;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LiveResource {

	LiveService liveService = new LiveService();

	@GET
	@Path("/{liveId}")
	public Live getLive(@PathParam("liveId") long id) {
		return liveService.getLive(id);
	}

	@GET
	public List<Live> getAllLives(@QueryParam("year") int year, @QueryParam("start") int start,
			@QueryParam("size") int size) {
		if (year > 0) {
			return liveService.getAllLivesForYear(year);
		}
		if (start >= 0 && size > 0) {
			return liveService.getAllLivesPaginated(start, size);
		}
		return liveService.getAllLives();
	}

//	@GET
//	@Path("/users/{userId}/{liveId}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Live getLiveForUser(@PathParam("userId)") long userId, @PathParam("liveId") long liveId) {
//		return liveService.getLiveForUser(userId, liveId);
//	}

	@POST
	public Live createLive(Live live) {
		return liveService.createLive(live);
	}

	@PUT
	@Path("/{liveId}")
	public Live saveLive(@PathParam("liveId") long id, Live live) {
		live.setId(id);
		return liveService.saveLive(live);
	}

	@DELETE
	@Path("/{liveId}")
	public void destroyLive(@PathParam("liveId") long id) {
		liveService.destroyLive(id);
	}
	
	

}