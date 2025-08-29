public class OrderProcessingExample {
  public static void main(String[] args) {
    EventDispatcher dispatcher = new EventDispatcher();
    dispatcher.registerHandler("OrderPlaced", event -> {
      OrderPlacedEvent e = (OrderPlacedEvent) event;
      System.out.println("Order placed: " + e.getOrderId());
    });
    dispatcher.dispatch(new OrderPlacedEvent("ORD123"));
  }
}
