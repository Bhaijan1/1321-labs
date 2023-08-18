/*
Class: CSE 1321L
Section: J02
Term: Spring 2021
Instructor: ...
Name: Ismail Ahmed
Lab#: Lab7B
*/
import java.util.*;

public class Lab7B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int GPAcount;
        //float
        System.out.println("Enter the number of GPAs: ");
        GPAcount= input.nextInt();
        float GPAarray[]= new float[GPAcount];
//        System.out.print("GPA#");
        for(int i=0; i<GPAcount; i++)
        {
            System.out.print("GPA# "+i+" ");

            GPAarray[i] = input.nextFloat();
        }
        for(int i=0; i<GPAcount; i++)
        {

            if(GPAarray[i]>=3.90){
                System.out.println("Student#"+i+" : Summa Cum Laude");
            }
            else if (GPAarray[i]>=3.70 && GPAarray[i]<=3.899999){
                System.out.println("Student#"+i+" : Magna Cum Laude");

            }
            else if (GPAarray[i]>=3.50 && GPAarray[i]<=3.699999){
                System.out.println("Student#"+i+" : Cum Laude ");

            }
            else {
                System.out.println("Not Graduating ");
            }
//            else if (GPAarray[i]>=3.30 && GPAarray[i]<=3.499999){
//                System.out.println("Student#"+i+" : Summa Cum Laude");
//
//            }
//            else if (GPAarray[i]>=3.0 && GPAarray[i]<=3.899999){
//                System.out.println("Student#"+i+" : Summa Cum Laude");
//
//            }
        }


    }
}
