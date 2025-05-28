
package prjprogdas2;


public class clsKasir {
    public static void main(String[] args) {
        //deklarasi variabel
        double barang1 , barang2 , total , diskon , pajak , bayar ;
        int no ;
        String namaBarang1 , namaBarang2 ;
        
        //inisiasi variabel
        namaBarang1 = "Roti" ;
        namaBarang2 = "Kue" ;
        barang1 = 1200.0 ;
        barang2 = 2000.0 ;
        //perhitungan
        total = barang1 + barang2 ;
        diskon = 0.05 * total ;
        pajak = 0.1 * (total - diskon) ;
        bayar = total - diskon + pajak ;
        //cetak
        System.out.println("     ALFAINDOMART");
        System.out.println("No     Nama     Harga");
        no = 1 ;
        System.out.println(no +"      "+ namaBarang1 + "      "+ barang1);
        no++ ; //no = no + 1
        System.out.println(no +"      "+ namaBarang2 + "      "+ barang2);
        System.out.println("Total     : " + total);
        System.out.println("Diskon 5% : " + diskon);
        System.out.println("Pajak 10% : " + pajak);
        System.out.println("Total     : " + bayar);
    } 
}
