package syncworkout.endpoint;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponses;
import com.wordnik.swagger.annotations.ApiResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Jason on 15/02/2015.
 */
// The Java class will be hosted at the URI path "/rest/hello/world"
@Path("hello")
@Api(value = "/hello", description = "Say Hello World !")
public class HelloWorld {
    // The Java method will process HTTP GET requests
    @GET
    @Path("world")
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces( {MediaType.APPLICATION_JSON} )
    @ApiOperation(value="Hello World",
            notes="Hello World with REST",
            response=String.class,
            responseContainer = "")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 500, message = "Something wrong in Server")})
    public String getClichedMessage() {
        // Return some cliched textual content
        return "Hello World";
    }

    @GET
    @Path("auth")
    @Produces( {MediaType.APPLICATION_JSON} )
    @ApiOperation(value="Auth",
            notes="REST Authentication",
            response=String.class,
            responseContainer = "")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 500, message = "Something wrong in Server")})
    public String auth() {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Hello World";
    }

}