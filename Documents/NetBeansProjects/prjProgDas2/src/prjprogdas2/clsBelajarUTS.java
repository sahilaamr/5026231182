
package prjprogdas2;

public class clsBelajarUTS {
    public static void main(String[] args) {
       String [] nama_wisudawan = {"Hans Juno Panjaitan", "Yuniar Permatasari", "Arian Junio", "Dita Revia Noor Indah"};
        for (String nama_wisudawan1 : nama_wisudawan) {
            String[] nama_bagian = nama_wisudawan1.split("");
            System.out.print(nama_bagian[0]+" ");
            for (int j=1 ; j<nama_bagian.length-1 ; j++){
                System.out.print(nama_bagian[j].charAt(0)+ ".");
            }System.out.println(nama_bagian[nama_bagian.length-1]+", S.Kom");
        }
    }
}

