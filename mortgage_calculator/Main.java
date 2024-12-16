package mortgage_calculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner principle = new Scanner(System.in);
    System.out.print("Principle: ");
    int p = principle.nextInt();
    Scanner rate = new Scanner(System.in);
    System.out.print("Annual Interest Rate: ");
    float r = rate.nextFloat();
    Scanner time = new Scanner(System.in);
    System.out.print("Time in years: ");
    int t = time.nextInt();
    float payment = (p * ((r/100) / 12) * (float) Math.pow(1 + (r/100) / 12, 12 * t)) / ((float) Math.pow(1 + (r/100) / 12, 12 * t) - 1);
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String result = currency.format(payment);
    System.out.println("Monthly Payment: " + result);
    principle.close();
    rate.close();
    time.close();
  }
}
