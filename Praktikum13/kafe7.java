package Praktikum13;

import java.util.Scanner;

public class kafe7 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        menu("andi", false, null);
        int totalHarga = 0;

        while (true){
            System.out.println("Masukkan nomor menu yang ingin anda pesan :");
            System.out.println("ketik 0 untuk menyelesaikan pemesanan ");
            int pilihanMenu = sc.nextInt();
            
            if (pilihanMenu == 0){
                break;
            }
            System.out.println("Masukkan jumlah item yang ingin dipesan : ");
            int banyakItem = sc.nextInt();

            totalHarga += hitungTotalHarga(pilihanMenu, banyakItem);
                    
        }
       
        System.out.println("Total harga untuk semua pesanan Anda adalah : Rp." + totalHarga);

        System.out.println("Masukkan kode promo : ");
        System.out.println("(Tekan enter jika tidak ada)");
        sc.nextLine();
        String kodePromo = sc.nextLine();

        double hargaSetelahDiskon = hitungPromo(totalHarga, kodePromo);
        System.out.println("Total harga setelah diskon adalah : Rp." + hargaSetelahDiskon);

        sc.close();
    }

    public static void menu(String namaPelanggan, boolean isMember, String kodePromo){

        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember){
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi hitam - Rp. 15.000");
        System.out.println("2. Cappuccino - Rp. 20.000");
        System.out.println("3. Latte - Rp. 22.000");
        System.out.println("4. Teh tarik - Rp. 12.000");
        System.out.println("5. Roti bakar - Rp. 10.000");
        System.out.println("6. Mie goreng - Rp. 18.000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");
    }



    public static int hitungTotalHarga(int pilihanMenu, int banyakItem){
        int[]hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu-1] * banyakItem;
        return hargaTotal;
    }
    
    public static double hitungPromo(int totalHarga, String kodePromo) {
        double diskon = 0;
        if (kodePromo.equalsIgnoreCase("DISKON30")){
            diskon = totalHarga * 0.3;
        }
        if (kodePromo.equalsIgnoreCase("DISKON50")){
            diskon = totalHarga * 0.5;
        }
        else {
            System.out.println("Tidak ada potongan harga");
        }
        return totalHarga - diskon;
    }

}
