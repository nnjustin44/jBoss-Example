import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("something")
public class SomethingRestService {

    @GET
    public String something() {
        return "Hello";
    }

}
