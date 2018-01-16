package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("calcul")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	
	@Path("add")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String addition(@QueryParam("a" ) int a , @QueryParam( "b") int b) {
        
    	 return String. valueOf(a + b);
	
    }
	
	
	@Path("sub")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sub(@QueryParam("a" ) int a , @QueryParam( "b") int b) {
        
    	 return String. valueOf(a - b);
	
    }
	
	
	@Path("div")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String div(@QueryParam("a" ) int a , @QueryParam( "b") int b) {
        
    	try{
    		return String. valueOf(a / b);
    	}catch(Exception e){
    	return "non divisible";
    	}
	
    }
	
}
