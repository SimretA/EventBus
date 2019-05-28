import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EventBusHandler implements EventBus {
    ArrayList<Subscribable> subscribers = new ArrayList<>();

    @Override
    public void register(Subscribable subscribable) {

        subscribers.add(subscribable);
    }

    @Override
    public void dispatch(Event<?> event) {

        subscribers.forEach(subscriber -> subscriber.handle(event));
    }

    @Override
    public List<Subscribable> getSubscribers() {
        return subscribers;
    }
}
