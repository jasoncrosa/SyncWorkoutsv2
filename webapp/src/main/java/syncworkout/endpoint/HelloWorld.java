package syncworkout.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Jason on 15/02/2015.
 */
// The Java class will be hosted at the URI path "/rest/hello/world"
@Path("hello")
public class HelloWorld {
    // The Java method will process HTTP GET requests
    @GET
    @Path("world")
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public String getClichedMessage() {
        // Return some cliched textual content
        return "Hello World";
    }
}
