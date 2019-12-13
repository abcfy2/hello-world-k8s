package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller("/hello")
public class HelloController {
    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String index() throws UnknownHostException {
        return "Hello World" + " IP: " + InetAddress.getLocalHost().getHostAddress();
    }
}
