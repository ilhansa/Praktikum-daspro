package Praktikum03;

import java.util.Scanner;

public class GajiKaryawan7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //input jam kerja dan upah
        System.out.println("Masukkan Total Jam Kerja: ");
        double jamKerja = sc .nextDouble();
        double upahPerJam = 7777;

        //menghitung gaji sebelum pajak
        double gajiSebelumPajak = jamKerja * upahPerJam;

        //Bonus gaji 10% sebelum pajak
        double bonus = gajiSebelumPajak * 0.10;

        //hitung total gaji setelah bonus
        double gajiSetelahBonus = bonus + gajiSebelumPajak;

        //hitung gaji setelah pajak
        double gajiSetelahPajak = gajiSetelahBonus * 0.05;

        //hitung total gaji bersih
        double gajiBersih = gajiSetelahBonus - gajiSetelahPajak;

        //tampilkan hasil 
        System.out.println("Gaji Sebelum Pajak: Rp " + gajiSebelumPajak);
        System.out.println("Bonus: Rp " + bonus);
        System.out.println("Gaji Setelah Bonus: Rp " + gajiSetelahBonus);
        System.out.println("Gaji Dipotong Pajak: Rp " + gajiSetelahPajak);
        System.out.println("Total Gaji Bersih: Rp " + gajiBersih);

        sc.close();




    }
    
}
