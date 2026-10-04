package Module02.Problem3;

// Pada baris ini terjadi error karena nama class tidak sesuai dengan nama object yang dibuat pada file Main.java
// public class Pegawai {
public class Employee {
    public String name;

    // Pada baris ini terjadi error karena tipe data 'char' hanya bisa menampung 1 karakter, sedangkan inputnya adalah String "Kingdom of Orvel"
    // public char origin;
    public String origin;

    public String role;
    public int age;

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    // Pada baris ini terjadi error karena method setRole tidak memiliki parameter, sehingga variabel 'r' tidak terdefinisi
    // public void setRole() {
    public void setRole(String r) {
        this.role = r;
    }
}