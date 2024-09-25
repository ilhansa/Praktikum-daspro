package Praktikum03;

import java.util.Scanner;

public class Listrik7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input jumblah penggunaan listrik dalam Kwh
        System.out.println("Masukkan jumbah penggunaan listrik dalam KWH: ");
        double penggunaanListrik = sc.nextDouble();

        //tarif per KWH
        int tarifPerKwh = 7777;

        //menghitung tagihan listrik
        double totalTagihan = penggunaanListrik * tarifPerKwh;

        //apakah penggunaan listrik lebih dari 500 Kwh
        boolean melebihi500Kwh = penggunaanListrik > 500;

        //hasil
        System.out.println("Total Tagihan Listrik: Rp " + totalTagihan);

        if (melebihi500Kwh) {
            System.out.println("Penggunaan Listrik Melebihi 500KWH. ");
        }
        else{
            System.out.println("Penggunaan Listrik Tidak Melebihi 500KWH. ");
    }
sc.close();

    }

}
   

       