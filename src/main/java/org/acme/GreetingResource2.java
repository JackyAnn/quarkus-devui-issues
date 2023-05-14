package org.acme;

import io.quarkus.security.PermissionsAllowed;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello2")
public class GreetingResource2 {

    /**
     * Does not work properly, startup error reported
     */
    @GET
    @RolesAllowed("user")
    @PermissionsAllowed("see:read")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }
}
