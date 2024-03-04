package Pertemuan4.pert4;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, faktorial;

        System.out.print("Masukan nilai n: ");
        n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Nilai n tidak boleh kurang dari 0 ");
        }

        if (n == 0) {
            faktorial = 1;
        } else {
            faktorial = 1;
        }

        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }

        System.out.println(n + "! = " + faktorial);

        scanner.close();
    }
}
