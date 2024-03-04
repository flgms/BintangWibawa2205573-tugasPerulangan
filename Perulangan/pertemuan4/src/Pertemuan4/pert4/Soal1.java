package Pertemuan4.pert4;

import java.util.Scanner;


public class Soal1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n,i;

            System.out.println("Masukan nilai n: ");
            n = scanner.nextInt();

            for(i = 1; i <= n; i++){
                System.out.println(i);
            }

            System.out.println("Selesai");
            
            scanner.close();
        }


    }
}