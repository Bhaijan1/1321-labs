/*
Class: CSE 1321L
Section: J02
Term: Spring 2021
Instructor: ...
Name: Ismail Ahmed
Lab#: Lab3B
*/
import java.util.*;
public class Lab3B {


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        float course1, courseGrade1, course2, course3, course4,courseGrade2, courseGrade3,courseGrade4;

        // float course2;
        // float courseGrade2;
        // float course3;
        // float courseGrade3;
        // float course4;
        // float courseGrade4;



        System.out.println("Course 1 Hours: ");
        course1= input.nextFloat();
        System.out.println("Grade for course 1");
        courseGrade1= input.nextFloat();

        System.out.println("Course 2 Hours: ");
        course2= input.nextFloat();
        System.out.println("Grade for course 2");
        courseGrade2= input.nextFloat();

        System.out.println("Course 3 Hours: ");
        course3= input.nextFloat();
        System.out.println("Grade for course 3");
        courseGrade3= input.nextFloat();

        System.out.println("Course 4 Hours: ");
        course4= input.nextFloat();
        System.out.println("Grade for course 4");
        courseGrade4= input.nextFloat();
        float totalHours= course1+course2+course3+course4;
        System.out.println("The total number of Hours: "+totalHours);
        float qualityP=((course1*courseGrade1)+(course2*courseGrade2)+(course3*courseGrade3)+(course4*courseGrade4));
        System.out.println("The total Number of Quality Points is: "+ qualityP);
        float gpa= (qualityP /totalHours);
        System.out.println("Your GPA is "+ gpa);





    }
}
