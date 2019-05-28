import java.util.Set;

public interface Subscribable {
    void handle(Event<?> event);
    Set<Class<?>> supports();
}
