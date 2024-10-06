package Praktikum06;

import java.util.Scanner;

public class LatihanFlowchartTokoBuku7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //Input hari
        System.out.println("Input hari");
        String hari = sc.nextLine();

        sc.close();

        if (hari.equalsIgnoreCase("rabu")) {
        //input jenis buku dan jumlah
        System.out.println("Masukkan jenis (kamus/novel/lainnya)");
        String jenisBuku = sc.nextLine().toLowerCase();

        System.out.println("Masukkan jumblah buku");
        int jumlahBuku = sc.nextInt();

        //menghitung dikson
        double diskon = 0;
        if (jenisBuku.equals("kamus"))
        //diskon awal 10%
        diskon = 0.1;

        
    }

    }
}
