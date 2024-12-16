package string_reverser;

import java.util.Scanner;

public class Reverser {
  public static void main(String[] args) {
        // Take input from the user
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");

            String s = reader.nextLine();
            // Object Initialised
            StringBuilder res = new StringBuilder();

            // Appending elements of s in res
            res.append(s);

            // reverse StringBuilder res
            res.reverse();

            // print reversed String
            System.out.println("Your input reversed: " + res);
            reader.close();
    }
}
