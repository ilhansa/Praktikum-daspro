package Praktikum06;

import java.util.Scanner;

public class LatihanFlowchart1b7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int bilangan1, bilangan2, bilangan3, max;
        System.out.println("Masukkan bilangan 1: ");
        bilangan1= sc.nextInt();

        System.out.println("Masukkan bilangan 2");
        bilangan2 = sc.nextInt();

        System.out.println("Masukkan bilangan 3");
        bilangan3 = sc.nextInt();

    sc.close();

    if (bilangan1 > bilangan2) {
        max = bilangan1;
    }if (bilangan2 > bilangan3) {
        max = bilangan2;
    } 
    else 
    max = bilangan3;

    System.out.println("Nilai terbesar adalah : " + max);
    }
    
}
