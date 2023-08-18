import java.util.*;

public class Lab9A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z;
        double Average;
        System.out.println("Enter number 1:  ");
        x=input.nextInt();
        System.out.println("Enter number 2:  ");
        y=input.nextInt();
        System.out.println("Enter number 3:  ");
        z=input.nextInt();
        System.out.println("Min is "+ Min(x,y,z));
        System.out.println("Max is "+ Max(x,y,z));
        System.out.println("Average is "+ Avg(x,y,z));
        //int x, y, z;
        //int k=Max(x,y,z);
    }
    public static int Min(int x, int y, int z) {
        if ((x<=y)&& (x<=z)){
            return x;

        }
        else if ((y<=z)&&(y<=x)){
            return y;
        }
        return z;



        }
    public static int Max(int x, int y, int z) {
        if ((x>=y)&& (x>=z)){
            return x;

        }
        else if ((y>=z)&&(y>=x)){
            return y;
        }
        return z;



    }
    public static double Avg(double x, double y, double z){
//        double Average;
        double A= (x+y+z)/3;
        return A;

    }

    }


