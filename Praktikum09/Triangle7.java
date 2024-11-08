package Praktikum08;

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
        sc.close();
    }
                        
    
}
