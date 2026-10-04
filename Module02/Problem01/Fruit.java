package Module02.Problem01;

public class Fruit {
    private final double pricePerKg;
    private String nameFruit;
    private double weight;
    private double priceFruit;
    private double purchaseAmount;


    public Fruit(String nameFruit, double weight, double priceFruit, double purchaseAmount) {
        this.nameFruit = nameFruit;
        this.weight = weight;
        this.priceFruit = priceFruit;
        this.purchaseAmount = purchaseAmount;
        this.pricePerKg = this.priceFruit / this.weight;
    }

    public void printInfo() {
        System.out.println("Nama Buah    : " + nameFruit);
        System.out.println("Berat (kg)   : " + weight);
        System.out.println("Harga Satuan : Rp " + priceFruit);
        System.out.println("Jumlah Beli  : " + purchaseAmount);
        System.out.println("Total Harga  : Rp " + this.getPreDiscountPrice());
        System.out.println("Total Diskon : Rp " + this.getDiscountTotal());
        System.out.println("Harga Setelah Diskon  : Rp " + this.getPostDiscountPrice());
        System.out.println("");
    }

    public double getDiscountTotal() {
        return (int) (4 * (this.pricePerKg * 4) * 0.02);
    }

    public double getPreDiscountPrice() {
        return priceFruit * purchaseAmount;
    }

    public double getPostDiscountPrice() {
        return getPreDiscountPrice() - getDiscountTotal();
    }
}