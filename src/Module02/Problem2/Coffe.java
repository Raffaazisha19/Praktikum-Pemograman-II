package Module02.Problem2;

import java.util.Locale;

public class Coffe {
    private String name;
    private String size;
    private double price;
    private String customer;

    public void printInfo() {
        Locale.setDefault(Locale.US);
        System.out.println("Nama Kopi: " + this.name);
        System.out.println("Ukuran: " + this.size);
        System.out.println("Harga: " + this.price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return this.customer = customer;
    }

    public double getTax() {
        return this.price * 0.11;
    }
}