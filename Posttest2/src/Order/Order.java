package Order;

public class Order {
    private String orderId;
    private String customerName;
    private String productItem;
    private int quantity;

    public Order(String orderId, String customerName, String productItem, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productItem = productItem;
        this.quantity = quantity;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductItem() {
        return productItem;
    }

    public void setProductItem(String productItem) {
        this.productItem = productItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
