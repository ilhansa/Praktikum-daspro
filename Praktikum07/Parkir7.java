package Praktikum07;

import java.util.Scanner;

public class Parkir7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPembayaran = 0, biayaParkir = 0, durasiParkir;
        String jenisKendaraan;

        do {
            System.out.println("Masukkan jenis kendaraan (mobil/motor) : ");
            System.out.println("ketik (0) untuk keluar");
            jenisKendaraan = sc.nextLine();

            if(jenisKendaraan.equals("0")){
                break;
            }
            if (!jenisKendaraan.equalsIgnoreCase("mobil") && !jenisKendaraan.equalsIgnoreCase("motor")){
            System.out.println("Jenis kendaraan tidak valid, silahkan masukkan 'mobil' atau 'motor' ");
            continue;
            }

            System.out.println("Masukkan durasi parkir dalam jam : ");
            durasiParkir = sc.nextInt();
            sc.nextLine();

            if (durasiParkir < 0) {
                System.out.println("Durasi parkir tidak valid, silahkan masukkan ulang");
                continue;
            }
            if (durasiParkir > 5) {
                biayaParkir = 12500;
            }
            else {
                if (jenisKendaraan.equalsIgnoreCase("mobil")){
                    biayaParkir = durasiParkir * 3000; //harga parkir mobil
                } else if (jenisKendaraan.equalsIgnoreCase("motor")) {
                    biayaParkir = durasiParkir * 2000; //harga parkir motor
                }
            }
            totalPembayaran +=biayaParkir;

            System.out.println("Biaya parkir untuk kendaraan " + jenisKendaraan + " selama " + durasiParkir + " jam adalah : Rp " + biayaParkir );
        } while (true); //loop akan berhenti ketika mengetik 0

        System.out.println("Total pembayaran parkir : Rp " + totalPembayaran);
        
        sc.close();
    

    }
    
}
