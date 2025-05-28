
package prjprogdas2;

import java.util.Scanner ;

public class clsMenu {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int pilihan = 0 ;  
        while (pilihan!=4) {
            System.out.println("MENU APLIKASI");
            System.out.println("1. GoFood");
            System.out.println("2. GoRide");
            System.out.println("3. GoMart");
            System.out.println("4. Keluar Aplikasi ");
            System.out.println("Masukkan pilihan Anda");
            pilihan = inputan.nextInt() ; //hidden counter
            switch (pilihan) {
                case 1:
                    System.out.println("Anda telah memilih GoFood");
                    break;
                case 2:
                    System.out.println("Anda telah memilih GoRide");
                    break;
                case 3:
                    System.out.println("Anda telah memilih GoMart");
                    break;
                default :
                    System.out.println("Anda harus memilih 1-3");   
                    
            }
        }
           System.out.println("Bye byee");
    }
    
}
