package Order;

public class pengirimanBarang implements pengiriman {
    private Order order;
    private String statusPengiriman;
    private String alamatAsal;
    private String alamatTujuan;
    private double ongkir;

    public pengirimanBarang(Order order, String alamatAsal, String alamatTujuan, double ongkir) {
        this.order = order;
        this.statusPengiriman = "Belum dikirim";
        this.alamatAsal = alamatAsal;
        this.alamatTujuan = alamatTujuan;
        this.ongkir = ongkir;
    }

    @Override
    public void buatPengiriman() {
        this.statusPengiriman = "Pesanan Sedang Dikemas";
        
        System.out.println("=======================================================");
        System.out.println("Membuat pengiriman untuk pesanan dengan ID " + order.getOrderId());
        System.out.println("Alamat asal: " + alamatAsal);
        System.out.println("Alamat tujuan: " + alamatTujuan);
        System.out.println("Ongkir: " + ongkir);
        System.out.println("=======================================================");
        
        // Menampilkan detail pesanan
        System.out.println("\n=======================================================");
        System.out.println("Detail pesanan:");
        System.out.println("Nama pelanggan: " + order.getCustomerName());
        System.out.println("Barang pesanan: " + order.getProductItem());
        System.out.println("Jumlah: " + order.getQuantity());
        System.out.println("Status Pengiriman : " + this.statusPengiriman);
        System.out.println("=======================================================");
    }
    
    @Override
    public void ubahStatusPengiriman() {
        this.statusPengiriman =  "Diserahkan ke-kurir";
        System.out.println("Status pengiriman untuk pesanan dengan ID " + order.getOrderId() + " telah diubah menjadi " + this.statusPengiriman);
    }

    public String getAlamatAsal() {
        return alamatAsal;
    }
    public String getStatusPengiriman() {
        return statusPengiriman;
    }
    public double getOngkir() {
        return ongkir;
    }
    public void setAlamatAsal(String alamatAsal) {
        this.alamatAsal = alamatAsal;
    }
    public void setAlamatTujuan(String alamatTujuan) {
        this.alamatTujuan = alamatTujuan;
    }
    public void setOngkir(double ongkir) {
        this.ongkir = ongkir;
    }
}