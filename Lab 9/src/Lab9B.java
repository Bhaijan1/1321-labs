//import java.lang.invoke.SwitchPoint;
import java.util.*;
public class Lab9B {
     public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         int userinput;
//         System.out.println("What would you like to do?\n1) Enter a number\n" +
//                 "2) Print the array\n" +
//                 "3) Find the sum of the array\n" +
//                 "4) Reset the array\n" +
//                 "5) Quit");
         //userinput=input.nextInt();
         int userChoice=0;
         int arr[]= new int[10];
         initArray(arr);
         do {
             PrintMenu();
             userChoice = input.nextInt();
             switch (userChoice) {
                 case 1:
                     enterNum(arr);
                     break;
                 case 2:
                     printArray(arr);
                     break;
                 case 3:
                     printSum(arr);
                     break;
                 case 4:
                     initArray(arr);
                     break;
             }
         }
             while (userChoice!=5);



    }
    static void PrintMenu(){
        System.out.println("What would you like to do?\n1) Enter a number\n" +
                "2) Print the array\n" +
                "3) Find the sum of the array\n" +
                "4) Reset the array\n" +
                "5) Quit");
    }
    static void initArray (int[ ] arr){
        int initizlze =0;
       for( int i=0; i<10; i++){
           arr[i]=initizlze;
       }


    }
    static void printArray (int[ ] arr){
//        int print=0;
//        for( int i=0; i<10; i++){
//            print[]arr;
//        }
        //System.out.print(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void printSum (int[ ] arr){
         int sum=0;
         for( int i=0; i<10; i++){
             sum+=arr[i];
         }
         System.out.println(sum);

    }
    static void enterNum(int[ ] arr){
        Scanner input= new Scanner(System.in);
         int slot;
         int newValue;

         System.out.println("Enter the slot: ");
         slot=input.nextInt();
        System.out.println("Enter the new value: ");
        newValue=input.nextInt();
         arr[slot]=newValue;

    }

}
