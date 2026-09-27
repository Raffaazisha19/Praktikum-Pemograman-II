package Module01.Problem05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double PHI = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double radius = scanner.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double height = scanner.nextDouble();

        double volume = PHI * radius * radius * height;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3%n",
                radius, height, volume);

    }
}