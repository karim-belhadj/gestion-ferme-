package com.example;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.beans.Mouton;
import com.dao.MoutonDao;


@Path("mouton")
public class WsMouton {

	
	@Path("getall")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Mouton> getAll() {
        
		MoutonDao mouton = new MoutonDao();
		return mouton.getAll();
	
    }
	
	@Path("searchbyid/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response searchById(@PathParam("id") int id) {
        
		MoutonDao mouton = new MoutonDao();
		
		Mouton m = mouton.getMoutonById(id);
		
		if(m==null) {
			return Response.status(404).build();
		}
		else
			return Response.status(200).entity(m).build();
    }
	
	
	@Path("add")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response add(Mouton m) {
        
		MoutonDao mouton = new MoutonDao();
		mouton.addMouton(m);
		
		return Response.status(200).build();
    }
	
	@Path("delete/{id}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@PathParam("id") int id) {
        
		MoutonDao mouton = new MoutonDao();
		Mouton m = mouton.getMoutonById(id);
		mouton.deleteMouton(m);
		
		return Response.status(200).build();
    }

	
	@Path("update")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(Mouton m) {
        
		MoutonDao mouton = new MoutonDao();
		mouton.updateMouton(m);
		
		return Response.status(200).entity(m).build();
    }
	
}
