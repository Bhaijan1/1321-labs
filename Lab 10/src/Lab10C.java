import java.util.*;
public class Lab10C {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter a string: ");

        String input = scan.nextLine();
        char[] values = input.toCharArray();
        for (int i = 0; i < values.length; i++) {
            char letter = values[i];

            if (letter >= 'a' && letter <= 'z') {

                if (letter > 'm') {
                    letter -= 13;
                } else {
                    letter += 13;
                }
            }else if (letter >= 'A' && letter <= 'Z') {

                if (letter > 'M') {
                    letter -= 13;

                } else {
                    letter += 13;

                }
            }
            values[i] = letter;

        }
        System.out.println(String.valueOf(values));
    }
}
