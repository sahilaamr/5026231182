
package prjprogdas2;


public class clsMethod {
    public static void main(String[] args) {
        int hasil ;
        boolean benar ;
        
        showBanner() ;
        showBanner() ;
        hasil = tambah(5,8) ;
        System.out.println(hasil);
        System.out.println(tambah(8,7));
        System.out.println("Apakah hari ini ada kuliah ? " + apaBenar());
    }
    
    public static void showBanner()
    {
        System.out.println("____        _     _ _       _          _                         ");
        System.out.println("/ ___|  __ _| |__ (_) | __ _| |__      / \\   _ __ ___  _ __ _   _ ");
        System.out.println("\\___ \\ / _` | '_ \\| | |/ _` | '_ \\    / _ \\ | '_ ` _ \\| '__| | | |");
        System.out.println(" ___) | (_| | | | | | | (_| | | | |  / ___ \\| | | | | | |  | |_| |");
        System.out.println("|____/ \\__,_|_| |_|_|_|\\__,_|_| |_| /_/   \\_\\_| |_| |_|_|   \\__,_|");
        System.out.println("Hari Jum'at akan \"diberi\" hadiah");
       }
    
    public static int tambah(int bil1,int bil2)
    {
        int hasiltambah ;
        hasiltambah = bil1 + bil2 ;
        return hasiltambah ;
    }    
    
    public static boolean apaBenar()
    {
        boolean iyabenar ;
        
        iyabenar = true ;
        
        return iyabenar ; 
    }        
}
