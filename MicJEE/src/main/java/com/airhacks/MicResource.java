package com.airhacks;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Michel Koolwaaij on 21-09-18.
 */
@Path("test")
public class MicResource {
    @GET
    public String show(){
        return "Supercool dit";
    }
}
