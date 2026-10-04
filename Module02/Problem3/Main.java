package Module02.Problem3;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        // Pada baris ini terjadi error karena kurangnya titik koma (;) di akhir statement
        // e.name = "Roi"
        e1.name = "Roi";

        e1.origin = "Kingdom of Orvel";
        e1.setRole("Assasin");

        // Atribut umur belum diinisialisasi sehingga outputnya akan menjadi 0, ditambahkan inisialisasi umur agar sesuai
        //
        e1.age = 17;

        System.out.println("Nama Pegawai: " + e1.getName());
        System.out.println("Asal: " + e1.getOrigin());
        System.out.println("Jabatan: " + e1.role);

        // Output yang diminta memiliki tambahan kata "tahun" di belakang angka, maka ditambahkan string " tahun" saat mencetak
        // System.out.println("Umur: " + e.age);
        System.out.println("Umur: " + e1.age + " tahun");
    }
}