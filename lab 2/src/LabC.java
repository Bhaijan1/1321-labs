/*
Class: CSE 1321L
Section: J02
Term: Spring 2021
Instructor: ...
Name: Ismail Ahmed
Lab#: Lab2C
*/
import java.util.Scanner;

public class LabC {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a width");
        int width =sc.nextInt();
        System.out.println("Enter a height");
        int height=sc.nextInt();
int area= (height*width);
int perimeter= (2*(height+width));
System.out.println("The area is : "+ area);
        System.out.println("The perimeter is : "+ perimeter);

    }
}
