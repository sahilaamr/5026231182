package prjprogdas2;

public class clsArr2 {

    public static void main(String[] args) {
        int[][] tabel = {{5, 7, 8}, {7, 4, 3, 9}};
        for (int[] perbaris : tabel) { //row yg di loop
            for (int perkolom : perbaris) {
                System.out.print(perkolom + " ");
            }
            System.out.println("");
        }
        //versi 2
        for (int baris = 0; baris < tabel.length; ++baris) {
            for (int kolom = 0; kolom < tabel[baris].length; ++kolom) {
            System.out.print(tabel[baris][kolom] +" ");
        }
            System.out.println("");
    }
  }
}
