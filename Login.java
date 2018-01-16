package com.example;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.beans.LoginModel;
import com.dao.LoginDao;

@Path("login")
public class Login {
	
	 @Context
	 private HttpServletRequest request;

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(LoginModel loginData) {


		LoginDao ldao = new LoginDao();
		LoginModel user = ldao.login(loginData.getLogin(), loginData.getPwd());
		if(ldao.login(loginData.getLogin(), loginData.getPwd())!= null){
			HttpSession sess = request.getSession(true);
			sess.setAttribute("user",user);
			return Response.status(200).entity(user).build();
		}
		else {
			return Response.status(401).build();
		}
		/*
		if(loginData.getLogin().equals(dataLogin.getLogin()) && loginData.getPwd().equals(dataLogin.getPwd()) ) {
			System.out.println("je suis le ws login");
			
			//open the session
			request.getSession(true);
			
			return Response.status(200).entity(dataLogin).build();
		}
		
		else {
			
			return Response.status(401).build();
		}*/
	}

}
