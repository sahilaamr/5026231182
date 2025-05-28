package prjprogdas2;

public class clsArr1 {
    
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[3]);
        cars[3] = "Honda" ;
        //for (int i=0 ; i< cars.length ; i++){
        for (String car : cars) {
            System.out.println(car); //tidak perlu pakai element ke-n
        }
        int[] nilai = {3,4,8,7,9} ;
        int total = 0;
        for (int n : nilai){
            total = total + n ;
        }
         System.out.println("Jumlah Total : " + total);   
        }
    }
    
