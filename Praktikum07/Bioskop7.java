package Praktikum07;

import java.util.Scanner;

public class Bioskop7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000, totalTiketTerjual = 0;
        double totalPenjualan = 0, totalHarga = 0;
        int jumlahTiket;
        String lanjut = "y";

        do {
        System.out.println("Masukkan jumlah pembelian tiket : ");
        System.out.println("Ketik (0) untuk keluar"); 
        jumlahTiket = sc.nextInt();
        
        if(jumlahTiket == 0) {
            break;
        } else if (jumlahTiket < 0) {
            System.out.println("Jumlah tiket tidak valid, silahkan masukkan ulang.");
            continue;
        }

        if(jumlahTiket > 10) { //diskon 15%
            totalHarga = jumlahTiket * hargaTiket * 0.85;
        } else if (jumlahTiket > 4) { //diskon 10%
            totalHarga = jumlahTiket * hargaTiket * 0.90;
        } else { //tidak ada diskon
            totalHarga = jumlahTiket * hargaTiket; 
        }
        
        totalTiketTerjual += jumlahTiket;
        totalPenjualan += totalHarga;

        System.out.println("Total harga setelah diskon : Rp " + totalHarga);
        System.out.println("Apakah ada pelanggan lain (y/n)? ");
        sc.nextLine();
        lanjut = sc.nextLine();


        } while (lanjut.equalsIgnoreCase("y"));
        System.out.println("Transaksi selesai");
        System.out.println("Total tiket terjual hari ini : " + totalTiketTerjual);
        System.out.println("Total penjualan tiket : Rp " + totalPenjualan);

        sc.close();
    }
    
}
