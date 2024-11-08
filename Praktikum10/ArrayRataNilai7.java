package Praktikum10;

import java.util.Scanner;

public class ArrayRataNilai7 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int []  nilaiMhs =new int[10];
    double totalLulus = 0;
    double totalTidakLulus = 0;
    int lulus = 0;
    int tidakLulus = 0;
    int tertinggi = 0;
    int terendah = 100;

    for (int i=0; i<10; i++){
        System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
        nilaiMhs[i] = sc.nextInt(); 

        if (nilaiMhs[i] > tertinggi) {
            tertinggi = nilaiMhs[i];
        }
        if (nilaiMhs[i] < terendah) {
            terendah = nilaiMhs[i];
        }
    }

    for (int i = 0; i < nilaiMhs.length; i++){
        if (nilaiMhs[i] >= 70) {
            System.out.println("Mahasiswa ke-" + i + " lulus");
            totalLulus += nilaiMhs[i];
            lulus++;
        }else {
            System.out.println("Mahasiswa ke-" + i + " tidak lulus");
            totalTidakLulus += nilaiMhs[i];
            tidakLulus++;
        }
    }

    double rataLulus = (totalLulus > 0) ? (totalLulus/lulus) : 0;
    double rataTidakLulus = (totalTidakLulus > 0) ? (totalTidakLulus/tidakLulus) : 0; 

    System.out.println("Rata-rata nilai mahasiswa lulus adalah : " + rataLulus);
    System.out.println("Rata-rata nilai mahasiswa tidak lulus adalah : " + rataTidakLulus);
    System.out.println("Nilai mahasiswa tertinggi adalah : " + tertinggi);
    System.out.println("Nilai mahasiswa terendah adalah : " + terendah);
    sc.close();
}    
}
