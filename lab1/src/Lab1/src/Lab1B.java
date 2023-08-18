/*
Class: CSE 1321L
Section: J02
Term: Spring 2021
Instructor: ...
Name: Ismail Ahmed
Lab#: Lab1B
*/
import java.util.Scanner;
public class Lab1B
{
    // Reads a character string from the user and prints it.
    public static void main (String[] args)
    {
        String message;
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter a line of text:");
        message = scan.nextLine();
        System.out.println ("You entered: \"" + message + "\"");
    }
}