package Praktikum09;

import java.util.Scanner;

public class Triangle7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nilai N = ");
        int N = sc.nextInt();
        int i = 0;
        while(i <= N) {
            int J = 0;
            while (J < i) { 
                System.out.print("* ");
                J++;
            }
            System.out.println();
            i++;
        }

        for (int j = 1; j <= N; j++) {
            for (int j2 = 1; j2 <= N; j2++) {
                if (j == 1 || j == N || j2 == 1 || j2 == N){
                    System.out.println(N);
                }
                else {
                    System.out.print(" ");
                }
            }
        }

        sc.close();
    }
                        
    
}
