import java.util.*;

public class Lab14A {
    public static class Main {
        public static void main(String[] args) {
            int[][] myArray = new int[3][4];
//write the Scanner
            Scanner sc = new Scanner(System.in);

            for (int row = 0; row < myArray.length; row++) {
                for (int col = 0; col < myArray[0].length; col++) {
                    System.out.println("Enter a value: ");
                    myArray[row][col] = sc.nextInt();
                }
            }
//write loops and print the matrix
            int[] coltot = columnTotal(myArray);
            int[] rowtot = rowTotal(myArray);
            for (int i = 0; i < coltot.length; i++) {
                System.out.println("Sum of column " + i + " is " + coltot[i]);
            }
            for (int i = 0; i < rowtot.length; i++) {
                System.out.println("Sum of row " + i + " is " + rowtot[i]);
            }
        }

        public static int[] columnTotal(int[][] A) {
            int[] colsum = new int[A[0].length];
            for (int i = 0; i < A[0].length; i++) {
                for (int j = 0; j < A.length; j++) {
                    colsum[i] += A[j][i];
                }
            }
            return colsum;
        }

        public static int[] rowTotal(int[][] A) {

//write logic for calculating sum of rows
            int[] rows = new int[A.length];
            for (int i = 0; i < A[0].length; i++) {
                for (int j = 0; j < A.length; j++) {
                    rows[j] += A[j][i];
                }
            }
            return rows;
        }


    }
}
