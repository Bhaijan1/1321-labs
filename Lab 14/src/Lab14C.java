import java.util.*;
public class Lab14C {
    public static class Main {
        public static void main(String args[]) {
            int[][] a1 = new int[3][3];
            int[][] a2 = new int[3][3];

            Scanner sc = new Scanner(System.in);

            for (int row = 0; row < a1.length; row++) {
                for (int col = 0; col < a1[0].length; col++) {
                    System.out.println("Enter a value for matrix A: ");
                    a1[row][col] = sc.nextInt();
                }
            }
//            Scanner sc = new Scanner(System.in);
            for (int row = 0; row < a2.length; row++) {
                for (int col = 0; col < a2[0].length; col++) {
                    System.out.println("Enter a value for Matrix B: ");
                    a2[row][col] = sc.nextInt();
                }
            }
            //print the arrays
            System.out.println(" Matrix A: ");
            for (int i = 0; i < a1.length; i++) {
                System.out.println(Arrays.toString(a1[i]));
            }
            System.out.println(" Matrix B: ");
            for (int i = 0; i < a2.length; i++) {
                System.out.println(Arrays.toString(a2[i]));
            }
            int res[][] = addArrays(a1,a2);
            System.out.println("A + B:");
            for (int row = 0; row < res.length; row++) {
                for (int col = 0; col < res[0].length; col++) {
                    System.out.print(res[row][col] + " ");
                }
                System.out.println();
            }
        }
        public static int[][] addArrays(int[][] A, int[][] B){
            int[][] sum = new int[3][3];
            for (int row = 0; row < A.length; row++) {
                for (int col = 0; col < A[0].length; col++) {
                    sum[row][col] = A[row][col] +B[row][col];
                }
            }
            return sum;
        }
    }
}
