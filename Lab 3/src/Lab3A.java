/*
Class: CSE 1321L
Section: J02
Term: Spring 2021
Instructor: ...
Name: Ismail Ahmed
Lab#: Lab3A
*/
import java.util.*;
public class Lab3A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amountOwed;
        System.out.println("Amount owed: $"); 
        amountOwed= input.nextInt();
        float APR;
        System.out.println("APR: ");
        APR= input.nextFloat();
        float monthlyApr=APR/12;
        float minPayment= amountOwed*(monthlyApr/100);
        System.out.println("Monthly percentage rate: "+ monthlyApr);
        System.out.println("Minimum payment: "+ minPayment);

    }
}