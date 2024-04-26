import Order.*;
import model.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    private static ArrayList<Order> orders = new ArrayList<>();
    // private static ArrayList<Product> products = new ArrayList<>();
    private static ArrayList<Kaos> kaosProduct= new ArrayList<>();
    private static ArrayList<Kemeja> kemejaProduct = new ArrayList<>();
    private static ArrayList<ProdukLainnya> othersProduct = new ArrayList<>();
    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(isr);
    public static void main(String[] args) throws IOException {
        while (true) {
            Konveksi msg = new Konveksi();
            msg.ShowMainMenu();
            System.out.print("  Choose Menu : ");
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    manageProductsMenu();
                    break;
                case 2:
                    manageOrdersMenu();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void manageProductsMenu() throws IOException {
        while (true) {
            System.out.println("\n+----------------------------------------------+");
            System.out.println("|         [ Product Management Menu ]          |");
            System.out.println("+----------------------------------------------+");
            System.out.println("| [1] Show Products    | [4] Delete Product    |");
            System.out.println("| [2] Add New Product  | [5] Back to Main Menu |");
            System.out.println("| [3] Update Product   |                       |");
            System.out.println("+----------------------------------------------+");
            System.out.print("|  Choose Menu : ");
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    showProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void showProducts() throws IOException {
        while (true) {
            System.out.println("\n+--------------------------------------------+");
            System.out.println("|          [ Product Category ]              |");
            System.out.println("| [1] Kaos  [2] Kemeja [3] Lainnya] [4] Exit |");
            System.out.println("+--------------------------------------------+");
            System.out.println("|  Choose Category : ");
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    ShowKaosProduct();
                    break;
                case 2:
                    ShowKemejaProduct();
                    break;
                case 3: 
                    ShowOthersProduct();
                    break;
                case 4:
                    return;       
                default:
                    break;
            }   
        }
    }
    private static void ShowKaosProduct() throws IOException{
        if (kaosProduct.isEmpty()) {
            System.out.println("\nSorry, products available");
        } else {
            System.out.println("---------- Kategori Kaos -------------");
            for (int i = 0; i < kaosProduct.size(); i++) {
                Kaos kaos = kaosProduct.get(i);
                System.out.println("Kode Produk : " + kaos.getKodeProduk());
                System.out.println("Nama Produk : " + kaos.getNamaProduk());
                System.out.println("Harga Produk: " + kaos.getHarga());
                System.out.println("Size Range  : " + kaos.getSizeRange());
                System.out.println("Bahan : " + kaos.getBahan());
            }
            System.out.println("--------------------------------------");
        }
    }

    private static void ShowKemejaProduct() throws IOException{
        if (kemejaProduct.isEmpty()) {
            System.out.println("\nSorry, products available");
        } else {
            System.out.println("---------- Kategori Kemeja -------------");
            for (int i = 0; i < kemejaProduct.size(); i++) {
                Kemeja kemeja = kemejaProduct.get(i);
                System.out.println("Kode Produk : " + kemeja.getKodeProduk());
                System.out.println("Nama Produk : " + kemeja.getNamaProduk());
                System.out.println("Harga Produk: " + kemeja.getHarga());
                System.out.println("Size Range  : " + kemeja.getSizeRange());
                System.out.println("Bahan : " + kemeja.getBahan());
            }
            System.out.println("--------------------------------------");
        }
    }

    private static void ShowOthersProduct(){
        if (othersProduct.isEmpty()) {
            System.out.println("\nSorry, products available");
        } else {
            System.out.println("---------- Kategori Lainnya -------------");
            for (int i = 0; i < kaosProduct.size(); i++) {
                ProdukLainnya others = othersProduct.get(i);
                System.out.println("Kode Produk : " + others.getKodeProduk());
                System.out.println("Nama Produk : " + others.getNamaProduk());
                System.out.println("Harga Produk: " + others.getHarga());
                System.out.println("Size Range  : " + others.getSizeRange());
                System.out.println("Bahan : " + others.getBahan());
            }
            System.out.println("--------------------------------------");
        }
    }

    private static void addProduct() throws IOException {
        while (true) {
            System.out.println("\n+--------------------------------------------+");
            System.out.println("|          [ Product Category ]              |");
            System.out.println("| [1] Kaos  [2] Kemeja [3] Lainnya] [4] Exit |");
            System.out.println("+--------------------------------------------+");
            System.out.println("|  Choose Category : ");
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    String KodeProduk = "KS" + kaosProduct.size() + 1;
                    System.out.print("Enter Product Name: ");
                    String NamaProduk = br.readLine();
                    System.out.print("Enter Price: ");
                    double Harga = Double.parseDouble(br.readLine());
                    System.out.print("Enter Size Range: ");
                    String SizeRange = br.readLine();
                    System.out.print("Enter Order Minimum: ");
                    int OrderMinimum = Integer.parseInt(br.readLine());
                    System.out.print("Enter Material: ");
                    String Bahan = br.readLine();
                    Kaos newKaos = new Kaos(KodeProduk, NamaProduk, Harga, SizeRange, OrderMinimum, Bahan);
                    kaosProduct.add(newKaos);
                    System.out.println("Product added successfully!");
                    break;
                case 2:
                    String KodeKemeja = "KJ" + kemejaProduct.size() + 1;
                    System.out.print("Enter Product Name: ");
                    String NamaKemeja = br.readLine();
                    System.out.print("Enter Price: ");
                    double HargaKemeja = Double.parseDouble(br.readLine());
                    System.out.print("Enter Size Range: ");
                    String SizeKemeja = br.readLine();
                    System.out.print("Enter Order Minimum: ");
                    int OrderMinimumKemeja= Integer.parseInt(br.readLine());
                    System.out.print("Enter Material: ");
                    String BahanKemeja = br.readLine();
                    Kemeja newKemeja = new Kemeja(KodeKemeja, NamaKemeja, HargaKemeja, SizeKemeja, OrderMinimumKemeja, BahanKemeja);
                    kemejaProduct.add(newKemeja);
                    System.out.println("Product added successfully!");
                    break;
                case 3:
                    String KodeOthersProduct = "KJ" + othersProduct.size() + 1;
                    System.out.print("Enter Product Name: ");
                    String NamaOthersProduct = br.readLine();
                    System.out.print("Enter Price: ");
                    double HargaOthersProduct = Double.parseDouble(br.readLine());
                    System.out.print("Enter Size Range: ");
                    String SizeOthersProduct = br.readLine();
                    System.out.print("Enter Order Minimum: ");
                    int OrderMinimumOP = Integer.parseInt(br.readLine());
                    System.out.print("Enter Material: ");
                    String BahanOP = br.readLine();
                    ProdukLainnya newProdukLainnya = new ProdukLainnya(KodeOthersProduct, NamaOthersProduct, HargaOthersProduct, SizeOthersProduct, OrderMinimumOP, BahanOP);
                    othersProduct.add(newProdukLainnya);
                    System.out.println("Product added successfully!");
                    break;
                case 4:
                    return;       
                default:
                    break;
            }   
        }
    }

    private static void updateProduct() throws IOException {
        while (true) {
            System.out.println("\n+--------------------------------------------+");
            System.out.println("|          [ Product Category ]              |");
            System.out.println("| [1] Kaos  [2] Kemeja [3] Lainnya] [4] Exit |");
            System.out.println("+--------------------------------------------+");
            System.out.println("|  Choose Category : ");
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    System.out.println("Ubah Data Produk");
                    ShowKaosProduct();
                    System.out.println("cari index : ");
                    int search = Integer.parseInt(br.readLine());
                    for( int i = 0; i < kaosProduct.size(); i++){
                        if(search == i){
                            Kaos KaosBaru = kaosProduct.get(i);
                            String NamaBaru = br.readLine();
                            KaosBaru.setNamaProduk(NamaBaru);
                            System.out.print("Enter Price: ");
                            double HargaBaru = Double.parseDouble(br.readLine());
                            KaosBaru.setHarga(HargaBaru);
                            System.out.print("Enter Size Range: ");
                            String SizeRangeBaru = br.readLine();
                            System.out.print("Enter Order Minimum: ");
                            KaosBaru.setSizeRange(SizeRangeBaru);
                            int OrderMinimumBaru = Integer.parseInt(br.readLine());
                            KaosBaru.setMinimalOrder(OrderMinimumBaru);
                            System.out.print("Enter Material: ");
                            String BahanBaru = br.readLine();
                            KaosBaru.setBahan(BahanBaru);
                            System.out.println("Product Update successfully!");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ubah Data Produk");
                    ShowKaosProduct();
                    System.out.println("cari index : ");
                    int searchKemeja = Integer.parseInt(br.readLine());
                    for( int i = 0; i < kemejaProduct.size(); i++){
                        if(searchKemeja == i){
                            Kemeja KemejaBaru = kemejaProduct.get(i);
                            String NamaBaru = br.readLine();
                            KemejaBaru.setNamaProduk(NamaBaru);
                            System.out.print("Enter Price: ");
                            double HargaBaru = Double.parseDouble(br.readLine());
                            KemejaBaru.setHarga(HargaBaru);
                            System.out.print("Enter Size Range: ");
                            String SizeRangeBaru = br.readLine();
                            System.out.print("Enter Order Minimum: ");
                            KemejaBaru.setSizeRange(SizeRangeBaru);
                            int OrderMinimumBaru = Integer.parseInt(br.readLine());
                            KemejaBaru.setMinimalOrder(OrderMinimumBaru);
                            System.out.print("Enter Material: ");
                            String BahanBaru = br.readLine();
                            KemejaBaru.setBahan(BahanBaru);
                            System.out.println("Product Update successfully!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ubah Data Produk");
                    ShowOthersProduct();
                    System.out.println("cari index : ");
                    int searchLainnya = Integer.parseInt(br.readLine());
                    for( int i = 0; i < othersProduct.size(); i++){
                        if(searchLainnya == i){
                            ProdukLainnya newOthersProduct = othersProduct.get(i);
                            String NamaBaru = br.readLine();
                            newOthersProduct.setNamaProduk(NamaBaru);
                            System.out.print("Enter Price: ");
                            double HargaBaru = Double.parseDouble(br.readLine());
                            newOthersProduct.setHarga(HargaBaru);
                            System.out.print("Enter Size Range: ");
                            String SizeRangeBaru = br.readLine();
                            System.out.print("Enter Order Minimum: ");
                            newOthersProduct.setSizeRange(SizeRangeBaru);
                            int OrderMinimumBaru = Integer.parseInt(br.readLine());
                            newOthersProduct.setMinimalOrder(OrderMinimumBaru);
                            System.out.print("Enter Material: ");
                            String BahanBaru = br.readLine();
                            newOthersProduct.setBahan(BahanBaru);
                            System.out.println("Product Update successfully!");
                        }
                    }
                    break;
                case 4:
                    return;
                default:
                    break;
            }
        }
    }
    
    private static void deleteProduct() throws IOException {
        while (true) {
            System.out.println("\n=  DELETE PRODUCT MENU  =");
            System.out.println("\n+--------------------------------------------+");
            System.out.println("|          [ Product Category ]              |");
            System.out.println("| [1] Kaos  [2] Kemeja [3] Lainnya] [4] Exit |");
            System.out.println("+--------------------------------------------+");
            System.out.println("|  Choose Category : ");
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    if (kaosProduct.isEmpty()) {
                        System.out.println("Sorry, no kaosProduct available to delete");
                        return;
                    }
                    ShowKaosProduct();
                    System.out.print("Enter the Product number to delete: ");
                    int KaosNumber = Integer.parseInt(br.readLine()) - 1;
                    if (KaosNumber < 0 || KaosNumber >= kaosProduct.size()) {
                        System.out.println("Invalid Product number");
                        return;
                    }
                    kaosProduct.remove(KaosNumber);
                    System.out.println("Product deleted successfully!");
                    break;
                case 2:
                    if (kemejaProduct.isEmpty()) {
                        System.out.println("Sorry, no kemejaProduct available to delete");
                        return;
                    }
                    ShowKemejaProduct();
                    System.out.print("Enter the Product number to delete: ");
                    int kemejaNumber = Integer.parseInt(br.readLine()) - 1;
                    if (kemejaNumber < 0 || kemejaNumber >= kemejaProduct.size()) {
                        System.out.println("Invalid Product number");
                        return;
                    }
                    kemejaProduct.remove(kemejaNumber);
                    System.out.println("Product deleted successfully!");
                    break;
                case 3:
                    if (othersProduct.isEmpty()) {
                        System.out.println("Sorry, no othersProduct available to delete");
                        return;
                    }
                    ShowOthersProduct();
                    System.out.print("Enter the Product number to delete: ");
                    int othersNumber = Integer.parseInt(br.readLine()) - 1;
                    if (othersNumber < 0 || othersNumber >= othersProduct.size()) {
                        System.out.println("Invalid Product number");
                        return;
                    }
                    othersProduct.remove(othersNumber);
                    System.out.println("Product deleted successfully!");
                    break;
                case 4:
                    return;
                default:
                    break;
            }
        }   
    }

    private static void manageOrdersMenu() throws IOException{

        while (true) {
            System.out.println("\n+--------------------------------------------+");
            System.out.println("|            [  Menu Pemesanan ]             |");
            System.out.println("+--------------------------------------------+");
            System.out.println("| [1] Show Order    | [4] Delete Order       |");
            System.out.println("| [2] Add New Order | [5] Calculate Discount |");
            System.out.println("| [3] Update Order  | [6] Exit               |");
            System.out.println("+--------------------------------------------+");
            System.out.print("| Choose Menu : ");
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
                    calculateDiscount();
                    break;
                case 6:
                    return;
                default:
                    break;
            }
        }
    }
    // ArrayList<Product> products, ArrayList<Kaos> kaosProduct,ArrayList<Kemeja> kemejaProduct
    private static void calculateDiscount() throws IOException {
        System.out.println("+-------------------------+");
        System.out.println("| 1. Kaos Discount        |");
        System.out.println("| 2. Kemeja Discount      |");
        System.out.println("| 3. Back to Main Menu    |");
        System.out.println("+-------------------------+");
        System.out.print("Choose Product : ");
        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                calculateKaosDiscount();
                break;
            case 2:
                calculateKemejaDiscount();
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void calculateKaosDiscount() throws IOException {
        ShowKaosProduct();
        System.out.print("Enter index of Kaos: ");
        int search = Integer.parseInt(br.readLine());
        for (int i = 0; i < kaosProduct.size(); i++) {
            if (search == i) {
                Kaos kaosBaru = kaosProduct.get(i);
                double discountAmount = kaosBaru.calculateDiscount();
                double discountedPrice = kaosBaru.getHarga() - discountAmount;
                System.out.println("\n--------------------------------------------------------");
                System.out.println("Discount amount for Kaos " + kaosBaru.getKodeProduk() + ": Rp" + discountAmount);
                System.out.println("Discounted price for Kaos " + kaosBaru.getKodeProduk() + ": Rp" + discountedPrice);
                System.out.println("--------------------------------------------------------");
                System.out.println( "\nDapatkan Diskon terbaik \nSesuai Jumlah Pesanan Anda");
                System.out.println("--------------------------------------------------------");
                System.out.println("Enter jumlah pesanan anda :");
                int jumlahPesanan = Integer.parseInt(br.readLine());
                double discountAmountTambahan = kaosBaru.calculateDiscount(jumlahPesanan);
                double discountedPriceTambahan = kaosBaru.getHarga() - discountAmountTambahan;
                System.out.println("--------------------------------------------------------");
                System.out.println("\nDiscount amount for Kaos " + kaosBaru.getKodeProduk() + ": Rp" + discountAmountTambahan);
                System.out.println("Discounted price for Kaos " + kaosBaru.getKodeProduk() + ": Rp" + discountedPriceTambahan);
                System.out.println("--------------------------------------------------------");
                
                
            }
        }
    }
    
    private static void calculateKemejaDiscount() throws IOException {
        ShowKemejaProduct();
        System.out.print("Enter index of Kemeja: ");
        int search = Integer.parseInt(br.readLine());
        for (int i = 0; i < kemejaProduct.size(); i++) {
            if (search == i) {
                Kemeja listKemeja = kemejaProduct.get(i);
                double discountAmount = listKemeja.calculateDiscount();
                double discountedPrice = listKemeja.getHarga() - discountAmount;
                System.out.println("\n--------------------------------------------------------");
                System.out.println("Discount amount for Kemeja " + listKemeja.getKodeProduk() + ": Rp" + discountAmount + "/Pcs");
                System.out.println("Discounted price for Kemeja " + listKemeja.getKodeProduk() + ": Rp" + discountedPrice + "/Pcs");
                System.out.println("\n--------------------------------------------------------");
                System.out.println( "Dapatkan Diskon terbaik Sesuai Jumlah Pesanan Anda");
                System.out.println("--------------------------------------------------------");
                System.out.println("Enter jumlah pesanan anda :");
                int jumlahPesanan = Integer.parseInt(br.readLine());
                double discountAmountTambahan = listKemeja.calculateDiscount(jumlahPesanan);
                double discountedPriceTambahan = listKemeja.getHarga() - discountAmountTambahan;
                System.out.println("\n--------------------------------------------------------");
                System.out.println("Discount amount for Kemeja " + listKemeja.getKodeProduk() + ": Rp" + discountAmountTambahan + "/Pcs");
                System.out.println("Discounted price for Kemeja " + listKemeja.getKodeProduk() + ": Rp" + discountedPriceTambahan + "/Pcs");
                System.out.println("--------------------------------------------------------");


            }
        }
    }
    

    private static void showOrder(ArrayList<Order> orders) {
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

    private static void addOrder(ArrayList<Order> orders, BufferedReader br) throws IOException {
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

    private static void updateOrder(ArrayList<Order> orders, BufferedReader br) throws IOException {
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

    private static void deleteOrder(ArrayList<Order> orders, BufferedReader br) throws IOException {
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