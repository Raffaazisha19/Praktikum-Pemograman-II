package Module04.Problem03;

public class Dog extends Pet {
    private String furColor;
    private String[] abilities;

    public Dog(String name, String breed, String furColor, String[] abilities) {
        super(name, breed);
        this.furColor = furColor;
        this.abilities = abilities;
    }

    public void displayDogDetails() {
        super.display(); // Memanggil output dari Pet
        System.out.println("Memiliki warna bulu : " + this.furColor);
        System.out.print("Memiliki kemampuan : ");

        for (String ability : this.abilities) {
            System.out.print(ability.trim() + "  ");
        }
    }
}