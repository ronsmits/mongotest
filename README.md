# mongotest
test adding mongodb in TOMEE/conf/tomee.xml

# Goal
The goal of this very small repo is to make it possible to access a mongodb resource defined in tomee.xml from a producer in a
webapp.

add the following to $TOMEE_HOME/conf/tomee.xml:

    <Resource id="mongoUri" class-name="com.mongodb.MongoClientURI" constructor="uri">
      uri  mongodb://localhost/test
    </Resource>

After starting up the application go to ````http://localhost:8080/tomee-mongo-test/api/rest````. This will print on stdout the
value found for mongoUri like this:

    *******ClientURI=null
    
    
