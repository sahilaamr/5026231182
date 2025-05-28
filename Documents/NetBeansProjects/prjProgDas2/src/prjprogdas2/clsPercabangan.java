package prjprogdas2;

import java.util.Scanner;

public class clsPercabangan {

    public static void main(String[] args) {
        int nilai;
        Scanner inputan = new Scanner(System.in);
        //menangkap input
        System.out.println("Masukkan nilai ujian : ");
        nilai = inputan.nextInt();
        //melakukan pengecekan nilai
        if (nilai >= 50) { //true , diatas = 50
            System.out.println("Selamat Anda Lulus");
        } else {//false , dibawah 50
            System.out.println("Selamat Mencoba Lagi");
        }
        System.out.println("Selesai");
        int day = 4;
        switch (day) {
            case 1: //syarat hanya 1
                System.out.println("Monday");
                break; //exit block
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        int absen;
        System.out.print("Masukkan jumlah absen : ");
        absen = inputan.nextInt();
        if (nilai >= 50 && absen > 13) {//true , diatas = 50 dan absen diatas 13
            System.out.println("Selamat Anda Lulus");
        } else {//false , dibawah 50 dan absen diatas 13
            System.out.println("Selamat Mencoba Lagi");
        }
    }

}
