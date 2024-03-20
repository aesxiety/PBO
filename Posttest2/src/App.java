import Order.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        ArrayList<Order> orders = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while (true) {
            System.out.println("+-------------------+");
            System.out.println("| 1. Show Order     |");
            System.out.println("| 2. Add New Order  |");
            System.out.println("| 3. Update Order   |");
            System.out.println("| 4. Delete Order   |");
            System.out.println("| 5. Exit           |");
            System.out.println("+-------------------+");
            System.out.print("Choose Menu : ");
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    showOrder(orders);
                    break;
                case 2:
                    addOrder(orders, br);
                    break;
                case 3:
                    updateOrder(orders, br);
                    break;
                case 4:
                    deleteOrder(orders, br);
                    break;
                case 5:
                    System.out.println("Exit From Program");
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    public static void showOrder(ArrayList<Order> orders) {
        if (orders.isEmpty()) {
            System.out.println("Sorry, no orders available");
        } else {
            System.out.println("===================================================================");
            System.out.printf("|%-4s| %-10s| %-20s| %-15s| %-10s| %n", "No", "Order ID", "Customer Name", "Product Item", "Quantity");
            System.out.println("===================================================================");
            for (int i = 0; i < orders.size(); i++) {
                Order orderItem = orders.get(i);
                String orderId = orderItem.getOrderId();
                String customerName = orderItem.getCustomerName();
                String productItem = orderItem.getProductItem();
                int quantity = orderItem.getQuantity();
                System.out.printf("|%-4d| %-10s| %-20s| %-15s| %-10d| %n", i + 1, orderId, customerName, productItem, quantity);
            }
            System.out.println("===================================================================");
        }
    }

    public static void addOrder(ArrayList<Order> orders, BufferedReader br) throws IOException {
        System.out.print("Enter Order ID: ");
        String orderId = br.readLine();
        System.out.print("Enter Customer Name: ");
        String customerName = br.readLine();
        System.out.println("+-------------------------+");
        System.out.println("| Code |   Product        |");
        System.out.println("+-------------------------+");
        System.out.println("| 101  | WearPack         |");
        System.out.println("| 102  | WorkShirt        |");
        System.out.println("| 103  | WorkShirt & Pants|");
        System.out.println("| 104  | PDH              |");
        System.out.println("| 105  | PDL              |");
        System.out.println("| 105  | Polo             |");
        System.out.println("+-------------------------+");
        System.out.println("Enter Product Name: ");
        String productItem = br.readLine();
        System.out.print("Enter Quantity: ");
        int quantity = Integer.parseInt(br.readLine());

        Order newOrder = new Order(orderId, customerName, productItem, quantity);
        orders.add(newOrder);
        System.out.println("Order added successfully!");
    }

    public static void updateOrder(ArrayList<Order> orders, BufferedReader br) throws IOException {
        if (orders.isEmpty()) {
            System.out.println("Sorry, no orders available to update");
            return;
        }
        showOrder(orders);
        System.out.print("Enter the order number to update: ");
        int orderNumber = Integer.parseInt(br.readLine()) - 1;
        if (orderNumber < 0 || orderNumber >= orders.size()) {
            System.out.println("Invalid order number");
            return;
        }
        Order orderToUpdate = orders.get(orderNumber);
        System.out.print("Enter new Order ID: ");
        orderToUpdate.setOrderId(br.readLine());
        System.out.print("Enter new Customer Name: ");
        orderToUpdate.setCustomerName(br.readLine());
        System.out.println("+-------------------------+");
        System.out.println("| Code |   Product        |");
        System.out.println("+-------------------------+");
        System.out.println("| 101  | WearPack         |");
        System.out.println("| 102  | WorkShirt        |");
        System.out.println("| 103  | WorkShirt & Pants|");
        System.out.println("| 104  | PDH              |");
        System.out.println("| 105  | PDL              |");
        System.out.println("| 105  | Polo             |");
        System.out.println("+-------------------------+");
        System.out.println("Enter Product Name: ");
        orderToUpdate.setProductItem(br.readLine());
        System.out.print("Enter new Quantity: ");
        orderToUpdate.setQuantity(Integer.parseInt(br.readLine()));
        System.out.println("Order updated successfully!");
    }

    public static void deleteOrder(ArrayList<Order> orders, BufferedReader br) throws IOException {
        if (orders.isEmpty()) {
            System.out.println("Sorry, no orders available to delete");
            return;
        }
        showOrder(orders);
        System.out.print("Enter the order number to delete: ");
        int orderNumber = Integer.parseInt(br.readLine()) - 1;
        if (orderNumber < 0 || orderNumber >= orders.size()) {
            System.out.println("Invalid order number");
            return;
        }
        orders.remove(orderNumber);
        System.out.println("Order deleted successfully!");
    }
}