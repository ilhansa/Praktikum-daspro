package Praktikum03;

import java.util.Scanner;

public class Bank7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variabel
        double tabunganAwal, tabunganAkhir, bunga, presentaseBunga;
        int lamaMenabung;
        
        //inisiasi nilai variabel presentaseBunga
        presentaseBunga = 0.0002;

        //perintah untuk menginputkan tabunganAwal dan lamaMenabung
        System.out.println("Masukkan jumblah tabungan awal: ");
        tabunganAwal = sc.nextDouble();
        System.out.println("Masukkan lama menabung (bulan): ");
        lamaMenabung = sc.nextInt();

        //perintah untuk menghitung bunga 
        bunga = presentaseBunga * lamaMenabung * tabunganAwal;

        //perintah untuk menghitung tabunganAkhir 
        tabunganAkhir = tabunganAwal + bunga;

        //nilai variabel bunga dan tabunganAkhir 
        System.out.println("Bunga: " + bunga);
        System.out.println("Tabungan akhir: " + tabunganAkhir);

sc.close();
    }
    
}
