/*
Class: CSE 1321L
Section: J02
Term: Spring 2021
Instructor: ...
Name: Ismail Ahmed
Lab#: Lab3C
*/
import java.util.*;
public class Lab3C {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int quarters;
            int dimes;
            int nickels;
            int pennies;
            System.out.println("Enter the number of quarters: ");
            quarters= input.nextInt();
            System.out.println("Enter the number of dimes: ");
            dimes= input.nextInt();
            System.out.println("Enter the number of nickels: ");
            nickels= input.nextInt();
            System.out.println("Enter the number of pennies: ");
            pennies= input.nextInt();

            System.out.println("You entered "+ quarters+" quarters");
            System.out.println("You entered "+ dimes+" dimes");
            System.out.println("You entered "+ nickels+" nickles");
            System.out.println("You entered "+ pennies +" pennies");

            int totalcents= ((quarters*25)+(dimes*10)+(nickels*5)+(pennies*1));
            int dollars=totalcents/100;
            int cents=totalcents%100;

            System.out.println("Your total is "+ dollars+ " dollars and "+ cents);



        }
    }

