package dea.michel.rest;

/**
 * Created by Michel Koolwaaij on 24-09-18.
 */
import dea.michel.domein.MicStudent;

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


    @Path("json")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response doPostHelloJson(MicStudent student) {

        String say_what = "Hello " + student.getVoornaam();

        JsonObject jo = Json.createObjectBuilder().add("message", say_what).build();
        return Response.status(200).entity(jo).build();
    }

    @Path("error")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response doError(){
        return Response.status(400).build();
    }


}