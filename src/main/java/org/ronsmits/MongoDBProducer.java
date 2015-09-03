package org.ronsmits;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import java.net.UnknownHostException;

/**
 * @author morten
 */
@ApplicationScoped
public class MongoDBProducer {

    @Resource(name = "mongoUri", type = com.mongodb.MongoClientURI.class)
    private MongoClientURI mongoClientURI;// = new MongoClientURI("mongodb://localhost/test");

    private DB db;

    @PostConstruct
    public void init() throws UnknownHostException {
        System.out.println("*******ClientURI=" + mongoClientURI);

        final MongoClient mongoClient = new MongoClient();
        db = mongoClient.getDB(mongoClientURI.getDatabase());
    }

    @Produces
    public DB createDB() {
        System.out.printf("createDB called");
        return db;
    }

}