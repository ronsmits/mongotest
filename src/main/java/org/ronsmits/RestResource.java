package org.ronsmits;

import com.mongodb.DB;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by ronsmits on 25/08/15.
 */

@Path("rest")
public class RestResource {

    @Inject
    DB db;
    @GET
    @Produces("text/plain")
    public String printMongoURL(){
        return db.toString();
    }
}
