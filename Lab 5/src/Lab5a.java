/*
Class: CSE 1321L
Section: J02
Term: Spring 2021
Instructor: ...
Name: Ismail Ahmed
Lab#: Lab5A
*/
import java.util.*;

public class Lab5a {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        char symptoms, covid;
        System.out.print("Experiencing severe symptoms (Y/N) ");
        symptoms= sc.next().charAt(0);
        if (symptoms == 'Y'){
            System.out.print("Seek emergency care");
        }
        else {
            System.out.print("Have you been in close contact with someone who has covid 19 (Y/N)");
            covid= sc.next().charAt(0);
            if (covid=='Y'){
                System.out.print("Quarantine and get tested if you feel sick.");
            }
            else{
                System.out.print("If you experience other symptoms, isolate and get tested.");
            }
        }
    }
}
