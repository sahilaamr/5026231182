
package prjprogdas2;

public class Tugas4 {
    private final double gaji;
    private final double tarifPajak;
    private final double pajakPenghasilan;
    
public Tugas4 (double gaji) {
    this.gaji = gaji;
    this.tarifPajak = getTarifPajak();
    this.pajakPenghasilan = hitungPajakPenghasilan();
}
private double getTarifPajak() {
    if (gaji <= 5000000){
    return 0.00; 
   }else if (gaji <= 10000000){
    return 0.10;   
   }else if (gaji <= 20000000) {
    return 0.20;   
   }else{
    return 0.30;      
   }
}
private double hitungPajakPenghasilan() {
   return gaji * tarifPajak;
}
public void printHasil() {
    System.out.println("Gaji: Rp" + String.format("%.2f", gaji));
    System.out.println("Tarif Pajak:" + (tarifPajak * 100) + "%");
    System.out.println("Pajak Penghasilan: Rp" + String.format("%.2f", pajakPenghasilan));
}
public static void main(String[] args) {
    System.out.println("Masukkan gaji Anda (Rp):");   
    double gajiUser = Double.parseDouble(System.console().readLine());
    Tugas4 pajakProgresif = new Tugas4(gajiUser);
    pajakProgresif.printHasil();
    }
}
