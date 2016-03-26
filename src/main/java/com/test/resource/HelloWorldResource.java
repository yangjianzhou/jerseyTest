package com.test.resource;

import javax.ws.rs.*;

/**
 * Created by yangjianzhou on 16-3-26.
 */

@Path("helloWorld/{username}")
@Consumes("text/plain")
public class HelloWorldResource {

    @GET
    @Produces("text/plain")
    public String getMessage(@PathParam("username") String username) {
        return "hello world";
    }

    @GET
    @Produces("text/plain")
    public String getDefaultMessage(@PathParam("username") String username , @QueryParam("birth") String birth ,
                                    @DefaultValue("sh")@QueryParam("address") String address ) {
        return "hello world";
    }

    @POST
    @Consumes("json/plain")
    public void postMessage(@FormParam("message") String message) {
        //TODO consume message
    }
}
