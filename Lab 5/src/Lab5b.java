/*
Class: CSE 1321L
Section: J02
Term: Spring 2021
Instructor: ...
Name: Ismail Ahmed
Lab#: Lab5B
*/
import java.util.*;
public class Lab5b {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        int day,next, until;
        System.out.print("Enter a number that represents today (Sunday==0, Monday==1,...) ");
        day=sc.nextInt();
        System.out.print("Enter the number of days until the meeting: ");
        next= sc.nextInt();
        until = (day+next)%7;
        switch (until){
            case 0 :
                System.out.print("Meeting day is Sunday ");
                break;
            case 1:
                System.out.print("Meeting day is Monday ");
                break;
            case 2:
                System.out.print("Meeting day is Tuesday ");
                break;
            case 3:
                System.out.print("Meeting day is Wednesday");

                break;
            case 4:
                System.out.print("Meeting day is Thursday");

                break;
            case 5:
                System.out.print("Meeting day is Friday");

                break;
            case 6:
                System.out.print("Meeting day is Saturday");

                break;


        }

    }
}
