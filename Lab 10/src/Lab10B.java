import java.util.*;
public class Lab10B {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a sentence with 'dang' in it: ");
        String phrase = input.nextLine();
        badWord(phrase);
        //System.out.println(sentence);

    }
    public static void badWord(String word){
        char [] arrs= word.toCharArray();
        int count=0;
        for (int i=0; i< arrs.length;i++){
            if( arrs[i]=='d'&& arrs[i+1]=='a'&& arrs[i+2]=='n'&& arrs[i+3]=='g')
            {
             System.out.println("Found bad word at: "+i);

            }





        }
        String res=word.replace("dang","&^#@");
        System.out.println(res);
    }

    }

