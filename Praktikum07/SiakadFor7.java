package Praktikum07;

import java.util.Scanner;

public class SiakadFor7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int jumlahLulus = 0, jumlahTidakLulus = 0;
        final int batasKelulusan = 60; //nilai kelulusan 60

       

        for (int i = 1; i <= 10; i++ ) {
        System.out.println("Masukkan nilai mahasiswa ke-" + i + ":");
        nilai = sc.nextDouble();
        if (nilai > tertinggi) {
            tertinggi = nilai;
        }
        if (nilai < terendah) {
            terendah = nilai;
        }
        if (nilai >= batasKelulusan) {
            jumlahLulus++;
        }
        else {
            jumlahTidakLulus++;
        }
        
       }  

       System.out.println("Nilai tertinggi " + tertinggi);
       System.out.println("Nilai terendah " + terendah);
       System.out.println("Jumlah mahasiswa lulus : " + jumlahLulus);
       System.out.println("Jumlah mahasiswa tidak lulus : " + jumlahTidakLulus);

       sc.close();
    }
    
}