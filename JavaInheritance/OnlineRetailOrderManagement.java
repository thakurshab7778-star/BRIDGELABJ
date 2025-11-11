package JavaInheritance;
class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped with Tracking Number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order order = new Order(1401, "2025-11-04");
        ShippedOrder shipped = new ShippedOrder(1202, "2025-11-05", "TRK343245");
        DeliveredOrder delivered = new DeliveredOrder(1303, "2025-11-03", "TRK67390", "2025-11-07");

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}