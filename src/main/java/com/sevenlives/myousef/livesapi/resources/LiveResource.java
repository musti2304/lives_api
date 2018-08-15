package com.sevenlives.myousef.livesapi.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sevenlives.myousef.livesapi.model.Live;
import com.sevenlives.myousef.livesapi.service.LiveService;

@Path("/lives")
public class LiveResource {
	
	LiveService liveService = new LiveService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Live> getLive() {
		return liveService.getAllLives();
	}
	
}
