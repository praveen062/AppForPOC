package com.inventory.system.support.util;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerResponse;
import com.sun.jersey.spi.container.ContainerResponseFilter;

public class ResponseCorsFilter implements ContainerResponseFilter {

    @Override
    public ContainerResponse filter(final ContainerRequest request, final ContainerResponse response) {

        final ResponseBuilder resp = Response.fromResponse(response.getResponse());

        resp.header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");

        response.setResponse(resp.build());

        return response;
    }
}
