/*
Class: CSE 1321L
Section: J02
Term: Spring 2021
Instructor: ...
Name: Ismail Ahmed
Lab#: Lab5C
*/
import java.util.*;
public class Lab5C {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int x,y;
        System.out.print("Enter your X value ");
        x= sc.nextInt();
        System.out.print("Enter you Y value ");
        y= sc.nextInt();
        if (x==0 && y==0){
            System.out.print("This point is on the origin ");
        }
        else if (x > 0 && y>0){
            System.out.print("This point is in the first quadrant ");
        }
        else if (x<0 && y>0){
            System.out.print("This point is in the second quadrant ");

        }
        else if (x<0 && y<0){
            System.out.print("This point is in the thrid quadrant ");
        }
        else if (x>0 && y<0){
            System.out.print("This point is in the fourth quadrant ");
        }
        else if(x!=0 &&y==0){
            System.out.print("This point is on the X axis ");
        }
        else if(y!=0 && x==0){
            System.out.print("This point is on the Y axis ");
        }
    }
}
