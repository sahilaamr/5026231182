
package prjprogdas2;

public class Pajak {
     private static final double[] BRACKETS = {50000000, 250000000, 500000000, 1000000000}; // Salary brackets
    private static final double[] TAX_RATES = {0.05, 0.15, 0.25, 0.30, 0.35}; // Corresponding tax rates

    public static double getTaxRate(double gaji) {
        for (int i = 0; i < BRACKETS.length; i++) {
            if (gaji <= BRACKETS[i]) {
                return TAX_RATES[i];
            }
        }
        return TAX_RATES[TAX_RATES.length - 1]; // Default rate for salaries above the highest bracket
    }}