package Module02.Problem2;

public class Main {
    public static void main(String[] args) {
        Coffe coffe = new Coffe();
        coffe.setName("Espresso");
        coffe.setSize("Medium");
        coffe.setPrice(25000);

        coffe.printInfo();
        coffe.setCustomer("Alice");
        System.out.println("Pembeli Kopi: " + coffe.getCustomer());
        System.out.println("Pajak Kopi: " + coffe.getTax());
    }
}