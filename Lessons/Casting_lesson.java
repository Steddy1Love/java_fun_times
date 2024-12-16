package Lessons;

public class Casting_lesson {
    public static void main(String[] args) {
        // Casting
        // Casting is the process of converting a value from one data type to another.
        // There are two types of casting:
        // 1. Implicit casting (Widening Casting)
        // 2. Explicit casting (Narrowing Casting)

        // Implicit casting (Widening Casting)
        // Widening casting is done automatically when passing a smaller size type to a larger size type.
        // byte -> short -> char -> int -> long -> float -> double
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt); // Output: 9
        System.out.println(myDouble); // Output: 9.0

        // Explicit casting (Narrowing Casting)
        // Narrowing casting must be done manually by placing the type in parentheses in front of the value.
        // double -> float -> long -> int -> char -> short -> byte
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println(myDouble2); // Output: 9.78
        System.out.println(myInt2); // Output: 9
    }
}
