package prjprogdas2;

import java.util.Scanner;

public class soalUASthnlalu {
//    public static void main(String[] args) {
//        Scanner abc = new Scanner (System.in);
//        System.out.print("Masukkan nilai uang: ");
//        int nilaiUang = abc.nextInt();
//        
//        int[] uangKertas = {100000, 50000, 20000, 10000, 5000, 2000, 1000};
//        int[] jumlah = hitungJumlah(nilaiUang, uangKertas);
//        
//        for(int i=0; i<uangKertas.length; i++) {
//            if (jumlah[i] > 0) {
//                System.out.println("");}
//        }
//    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan nilai uang: ");
        int nilaiUang = scan.nextInt();

        int[] uangKertas = {100000, 50000, 20000, 10000, 5000, 2000, 1000};
        int[] jumlahUangKertas = menghitungJumlahUangKertas(nilaiUang, uangKertas);

        for (int i = 0; i < uangKertas.length; i++) {
            if (jumlahUangKertas[i] > 0) {
                System.out.println("Sebanyak "+jumlahUangKertas[i]+" lembar uang kertas Rp"+uangKertas[i]);
            }
        }
    }

    private static int[] menghitungJumlahUangKertas(int nilaiUang, int[] uangKertas) {
        int[] jumlahUangKertas = new int[uangKertas.length];
        for (int i = 0; i < uangKertas.length; i++) {
            if (nilaiUang >= uangKertas[i]) {
                jumlahUangKertas[i] = nilaiUang / uangKertas[i];
                nilaiUang %= uangKertas[i];
            }
        }
    }
}
