package Module01.Problem01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nama Lengkap: ");
        String name = input.nextLine();

        System.out.print("Masukan Tempat Lahir: ");
        String birthPlace = input.nextLine();

        System.out.print("Masukan Tanggal Lahir: ");
        int birthDay = input.nextInt();

        System.out.print("Masukan Bulan Lahir: ");
        int birthMonth = input.nextInt();

        System.out.print("Masukan Tahun Lahir: ");
        int birthYear = input.nextInt();

        System.out.print("Masukan Tinggi Badan: ");
        int height = input.nextInt();

        System.out.print("Masukan Berat Badan: ");
        double weight = input.nextDouble();

        String monthName = switch (birthMonth) {
            case 1 -> "Januari";
            case 2 -> "Februari";
            case 3 -> "Maret";
            case 4 -> "April";
            case 5 -> "Mei";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "Agustus";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            case 12 -> "Desember";
            default -> "Bulan invalid";
        };

        System.out.println("Nama Lengkap " + name + ", Lahir di " + birthPlace + " pada Tanggal " + birthDay + " " + monthName + " " + birthYear);
        System.out.println("Tinggi Badan " + height + " cm dan Berat Badan " + weight + " kilogram");
    }
}