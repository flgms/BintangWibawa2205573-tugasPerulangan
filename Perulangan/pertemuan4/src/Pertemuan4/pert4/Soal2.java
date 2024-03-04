package Pertemuan4.pert4;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int batasAwal, batasAkhir, jumlahGanjil;

        System.out.print("Masukan batas awal: ");
        batasAwal = scanner.nextInt();

        System.out.print("Masukan batas akhir: ");
        batasAkhir = scanner.nextInt();

        jumlahGanjil = 0;
        for (int i = batasAwal ; i <= batasAkhir ; i++) {
            if (i % 2 != 0) {
                jumlahGanjil++;
            }
        }
        System.out.println("Jumlah bilangan ganjil: " + jumlahGanjil);
        scanner.close();
    }
}
