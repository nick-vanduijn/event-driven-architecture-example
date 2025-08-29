public class NotificationEvent implements Event {
  private final String message;

  public NotificationEvent(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public String getType() {
    return "Notification";
  }
}
