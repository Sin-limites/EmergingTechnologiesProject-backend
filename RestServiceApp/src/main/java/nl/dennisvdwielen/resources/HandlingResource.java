package nl.dennisvdwielen.resources;

import jooq.generated.tables.daos.HandlingDao;
import jooq.generated.tables.pojos.Handling;
import nl.dennisvdwielen.factory.ConfigFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by Dennis on 10-5-2014 at 01:07)
 * <p/>
 * This code is part of the RestServiceApp project.
 * This class is within package nl.dennisvdwielen.resources
 */
@Path("/handling")
public class HandlingResource {

    @GET
    @Produces("Application/json")
    @Path("/get")
    public List<Handling> fetch() {
        return new HandlingDao(ConfigFactory.getInstance().getConfig()).findAll();
    }

    @GET
    @Produces("Application/json")
    @Path("/get/{id}")
    public List<Handling> fetchById(@PathParam("id") Integer id) {
        return new HandlingDao(ConfigFactory.getInstance().getConfig()).fetchByHandlingid(id);
    }
}
