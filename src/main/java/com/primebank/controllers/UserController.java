package com.primebank.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response create() {
        return Response.ok().build();
    }
}