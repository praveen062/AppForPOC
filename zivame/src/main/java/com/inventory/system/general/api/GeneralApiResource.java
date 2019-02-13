package com.inventory.system.general.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.inventory.system.store.domain.Product;
import com.inventory.system.store.domain.ProductRepository;
import com.inventory.system.store.domain.ProductType;
import com.inventory.system.store.domain.ProductTypeRepository;

@Path("/")
@Component
public class GeneralApiResource {
	
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getHomePage(){
		return "{'message': 'Welcome'}";
	}
	
	
}
