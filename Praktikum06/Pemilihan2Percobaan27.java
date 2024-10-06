package Praktikum06;

import java.util.Scanner;

public class Pemilihan2Percobaan27 {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);

        int pilihan_menu;
        String member;
        double harga; 
        double diskon;
        double total_bayar;

        System.out.println("_____________________");
        System.out.println("=== MENU KAFE JTI ===");
        System.out.println("_____________________");
        System.out.println("1. RiceBowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("______________________________________");
        System.out.print("Masukkan Angka Menu Yang Dipilih = ");
        pilihan_menu = sc7.nextInt();
        sc7.nextLine();
        System.out.print("Apakah Punya Member (Y/N) ? = ");
        member = sc7.nextLine();
        System.out.println("____________________________________");
sc7.close();
        if (member.equalsIgnoreCase("y")) { //membandingkan String
            diskon = 0.10;
            System.out.println("Besar Diskon 10%");
            if (pilihan_menu == 1){
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);

            } else {
                System.out.println("Masukkan Pilihan Menu Dengan Benar!");
                return; //menghentikan eksekusi lebih lanjut jika salah
            }

            //menghitung total bayar setelah diskon
            total_bayar = harga - (harga * diskon);
            System.out.println("Total Bayar Setelah Diskon = " + total_bayar);
        }

        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1){
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 150000;
                System.out.println("Harga Bundling = " + harga);
            } else {
                System.out.println("Masukkan Harga Menu Dengan Benar!");
                return; //Menghentikan eksekusi lebih lanjut jika pilihan salah
            }
             // Menghitung total bayar
             System.out.println("Total Bayar = " + harga);

        } else {
            System.out.println("Member Tidak Valid");
        }
        System.out.println("________________________");


    }
}
