public class NotificationExample {
  public static void main(String[] args) {
    EventDispatcher dispatcher = new EventDispatcher();
    dispatcher.registerHandler("Notification", event -> {
      NotificationEvent e = (NotificationEvent) event;
      System.out.println("Notification: " + e.getMessage());
    });
    dispatcher.dispatch(new NotificationEvent("Welcome to the Event-Driven Architecture!"));
  }
}
