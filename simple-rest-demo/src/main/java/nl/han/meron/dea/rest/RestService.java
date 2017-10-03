package nl.han.meron.dea.rest;


import nl.han.meron.dea.rest.model.Person;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/rest")
public class RestService {

    @Path("text")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String doGetHelloTxt() {
        return "Hello world";
    }

    @Path("json")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response doGetHelloJson() {
        JsonObject jo = Json.createObjectBuilder().add("message", "hello world").build();
        return Response.status(200).entity(jo).build();
    }


    @POST
    @Path("json")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response doPostHelloJson(Person person) {
        String say_what = "Hello " + person.getName();

        JsonObject jo = Json.createObjectBuilder().add("message", say_what).build();
        return Response.status(200).entity(jo).build();
    }

}
