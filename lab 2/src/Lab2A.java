/*
Class: CSE 1321L
Section: J02
Term: Spring 2021
Instructor: ...
Name: Ismail Ahmed
Lab#: Lab2A
*/
import java.util.*;

public class Lab2A {
    public static  void main(String []argd){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:");
        String Name= sc.nextLine();
        //Scanner
        System.out.println("Enter another name:");
        String Name2= sc.nextLine();
        System.out.println("Enter a verb:");
        String Verb=sc.nextLine();
        System.out.println("Enter a adverb");
        String Adverb= sc.nextLine();
        System.out.println("Once upon a time, there was a person named " + Name+
                " who had a child named "+ Name2+ ". This child would "+Verb +"\t" +
                Adverb+" while singing to strangers");


    }
}
