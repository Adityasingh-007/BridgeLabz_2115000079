class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    void getOrderStatus() {}
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    void getOrderStatus() {
        System.out.println("Order " + orderId + " shipped with tracking number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    void getOrderStatus() {
        System.out.println("Order " + orderId + " delivered on: " + deliveryDate);
    }
}

public class RetailOrderManagement {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(1001, "2024-02-01", "XYZ123", "2024-02-05");
        order.getOrderStatus();
    }
}