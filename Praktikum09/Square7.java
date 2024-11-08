package Praktikum08;

import java.util.Scanner;

public class Square7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.err.println("Masukkan nilai N = ");
        int N = sc.nextInt();

        for (int iOuter = 1; iOuter <= N; iOuter++) {
        for (int i = 1; i <= N; i++){
            System.out.print("* ");
        }
        System.out.println();
        }

        sc.close();
    }
    
}
