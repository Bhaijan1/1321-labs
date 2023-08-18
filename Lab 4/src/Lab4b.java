/*
Class: CSE 1321L
Section: J02
Term: Spring 2021
Instructor: ...
Name: Ismail Ahmed
Lab#: Lab4B
*/
import java.util.*;
public class Lab4b {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int Hours;
        int pay;
        System.out.println("Enter the Number of hours this week: ");
        Hours=sc.nextInt();
        if (Hours<=40){
            pay=(Hours*15);
            System.out.println("Earnings: $"+pay);

        }
        else {
            pay=(40*15)+((Hours-40)*25);
            System.out.println("Earnings: $"+pay);
        }

    }
}
