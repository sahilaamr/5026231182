package prjprogdas2;

public class clsRekursi {

    public static void main(String[] args) {
        task1(4);
        //Factorial menggunakan Looping
        int i, fact = 1;

        int number = 5;//It is the number to calculate factorial    
        for (i = 1; i <= number; i++) { //dicari dari 1 ke n, kecil ke besar
            fact = fact * i; //akumulasi factorial
        }

        System.out.println("Factorial of " + number + " is: " + fact);
        //rekursi

        number = 4;//It is the number to calculate factorial    
        fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }

    static int factorial(int n) {
        if (n == 0) { //stop point
            return 1;
        } else {
            return (n * factorial(n - 1)); //rekursi dan ada return ke pemanggil
        }
    }

    static void task1(int counter) {
        System.out.println("Ini Task 1");
        counter = counter - 1; //counter--;
        if (counter == 0) { //counter <> 0 //stop point
            //stop recoursion
        } else {
            task1(counter);
        }
    }
}
