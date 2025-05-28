package prjprogdas2;

import java.util.Scanner;

public class clsLoop2 {

    public static void main(String[] args) {
        //5 x 4, dengan hanya menggunakan operator +
        int hasil = 0;
        int counter;
        Scanner inputan = new Scanner(System.in);
        int bil1, bil2;
//        hasil = hasil + 5;
//        hasil = hasil + 5;
//        hasil = hasil + 5;
//        hasil = hasil + 5;
        System.out.println("Masukkan bilangan yg akan dikali");
        bil1 = inputan.nextInt();
        System.out.println("Dikalikan berapa ? : ");
        bil2 = inputan.nextInt();

        for (counter = 1; counter <= bil2 ; counter++) //exit jika n
        {
            hasil = hasil + bil1;
            //jangan disimpulkan bahwa looping hanya 1 baris
        }
        System.out.println(hasil);
    }
}
