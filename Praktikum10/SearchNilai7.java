package Praktikum10;

import java.util.Scanner;

public class SearchNilai7 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
  
    System.out.println("Masukkan berapa angka yang ingin diinput:");
    int jumlahAngka = sc.nextInt();
    int[] arrNilai = new int[jumlahAngka];
        
    for (int i = 0; i < arrNilai.length; i++) {
        System.out.println("Masukkan nilai yang ingin diinput untuk indeks ke-" + i + ":");
        arrNilai[i] = sc.nextInt();
        }

    System.out.println("Nilai yang telah dimasukkan:");
    for (int i = 0; i < arrNilai.length; i++) {
        System.out.println("Indeks ke-" + i + ": " + arrNilai[i]);
        }
        
    System.out.println("Masukkan nilai yang ingin dicari:");
    int key = sc.nextInt();
    int hasil = -1;

    for (int i = 0; i < arrNilai.length; i++) {
        if (arrNilai[i] == key) {
            hasil = i;
            break;
        }
    }
        
    if (hasil == -1) {
        System.out.println("Nilai " + key + " tidak ditemukan dalam array.");
        } else {
        System.out.println("Nilai " + key + " ditemukan di indeks ke-" + hasil);
        }
        
        sc.close();
    }
}
        
