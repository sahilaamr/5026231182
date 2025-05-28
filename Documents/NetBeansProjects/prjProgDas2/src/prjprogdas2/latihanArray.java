
package prjprogdas2;

public class latihanArray {
    public static void main(String[] args) {
         int[] num = {1, 2, 2, 3, 3, 3, 4, 5};

        // Buat array baru untuk menyimpan angka yg tidak duplikat
        int[] numBenar = new int[num.length];

        // Inisialisasi indeks untuk array numBenar
        int j = 0;

        // Lewati array yang diurutkan
        for (int i = 0; i < num.length - 1; i++) {
            // Jika angka saat ini berbeda dari angka berikutnya, tambahkan ke array numBenar
            if (num[i] != num[i + 1]) {
                numBenar[j++] = num[i];
            }
        }

        // Tambahkan angka terakhir ke array numBenar
        numBenar[j++] = num[num.length - 1];

        // Buat array baru dengan ukuran yang benar
        int[] hasil = new int[j];

        // Salin numBenar ke array baru
        System.arraycopy(numBenar, 0, hasil, 0, j);

        // Cetak array hasil
        for (int element : hasil) {
            System.out.print(element + " ");
        }
    }
}    
