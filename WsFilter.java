package com.example;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
public class WsFilter implements ContainerRequestFilter {

	 @Context
	 private HttpServletRequest request;
	
	@Override
	public void filter(ContainerRequestContext requestContext)
			throws IOException {
		
		if( ! requestContext.getUriInfo().getPath().equals("login")) {
			
			if(request.getSession(false) == null) {
				
				requestContext.abortWith(
		                Response.status(Response.Status.UNAUTHORIZED).build());
			}
		}
	}
}
