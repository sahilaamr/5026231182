package prjprogdas2;

public class clsLoop3 {
    public static void main(String[] args) {
        int counter = 5;
        for (int a = counter; a >0 ; a--){
            for (int b = 0 ; b < a ; b++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}