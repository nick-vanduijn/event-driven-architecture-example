import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class EventDispatcher {
  private final Map<String, Consumer<Event>> handlers = new HashMap<>();

  public void registerHandler(String eventType, Consumer<Event> handler) {
    handlers.put(eventType, handler);
  }

  public void dispatch(Event event) {
    Consumer<Event> handler = handlers.get(event.getType());
    if (handler != null) {
      handler.accept(event);
    }
  }
}
