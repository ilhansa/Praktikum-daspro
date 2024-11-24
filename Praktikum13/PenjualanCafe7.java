package Praktikum13;

import java.util.Scanner;

public class PenjualanCafe7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah menu : ");
        int jumlahMenu = input.nextInt();
        System.out.println("Masukkan jumlah hari : ");
        int jumlahHari = input.nextInt();

        String[]menu = new String[jumlahMenu];
        int[][]penjualan = new int [jumlahMenu][jumlahHari];

        inputMenuDanPenjualan(menu, penjualan, input);

        tampilkanSeluruhData(menu, penjualan);

        tampilkanMenuPenjualanTertinggi(menu, penjualan);

        tampilkanRataRataPenjualan(menu, penjualan);

        input.close();
    }

    public static void inputMenuDanPenjualan(String[]menu, int[][]penjualan, Scanner input){
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Masukkan nama menu ke- " + (i+1)+ " :" );
            input.nextLine();
            menu[i] = input.nextLine();

            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.println("Masukkan penjualan " + menu[i] + " pada hari ke-" + (j+1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
            
        }
    }
    
    public static void tampilkanSeluruhData(String[]menu, int [][] penjualan){
        System.out.println("\nData penjualan");
        System.out.printf("%-15s", "menu");
        for (int i = 0; i < penjualan[0].length; i++) {
            System.out.printf("%-15s","hari " + (i+1));
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.printf("%d\t\t", penjualan[i][j]);
            }
            System.out.println();
        }
    }

    public static void tampilkanMenuPenjualanTertinggi(String[]menu, int penjualan[][]){
        int maxPenjualan = 0;
        String menuTerlaris = "";

        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;

            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }

            if(totalPenjualan > maxPenjualan){
                maxPenjualan = totalPenjualan;
                menuTerlaris = menu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi adalah: " + menuTerlaris + " dengan total penjualan " + maxPenjualan);
    }

    public static void tampilkanRataRataPenjualan (String [] menu, int[][]penjualan){
        System.out.println("\nRata-rata penjualan setiap menu");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / penjualan[i].length;
            System.out.printf("%-10s: %.2f\n", menu[i], rataRata);
        }
    }



}
