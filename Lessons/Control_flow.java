package Lessons;

public class Control_flow {
  public static void main(String[] args) {
    // For loop
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
    // If-else if-else statement
    int z = 5;
    if (z > 5) {
      System.out.println("z is greater than 5");
    } else if (z < 5) {
      System.out.println("z is less than 5");
    } else if (z == 5) {
      System.out.println("z is equal to 5");
    } else {
      System.out.println("z is not a number");
    }
    
    // Boolean tricks
    int income = 120_000;
    boolean hasHighIncome = income > 100_000;
    System.out.println(hasHighIncome);
    
    // Ternary operator
    int income2 = 120_000;
    String className = income2 > 100_000 ? "First" : "Economy";
    System.out.println(className);

    // Switch statement
    String role = "admin";
    switch (role) {
      case "admin":
        System.out.println("You're an admin");
        break;
      case "moderator":
        System.out.println("You're a moderator");
        break;
      default:
        System.out.println("You're a guest");

    }
  }
}
