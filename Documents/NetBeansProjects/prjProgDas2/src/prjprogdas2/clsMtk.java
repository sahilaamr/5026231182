
package prjprogdas2;


public class clsMtk {
    public static void main(String[] args) {
        int bil1,bil2,hasil1 ; 
        double bil3,bil4,hasil2 ;
        
        bil1 = 10 ;
        bil2 = 5 ;
        hasil1 = 0 ;
        hasil1 = bil1 + bil2 ;
        System.out.println("Hasil Operasi : " + bil1 + "+" + bil2 + "=" + hasil1);
        bil2 = 25 ;
        bil1 = bil2 ;
        hasil1 = bil1 + bil2 ;
        hasil1 = bil1 = bil2 = 30 ;
        System.out.println("Hasil Operasi : " + bil1 + "+" + bil2 + "=" + hasil1);
        
        hasil1 = bil1 * bil2 ;
        System.out.println("Hasil Operasi : " + bil1 + "x" + bil2 + "=" + hasil1);
        
        bil3 = 30.0 ;
        bil4 = 4.0 ;
        hasil2 = bil3 / bil4 ;
        System.out.println("Hasil Operasi : " + bil3 + "/" + bil4 + "=" + hasil2);
    }
}
