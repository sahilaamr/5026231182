package prjprogdas2;

import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis sekolah: ");
        String jenisSekolah = input.nextLine();
        
        String singkatan = konversiSingkatan(jenisSekolah);

        System.out.println("Singkatan dari " + jenisSekolah + " adalah: " + singkatan);
    }

    public static String konversiSingkatan(String jenisSekolah) {

        if (jenisSekolah.equalsIgnoreCase("Sekolah Menengah Pertama")) {
            return "SMP";
        } else {
            return "Tidak dikenali";
        }
}
}
