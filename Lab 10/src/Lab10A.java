import java.util.*;
public class Lab10A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String phrase = input.nextLine();
        int noofvowles= vowlString(phrase);
        System.out.println(noofvowles);

    }

    public static int vowlString(String line)
    {
        char [] chars= line.toCharArray();
        int count=0;
        for (int i=0; i< chars.length;i++){
            if( chars[i]=='a'|| chars[i]=='e'||chars[i]=='i'||chars[i]=='o'||chars[i]=='u'){
                chars[i]='*';
                count ++;
            }
            System.out.print(chars[i]);
        }
        System.out.println();
        return count;



    }

}
