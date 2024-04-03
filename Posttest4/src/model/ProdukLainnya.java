// File: Lainnya.java
package model;

public class ProdukLainnya extends Product {
    private String sizeRange;
    private int minimalOrder;
    protected String bahan;

    public ProdukLainnya(String kodeProduk, String namaProduk, double harga, String sizeRange, int minimalOrder, String bahan) {
        super(kodeProduk, namaProduk, harga);
        this.sizeRange = sizeRange;
        this.minimalOrder = minimalOrder;
        this.bahan = bahan;
    }

    // Overriding method calculateDiscount untuk Produk Lainnya
    @Override
    public double calculateDiscount() {
        // Diskon 20% untuk Kaos
        return getHarga() * 0.20;
    }

    // Overloading method calculateDiscount untuk Produk Lainnya dengan parameter tambahan
    public double calculateDiscount(double discountPercentage) {
        return getHarga() * (discountPercentage / 100);
    }

    public String getSizeRange() {
        return sizeRange;
    }
    public int getMinimalOrder() {
        return minimalOrder;
    }
    public String getBahan() {
        return bahan;
    }
    public void setSizeRange(String sizeRange) {
        this.sizeRange = sizeRange;
    }
    public void setMinimalOrder(int minimalOrder) {
        this.minimalOrder = minimalOrder;
    }
    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

}

