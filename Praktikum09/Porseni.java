package Praktikum09;

import java.util.Scanner;

public class Porseni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (i <=4) {
            System.out.println("Masukkan cabang olahraga : ");
            String cabor = sc.nextLine();
            String atlet = "";

        for (int j = 1 ; j <= 5; j++ ){
            System.out.println("Masukkan nama atlet " + cabor + " ke " + j + " :");
            String nama = sc.nextLine();
            atlet += nama;

            if( j < 5) {
                atlet += ",";
            }

        }
                System.out.print("Pemain cabang olahraga " + cabor + " adalah : " + atlet);
        i++;
        System.out.println();
        System.out.println();
        }
        sc.close();
        
        
    }
}
