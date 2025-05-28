
package prjprogdas2;

public class TugasWhile {
    public static void main(String[] args) {
        int counter = 5 ; 
        while (counter >= 1 ){
            int starCount = 1;
        while (starCount <= counter) {    
            System.out.print("*");
            starCount++;
        }
            System.out.println();
            counter = counter - 1 ;
        }
    }
}
