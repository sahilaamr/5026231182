package prjprogdas2;

public class clsLoop1 {

    public static void main(String[] args) {
        System.out.println("Hallo apa kabar ?");
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
// 1 : var counter start from ; 2 : kondisi yg harus dipenuhi ; 3 : berapa berubahnya variabel counternya
int counter ;       
for (counter = 10 ; counter >= 4 ; counter = counter - 1 )
        {
            //looping part - track lari
            System.out.println(counter);
            //tanpa kita perintah / ditulis source nya, maka otomatis naik ke baris ke 13
        } //exit jika nilai counter menjadi 5
            System.out.println("Selesai");
    }
}
