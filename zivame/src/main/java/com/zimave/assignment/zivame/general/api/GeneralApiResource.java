package com.zimave.assignment.zivame.general.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.context.annotation.ComponentScan;

@Path("/")
@ComponentScan
public class GeneralApiResource {
	@GET
	@Produces("application/json")
	public String getHomePage(){
		return "{'message': 'Welcome To Zivame'}";
	}
	
}
