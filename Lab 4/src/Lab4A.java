/*
Class: CSE 1321L
Section: J02
Term: Spring 2021
Instructor: ...
Name: Ismail Ahmed
Lab#: Lab4A
*/
import java.util.*;

public class Lab4A {
 public static void main(String []args){
     Scanner sc= new Scanner(System.in);
     String Day;
     System.out.println("Enter the day");
     Day= sc.nextLine();
     if (Day.equals("Monday")){
         System.out.println("Sounds like some one has the case of he Mondays");
     }
     else if (Day.equals("Wednesday ")){
         System.out.println("It's hump day! El ombligo!");
     }
     else if (Day.equals("Friday ")){
         System.out.println("Finally. It's Friday!");
     }
     else{
         System.out.println("It's another day of the week.");
     }




 }
}
