package Module03.Problem03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa Berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            int option = Integer.parseInt(input.nextLine());

            switch (option) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (Harus unik): ");
                    String nim = input.nextLine();

                    boolean doesIdAlreadyExist = false;
                    for (Student student : students) {
                        if (student.getNIM().equals(nim)) {
                            doesIdAlreadyExist = true;
                            break;
                        }
                    }

                    if (doesIdAlreadyExist) {
                        System.out.println("Peringatan: NIM sudah terdaftar.");
                    } else {
                        students.add(new Student(nama, nim));
                        System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM yang ingin dihapus: ");
                    String nimHapus = input.nextLine();
                    boolean isIdFound = false;

                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getNIM().equals(nimHapus)) {
                            isIdFound = true;
                            students.remove(i);
                            System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                            break;
                        }
                    }

                    if (!isIdFound) {
                        System.out.println("NIM tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nimCari = input.nextLine();
                    boolean isCariFound = false;

                    for (Student student : students) {
                        if (student.getNIM().equals(nimCari)) {
                            isCariFound = true;
                            System.out.println("NIM: " + student.getNIM() + ", Nama: " + student.getName());
                            break;
                        }
                    }

                    if (!isCariFound) {
                        System.out.println("NIM tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Student student : students) {
                        System.out.println("NIM: " + student.getNIM() + ", Nama: " + student.getName());
                    }
                    break;

                case 0:
                    students.clear();
                    System.out.println("Terima kasih!");

                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}