package Praktikum06;

import java.util.Scanner;

public class LatihanFlowchartTokoBuku7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String jenisBuku, hari;
        int jumlahBuku;
        double diskon = 0;

        //Input hari
        System.out.println("Hari apa ini : ");
        hari = sc.nextLine();
        
        System.out.println("Masukkan jenis (kamus/novel/lainnya) : ");
        jenisBuku = sc.nextLine();

        System.out.println("Masukkan jumlah buku : ");
        jumlahBuku = sc.nextInt();

        sc.close();


        //diskon hari rabu
        if (hari.equalsIgnoreCase("rabu")) {

            // menghitung diskon buku yang dibeli
    
            //dikson kamus
            if (jenisBuku.equalsIgnoreCase("kamus")){
                diskon = 0.1;
                    if (jumlahBuku > 2) {
                        diskon += 0.02;
            }
            //diskon novel
            }else if (jenisBuku.equalsIgnoreCase("novel")) {
                diskon = 0.07;
            if (jumlahBuku > 3) {
                diskon += 0.02;
            }if (jumlahBuku <= 3) {
                diskon += 0.01;
            }
            
            }else {
            if (jumlahBuku >= 3) {
                diskon += 0.05;
            }
            }

        // output hasil perhitungan

        //agar jumblah persen yang ditampilkan tidak aneh
        double diskonPersen = Math.round(diskon * 100 * 100.0) / 100.0;

        System.out.println("Total diskon : " + diskonPersen + " %");

        }
        
        // selain hari rabu
        else {
         System.out.println("Bukan hari rabu tidak ada diskon");
        }

        
    }
    

    }

