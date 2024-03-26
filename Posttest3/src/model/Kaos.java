package model;

public class Kaos extends Product {
    private String sizeRange;
    private int minimalOrder;
    protected String bahan;

    public Kaos(String kodeProduk, String namaProduk, double harga, String sizeRange, int minimalOrder, String bahan) {
        super(kodeProduk, namaProduk, harga);
        this.sizeRange = sizeRange;
        this.minimalOrder = minimalOrder;
        this.bahan = bahan;
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
