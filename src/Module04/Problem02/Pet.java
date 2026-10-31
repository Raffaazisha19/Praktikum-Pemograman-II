package Module04.Problem02;

public class Pet {
    private String name;
    private String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void display() {
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah: " + this.name);
        System.out.println("Dengan Ras: " + this.breed);
    }
}