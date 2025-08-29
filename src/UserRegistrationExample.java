public class UserRegistrationExample {
  public static void main(String[] args) {
    EventDispatcher dispatcher = new EventDispatcher();
    dispatcher.registerHandler("UserRegistered", event -> {
      UserRegisteredEvent e = (UserRegisteredEvent) event;
      System.out.println("User registered: " + e.getUsername());
    });
    dispatcher.dispatch(new UserRegisteredEvent("alice"));
  }
}
