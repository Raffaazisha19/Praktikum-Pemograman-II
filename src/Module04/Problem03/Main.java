package Module04.Problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");

        int pilihan = Integer.parseInt(input.nextLine());

        System.out.print("Nama hewan peliharaan: ");
        String name = input.nextLine();

        System.out.print("Ras: ");
        String breed = input.nextLine();

        if (pilihan == 1) {
            System.out.print("Warna Bulu: ");
            String furColor = input.nextLine();

            System.out.println();

            Cat cat = new Cat(name, breed, furColor);
            cat.displayCatDetails();

        } else if (pilihan == 2) {
            System.out.print("Warna Bulu: ");
            String furColor = input.nextLine();

            System.out.print("Kemampuan : ");
            String skillsInput = input.nextLine();
            String[] abilities = skillsInput.split(",");

            System.out.println();

            Dog dog = new Dog(name, breed, furColor, abilities);
            dog.displayDogDetails();
        }
    }
}