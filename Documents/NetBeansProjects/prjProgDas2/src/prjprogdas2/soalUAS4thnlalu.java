
package prjprogdas2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class soalUAS4thnlalu {
   public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[] studentData = {"Viqi", "Shabrina", "Belva", "Celine", "Jason", "Agnes", "Arumi", "Trista", "Indriyani", "Nailah"};
        int inputSID;

        try{
        System.out.println("Enter SID: ");
        inputSID = scan.nextInt();
        
            if(inputSID >= 1 && inputSID <= 10){
            System.out.println(studentData[inputSID-1]);
            }
            else{
            System.out.println("Student unknown");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Input must be a number");
        }
   }
}   
