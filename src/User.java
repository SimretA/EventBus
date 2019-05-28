import java.beans.EventHandler;
import java.util.Set;

public class User implements Subscribable {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void handle(Event<?> event) {

        System.out.println("Message Received by "+name +": " + event.getData());
    }

    @Override
    public Set<Class<?>> supports() {
        return Set.of(EventHandler.class);
    }
}
