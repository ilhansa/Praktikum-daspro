package Praktikum10;

import java.util.Scanner;

public class TugasPesanan7 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String [] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "cappucino", "Chocolate Ice"};
    double [] daftarHarga = {20000, 22000, 15000, 17000, 13000, 18000, 20000};
    double totalHarga = 0;

    while (true) {
        System.out.println("Masukkan menu : ");
        System.out.println("atau hentikan dengan ketik (selesai)");
        String namaMenu = sc.nextLine();

        if (namaMenu.equalsIgnoreCase("Selesai")){
            break;
        }

        boolean ditemukan = false;
        for (int i = 0; i < daftarMenu.length; i++){
            if (namaMenu.equalsIgnoreCase(daftarMenu[i])) {
                ditemukan = true;

                System.out.println("Masukkan jumlah pesanan : ");
                int jumlahPesanan = sc.nextInt();
                sc.nextLine();

                totalHarga += jumlahPesanan * daftarHarga[i];
                break;
            }
        }

        if (!ditemukan){
            System.out.println("Menu tidak tersedia");
            System.out.println();
        }
    }
        System.out.println("Total harga pesanan anda adalah : " + totalHarga);
        sc.close();

 }   
}
