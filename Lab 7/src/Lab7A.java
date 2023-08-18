/*
Class: CSE 1321L
Section: J02
Term: Spring 2021
Instructor: ...
Name: Ismail Ahmed
Lab#: Lab7A
*/
import java.util.*;

public class Lab7A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length;
        System.out.println("Enter the size of the array: ");
        length = input.nextInt();

        int a[] = new int[length];

        for (int i = 0; i < length; i++) {
            a[i] = i * i;


        }
        for (int i = 0; i < length; i++) {
            System.out.print(a[i] + "  ");
        }
    }
}






