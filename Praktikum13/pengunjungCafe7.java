package Praktikum13;

public class pengunjungCafe7 {
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }

    public static void daftarPengunjung (String... namaPengunjung){
        System.out.println("Daftar nama pengunjung : ");
        
        for (String nama : namaPengunjung){
            System.out.println("- " + nama);
        }
    }
    
}
