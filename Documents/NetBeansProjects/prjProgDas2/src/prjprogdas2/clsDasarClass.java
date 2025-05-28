
package prjprogdas2;

import java.util.ArrayList;

public class clsDasarClass {
    public static void main(String[] args) {
        clsmyInteger integerku = new clsmyInteger(5,7);
        integerku.printIsi();
        ArrayList<clsmyInteger> arrayku = new ArrayList<clsmyInteger>();
        arrayku.add(new clsmyInteger());
        arrayku.add(new clsmyInteger(10,12));
        System.out.println(arrayku);
    }
}
