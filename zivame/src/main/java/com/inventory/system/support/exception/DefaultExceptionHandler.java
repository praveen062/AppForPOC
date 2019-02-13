package com.inventory.system.support.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class DefaultExceptionHandler extends RuntimeException implements ExceptionMapper<DefaultExceptionHandler> {

	public DefaultExceptionHandler() {
		super("There was an exception while processing the request");
	}
	
	public DefaultExceptionHandler(String message) {
		super(message);
	}
	
	@Override
	public Response toResponse(DefaultExceptionHandler exception) {
		CodeMessage codeMessage = new CodeMessage(Response.Status.FORBIDDEN.ordinal(),exception.getMessage());
		return Response.status(Response.Status.FORBIDDEN).entity(codeMessage)
                .type(MediaType.APPLICATION_JSON).build();
	}

}
