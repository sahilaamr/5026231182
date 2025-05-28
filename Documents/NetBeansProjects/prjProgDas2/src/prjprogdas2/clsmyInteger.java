
package prjprogdas2;

public class clsmyInteger {
    
    public int bil1 ;
    public int bil2 ;
    
    clsmyInteger(int a,int b) //konstruktor
    {
        bil1 = a ;
        bil2 = b ;
        System.out.println("Konnstruktor telah dipanggil");
    }
    clsmyInteger() //konstruktor
    {
        bil1 = 0 ;
        bil2 = 0 ;
        System.out.println("Konnstruktor default dipanggil");
    }
    
    public void printIsi()
    {
        System.out.println("Bil 1 :" + bil1 + " dan Bil 2 :" + bil2);
    }
    
    public int tambah(){
        int hasil = bil1 + bil2 ;
        return hasil ;
    }
}
