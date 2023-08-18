import java.util.*;
public class Lab6B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min=1001;
        int max=-1001;
        int input=1 ;

        while (input !=0){
            System.out.println("Enter a number between -1000 and +1000: ");
           input=scan.nextInt();
            if (input< min){
                min=input;
            }
            if (input> max){
               max=input;
            }
            System.out.println("Max "+ max);
            System.out.println("Min "+ min);



        }
    }
}
