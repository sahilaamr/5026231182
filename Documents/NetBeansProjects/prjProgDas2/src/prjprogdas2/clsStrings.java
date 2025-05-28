package prjprogdas2;
import java.util.Scanner ;
public class clsStrings {

    public static void main(String[] args) {
        String myStr ;
        Scanner inputan = new Scanner(System.in) ;
        System.out.print("Masukkan kata yg mau diolah : ");
        
        myStr = inputan.nextLine() ;
        char result;
        result = myStr.charAt(0);

        System.out.println(result);
        System.out.println("" + myStr.charAt(0) + myStr.charAt(4));

        String myStr1 = "Hello";
        String myStr2 = "Hello";
        String myStr3 = "Another String";
        System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
        System.out.println(myStr1.equals(myStr3)); // false
        System.out.println(myStr3.equals(myStr3));
        
        myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));
        
        System.out.println("Banyaknya karakter di String : " + myStr.length());
        
        myStr = myStr.replace('r', 'l') ; 
        System.out.println(myStr);
        
        myStr = myStr.toLowerCase() ;
        System.out.println(myStr);
        
        myStr = myStr.substring(13,18);
        System.out.println(myStr);
        
        String[] hasilperkata ;
        hasilperkata = myStr.split(" ") ;
        System.out.println(hasilperkata[0]);
    }

}
