
package prjprogdas2;

import java.util.Scanner;

public class clsTugas {
    
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        
        System.out.println("Masukkan Angka 1 : ");
        int angka1 = inputan.nextInt() ;
        
        System.out.println("Masukkan Angka 2 :");
        int angka2 = inputan.nextInt();
        
          if (angka1 > angka2 ) {
            System.out.println("Anga ke 1 lebih besar dari angka ke 2");
        } 
        
    }
    
}
