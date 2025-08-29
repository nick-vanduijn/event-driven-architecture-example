public class OrderPlacedEvent implements Event {
  private final String orderId;

  public OrderPlacedEvent(String orderId) {
    this.orderId = orderId;
  }

  public String getOrderId() {
    return orderId;
  }

  @Override
  public String getType() {
    return "OrderPlaced";
  }
}
