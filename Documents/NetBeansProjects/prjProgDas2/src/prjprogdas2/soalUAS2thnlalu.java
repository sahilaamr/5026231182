
package prjprogdas2;

public class soalUAS2thnlalu {
    public static boolean isMagicSquare(int[][] matrix){
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            if (matrix[i].length != n) {
                return false;
            }
        }
        // calculate sum of first row
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum = sum + matrix[0][j];
        }
        // sums of all rows
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum = rowSum + matrix[i][j];
            }
            if (rowSum != sum) {
                return false;
            }
        }
        // sums of all columns
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum = colSum + matrix[i][j];
            }
            if (colSum != sum) {
                return false;
            }
        }
        // sums of main diagonal
        int diaSum = 0;
        for (int i = 0; i < n; i++) {
            diaSum = diaSum + matrix[i][n - i - 1];
        }
        if (diaSum != sum) {
            return false;
        }
        // sums of anti diagonal
        int diaSum2 = 0;
        for (int i = 0; i < n; i++) {
            diaSum2 = diaSum2 + matrix[i][n - i - 1];
        }
        if (diaSum2 != sum) {
            return false;
        }
        return true;
        
    }
    public static void main(String[] args) {
        int[][] matrix1 =  {
            {16, 23, 17},
            {16, 23, 17},
            {16, 23, 17}
        };
        int[][] matrix2 =  {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };
        int[][] matrix3 =  {
            {16, 2, 3, 13},
            {5, 11, 10, 8},
            {9, 7, 6, 12},
            {4, 14, 15, 1}
        };
        int[][] matrix4 =  {
            {15, 1, 2, 12},
            {4, 10, 9, 7},
            {8, 6, 5, 11},
            {3, 13, 14, 0}
        };
        int[][] matrix5 =  {
            {15, 1, 2, 12, 1},
            {4, 10, 9, 7, 2},
            {8, 6, 5, 11, 3},
            {3, 13, 14, 0, 4},
            {3, 13, 14, 0, 5},
        };
//        System.out.println(matrix1);
        System.out.println(isMagicSquare(matrix1));
        
//        System.out.println(matrix2);
        System.out.println(isMagicSquare(matrix2));
        System.out.println(isMagicSquare(matrix3));
        System.out.println(isMagicSquare(matrix4));
        System.out.println(isMagicSquare(matrix5));
    }
}
