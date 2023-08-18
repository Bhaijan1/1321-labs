//import java.util.Arrays;
import java.util.*;
public class Lab14B {
    public static class Main {
        public static void main(String args[]) {
            int[][] myArray = new int[3][4];
            Scanner sc = new Scanner(System.in);

            for (int row = 0; row < myArray.length; row++) {
                for (int col = 0; col < myArray[0].length; col++) {
                    System.out.println("Enter a value: ");
                    myArray[row][col] = sc.nextInt();
                }
            }
            System.out.println("The entered matrix: ");
            for (int i = 0; i < myArray.length; i++) {
                System.out.println(Arrays.toString(myArray[i]));
            }


            //System.out.println(Arrays.deepToString(myArray));

            int[] res = findMax(myArray);
            System.out.println("First largest value is located at row " + res[0] + " and column " + res[1]);
        }
        public static int[] findMax(int[][] A) {
            int[] arr = new int[2];
            int max = A[0][0];
            for (int row = 0; row < A.length; row++) {
                for (int col = 0; col < A[0].length; col++) {
                    if (A[row][col] > max) {
                        max = A[row][col];
                        arr[0] = row;
                        arr[1] = col;
                    }
                }
            }
            return arr;
        }
    }


}
