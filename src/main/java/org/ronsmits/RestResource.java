package org.ronsmits;

import com.mongodb.DB;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Simple class created to trigger the injection of the DB
 */

@Path("rest")
public class RestResource {

    @Inject
    DB db;
    @GET
    @Produces("text/plain")
    public String printMongoURL(){
        return "gevonden is : " + db.toString();
    }
}
