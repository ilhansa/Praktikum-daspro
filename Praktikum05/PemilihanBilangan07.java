package Praktikum05;

import java.util.Scanner;

public class PemilihanBilangan07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Sebuah Angka: ");
        int angka = sc.nextInt();

    //     if (angka % 2 == 0)
    //     {
    //         System.out.println("Angka " + angka + " Termasuk Bilangan Genap");
    // }
    //  else {
    //     System.out.println("Angka " + angka + " Termasuk Bilangan Ganjil");
    // }

String hasil = (angka %2 == 0) ? "Angka"  + angka + "Termasuk Bilangan Genap"
: "Angka" + angka + "Termasuk Bilangan Ganjil";
System.out.println(hasil);
    
sc.close();
  }
    
}
