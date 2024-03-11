package Order;

public class Order {
    String orderId;
    String customerName;
    String productItem;
    int Quantity;

    public Order(String orderId, String customerName, String productItem, int Quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productItem = productItem;
        this.Quantity = Quantity;
    }

    public String getorderId() {
        return orderId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getProductItem() {
        return productItem;
    }
    public int getQuantity() {
        return Quantity;
    }
    
    public void setorderId(String orderId) {
        this.orderId = orderId;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setProductItem(String productItem) {
        this.productItem = productItem;
    }
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
