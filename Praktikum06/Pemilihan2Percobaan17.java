package Praktikum06;

import java.util.Scanner;

public class Pemilihan2Percobaan17 {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner (System.in);
        
    System.out.println("Masukkan Tahun");    
    int tahun = sc7.nextInt();

            // memeriksa apakah tahun kabisat
        if ((tahun %4) == 0) {
         if ((tahun % 100) == 0) {
            // jika tahun habis dibagi 100, apakah juga habis dibagi 400
            if ((tahun % 400) == 0) {
           System.out.println("Tahun Kabisat");

        }else{
           System.out.println("Bukan Tahun Kabisat");
        }
        } else {
            // jika tahun habis dibagi 4 dan tidak habis dibagi 100, maka tahun kabisat
            System.out.println("Tahun kabisat");
        }
        } else { 
            // jka tahun tidak habis dibagi 4 maka bukan tahun kabisat
            System.out.println("Bukan tahun kabisat");
        }

           sc7.close();
    }
    
}
