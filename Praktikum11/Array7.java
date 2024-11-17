package Praktikum11;

import java.util.Scanner;

public class Array7 { public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int responden = 10;
    int pertanyaan = 6;
    int [][] nilai = new int [responden][pertanyaan];

    double totalKeseluruhan = 0;
    
    for (int i=0; i < responden; i++){
        System.out.println("Input nilai responden ke-" + (i + 1));
        System.out.println("Masukkan nilai 1-5");
        double totalNilaiResponden = 0;

        for (int j = 0; j < pertanyaan; j++){
            System.out.println("Nilai pertanyaan ke-" + (j+1) + ": ");
            nilai[i][j] = sc.nextInt();
            totalNilaiResponden += nilai [i][j];
            totalKeseluruhan += nilai [i][j];
        }
        System.out.println("Nilai rata-rata responden ke-" + (i+1) + ": " + totalNilaiResponden / pertanyaan);
        System.out.println();
    }

    System.out.println("\n==================================");
    System.out.println("Nilai rata-rata setiap pertanyaan : ");
    for (int j = 0; j < pertanyaan;j++){
        double totalPertanyaan = 0;

        for (int i = 0; i < responden; i++){
            totalPertanyaan += nilai[i][j];
        }
        System.out.println("Pertanyaan ke-" + (j+1) + ":" + totalPertanyaan / responden);
    }  

    System.out.println("\n============================");
    System.out.println("Nilai rata-rata keseluruhan : ");
    int totalElemen = responden * pertanyaan;
    double rataKeseluruhan = totalKeseluruhan / totalElemen;
    System.out.println(rataKeseluruhan);

    sc.close();
    }
}