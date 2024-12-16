package Lessons;
import java.text.NumberFormat;

public class Format_number {
  public static void main(String[] args) {
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String result = currency.format(1234567.891);
    System.out.println(result); // Output: $1,234,567.89  
    NumberFormat percent = NumberFormat.getPercentInstance();
    String result2 = percent.format(0.1);
    System.out.println(result2); // Output: 10%
    
  }
}
