package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.beans.LoginModel;

@Path("logout")
public class logout {
	
	 @Context
	 private HttpServletRequest request;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(LoginModel loginData) {

		request.getSession().invalidate();
		return Response.status(200).build();
	}
}
