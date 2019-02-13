package com.inventory.system.support.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.sun.jersey.api.NotFoundException;

@Provider
public class NotFoundExceptionMapper implements ExceptionMapper<NotFoundException>{

	@Override
	public Response toResponse(NotFoundException exception) {
		 return Response.status(Response.Status.NOT_FOUND)
	                .entity("{'code':'404','message':'Invalid API'}")
	                .build();
	}

}
