package model;

public abstract class Product {
    private String kodeProduk;
    protected String namaProduk;
    protected double harga;

    public Product(String kodeProduk, String namaProduk, double harga) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Method Abstract
    public abstract double calculateDiscount();
    
    public String getKodeProduk() {
        return kodeProduk;
    }
    public String getNamaProduk() {
        return namaProduk;
    }
    public double getHarga() {
        return harga;
    }

    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void CheckHarga(int harga){
        System.out.println("ini harga utama" + harga);
    }

    // Method Non-Abstract
    public void show() {
        System.out.println("Kode Produk: " + kodeProduk);
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }

}



