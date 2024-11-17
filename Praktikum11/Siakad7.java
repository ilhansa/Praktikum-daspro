package Praktikum11;

import java.util.Scanner;

public class Siakad7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Masukkan jumlah mahasiswa : ");
        int jumlahSiswa = sc.nextInt();
        System.out.println("Masukkan jumlah mata kuliah : ");
        int jumlahMatkul = sc.nextInt();
        int [][] nilai = new int [jumlahSiswa][jumlahMatkul];

        for (int i=0; i < jumlahSiswa; i++){
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < jumlahMatkul; j++){
                System.out.println("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai [i][j];
            }
            System.out.println("Nilai rata-rata : " + totalPerSiswa / jumlahMatkul);
        }

        System.out.println("\n==================================");
        System.out.println("Nilai rata-rata setiap mata kuliah");

        for (int j = 0; j < jumlahMatkul; j++){
            double totalPermatkul = 0;

            for(int i = 0; i < jumlahSiswa; i++){
                totalPermatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j+1) + ": " + totalPermatkul / jumlahSiswa);
        }

        sc.close();
    }
    
}
