
package asistensi;

public class asistensi1 {
    public static void main(String[] args) {
        task1("Alice Rebecca/17-03-1984/London/F/O/WNA/Married");
        task2("Wanda");
        task3();
        task4("VI+X");
        task5("5,8,9,11,10");
    }
    
     public static String task1(String data){
        // Your code here
        // Alice Rebecca/17-03-1984/London/F/O/WNA/Married
        
        // Alice Rebecca
        
        int startPosition = 0;
        //find the first slash position within string stored in variable named data
        int slashPosition = data.indexOf("/");
        //chop the string from the beginning to the first slash position (/ is excluded)
        String name = data.substring(startPosition, slashPosition);
        //split and reverse the name to correct firstname and lastname order
        String firstName=name.substring(name.indexOf(" ")+1, slashPosition);
        String lastName=name.substring(startPosition, name.indexOf(" "));
        //get the first character of first and last name
        String initial = ""+ firstName.charAt(0) + lastName.charAt(0);
        
        //17-03-1984
        
        //chop the string stored in variable named data from the first slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the date of birth dd-mm-yyyy
        String birthDate = data.substring(startPosition, slashPosition);
        //chop the year of birth yyyy
        String birthYear = birthDate.substring(6,10);
        //count the age 
        int age = 2024 - (Integer.parseInt(birthYear));
        
        //London/
        
        //chop the string stored in variable named data from the second slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the palce of birth
        String birthPlace = data.substring(startPosition,slashPosition);
        
        //F
        
        //chop the string stored in variable named data from the third slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the sex data M or F
        String sex = data.substring(startPosition,slashPosition);
        //change M to Male and F to Female
        sex = sex.replace("F","Female");
        sex = sex.replace("M", "Male");
        
        //O
        
        //chop the string stored in variable named data from the fourth slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the blood type data
        String bloodType = data.substring(startPosition,slashPosition);
        
        //WNA
        
        //chop the string stored in variable named data from the fifth slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the citizenship data
        String citizen = data.substring(startPosition,slashPosition);
        //check whether local citizen
        boolean isLocalCitizenB = citizen.equals("WNI");
        //change true or false to Yes or No
        String isLocalCitizen =""+isLocalCitizenB;
        isLocalCitizen = isLocalCitizen.replace("true","Yes");
        isLocalCitizen = isLocalCitizen.replace("false","No");
        
        //Married
        
        //chop the string stored in variable named data from the sixth slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //chop the marital status data
        String maritalStatus = data;
        
        //generating the outputZ
        String line1 = "Full Name: " + firstName + " "+lastName+ " (" + initial + ")";
        String line2 = "Age: " + age;
        String line3 = "City of Birth: " + birthPlace;
        String line4 = "Sex: " + sex;
        String line5 = "Blood Type: " + bloodType;
        String line6 = "Local Citizen: " + isLocalCitizen;
        String line7 = "Marital Status: " + maritalStatus;
        
        //store the output to variable named output
        String output = line1 + "\n" + line2 + "\n" + line3+ "\n" + line4 + "\n" + line5 + "\n" + line6 + "\n" + line7;
        
        //print out the output
        System.out.println(output);
  
        return output; 
     }
    public static String task2(String name){
        // Your code here
        // Wanda
        
        //store all alphabet to single string
        //each alphabet with its index: a -> 0, b->1. ... z ->25
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        //change the input to lowercase, since tha alphabets are all in lowercase
        name = name.toLowerCase();
        
        //set the key
        
        int key = 5;
        
        //shift each character to 5 places right, if more than 25 then it back to 0
        String k1 = ""+alphabet.charAt((alphabet.indexOf(name.charAt(0)) + key)%26);
        String k2 = ""+alphabet.charAt((alphabet.indexOf(name.charAt(1)) + key)%26);
        String k3 = ""+alphabet.charAt((alphabet.indexOf(name.charAt(2)) + key)%26);
        String k4 = ""+alphabet.charAt((alphabet.indexOf(name.charAt(3)) + key)%26);
        String k5 = ""+alphabet.charAt((alphabet.indexOf(name.charAt(4)) + key)%26);
        
        //change the first character to upper case
        k1 = k1.toUpperCase();
        
        //generate the output
        String output = k1 + k2 + k3 + k4 + k5;
        
        //print out the output
        System.out.println(output);
        
        //return the output
        return output;
    }
    public static void task3(){
        
        //declare and initialize the variables
        
        int priceOfCoffee = 15000;
        int priceOfTea = 10000;
        int priceOfPizza = 45000;
        String currency = "$";
        int numOfCoffee = 3;
        int numOfTea = 5;
        int numOfPizza = 1; 
        String nameOfCustomer = "Albert";
        
        double discountOfCoffee = 0.90;
        double discountOfTea = 0.85;
        double discountOfPizza = 0.95;
        double tax = 1.11;
        double cashInHand = 200000.0;
        
        // count number of items
        int numOfItems = numOfCoffee + numOfTea + numOfPizza;

        // count the total price
        double totalPrice = (priceOfTea * numOfTea * discountOfTea) + (priceOfCoffee * numOfCoffee * discountOfCoffee) + (priceOfPizza * numOfPizza * discountOfPizza);
        // count the total price after tax
        double totalPriceAfterTax = totalPrice * tax;
        // print total price
        System.out.println("Total Price: $ " + totalPrice);
        
        // count the change 
        double change = cashInHand - totalPriceAfterTax;
        //printing the change
        System.out.println("Change: $ " + change);

        // count amount of donation
        double donation = change %1000;
        System.out.println("Donation: $ " + donation);

         
        // print the receipt
        System.out.println("-----------------------------------\n");
        System.out.println("Name Of Customer: "+ nameOfCustomer);
        System.out.println("ORDERS");
        System.out.println("Number of items: " + numOfItems);
        System.out.println("Tea \t|\t" + numOfTea + "\t|\t"  + priceOfTea * numOfTea *discountOfTea);
        System.out.println("Coffe\t|\t" + numOfCoffee + "\t|\t"  + priceOfCoffee * numOfCoffee * discountOfCoffee);
        System.out.println("Pizza\t|\t" + numOfPizza + "\t|\t"  + priceOfPizza * numOfPizza * discountOfPizza);
        System.out.println("Total Before Tax: "+ currency + totalPrice);
        System.out.println("Tax: 11.0%");
        System.out.println("Total After Tax "+ currency + totalPriceAfterTax);
        System.out.println("Amount Paid: "+ currency +cashInHand);
        System.out.println("Change: " + currency+ change);
        System.out.println("Donation Amount: " + currency +donation);
        System.out.println("\n-----------------------------------\n");
        
    } 
    public static void task4(String input){
        // Your code goes here
        // XVI
        
        String a = input.substring(0,input.indexOf("+"));
        a = a.replace("X", "10");
        a = a.replace("IX", "9");
        a = a.replace("VIII", "8");
        a = a.replace("VII", "7");
        a = a.replace("VI", "6"); 
        a = a.replace("V", "5");
        
        String b = input.substring(input.indexOf("+")+1);
        b = b.replace("X", "10");
        b = b.replace("IX", "9");
        b = b.replace("VIII", "8");
        b = b.replace("VII", "7");
        b = b.replace("VI", "6"); 
        b = b.replace("V", "5");
        
        int angkaa = Integer.parseInt(a);
        int angkab = Integer.parseInt(b);
        
        int jumlah = angkaa + angkab;
        
        String total = String.valueOf(jumlah);
        total = total.replace("20", "XX");
        total = total.replace("19", "XIX");
        total = total.replace("18", "XVIII");
        total = total.replace("17", "XVII");
        total = total.replace("16", "XVI"); 
        total = total.replace("15", "XV");
                                
        String output="" +total;
        System.out.println(output);
    }
    
    public static void task5(String row){
        // Your code goes here
        // 5,8,9,11,10
        
        int startPosition=0;
        int commaPosition=row.indexOf(",");
        
        
        String digit1 = row.substring(0,commaPosition);
        System.out.println(digit1);
        
        row = row.substring(commaPosition+1);
        commaPosition = row.indexOf(",");
        String digit2 = row.substring(startPosition,commaPosition);
        System.out.println(digit2);
        
        row = row.substring(commaPosition+1);
        commaPosition = row.indexOf(",");
        String digit3 = row.substring(startPosition,commaPosition);
        System.out.println(digit3);
        
        row = row.substring(commaPosition+1);
        commaPosition = row.indexOf(",");
        String digit4 = row.substring(startPosition,commaPosition);
        System.out.println(digit4);
        
        row = row.substring(commaPosition+1);
        commaPosition = row.indexOf(",");
        String digit5 = row;
        System.out.println(digit5);
        
        int angka1 = Integer.parseInt(digit1);
        int angka2 = Integer.parseInt(digit2);
        int angka3 = Integer.parseInt(digit3);
        int angka4 = Integer.parseInt(digit4);
        int angka5 = Integer.parseInt(digit5);
        
        double hasil = (angka1 + angka2 + angka3 + angka4 + angka5)/5.0;
        
        System.out.println(hasil);
    }
   
    
    
    
}
    