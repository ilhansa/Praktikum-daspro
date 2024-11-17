package Praktikum11;

import java.util.Scanner;

public class BioskopWithScanner7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String [4][2];

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.println("Masukkan nama: ");
                String nama = sc.nextLine();
                System.out.println("Masukkan baris: ");
                int baris = sc.nextInt();
                System.out.println("Masukkan kolom: ");
                int kolom = sc.nextInt();
                sc.nextLine();

                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println("Nomor baris/kolom tidak valid. Coba lagi.");
                } else if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("Kursi sudah terisi! Silakan pilih kursi lain.");
                } else {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data berhasil disimpan.");
                }

            } else if (menu == 2) {
                System.out.println("\nDaftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                    if (penonton[i][j] == null) {
                        System.out.print("***\t");
                    } else {
                        System.out.print(penonton[i][j] + "\t");   
                    }
                }
                    System.out.println();
                }

            } else if (menu == 3) {
                System.out.println("Keluar dari program. Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan menu tidak valid. Coba lagi.");
            }
        }
        sc.close();
    
}
}