import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class SomethingApplication extends Application {

    Set<Object> hashSet = new HashSet<>();

    public SomethingApplication() {
        hashSet.add(new SomethingRestService());
    }

    @Override
    public Set<Object> getSingletons() {
        return hashSet;
    }
}
