public class UserRegisteredEvent implements Event {
  private final String username;

  public UserRegisteredEvent(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  @Override
  public String getType() {
    return "UserRegistered";
  }
}
