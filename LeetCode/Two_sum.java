package LeetCode;

public class Two_sum {
  public static void main(String[] args) {
    int[] numbers = {2, 7, 11, 15};
    int target = 9;
    int[] result = twoSum(numbers, target);
    System.out.println(result[0] + " " + result[1]);
  }

  public static int[] twoSum(int[] numbers, int target) {
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] + numbers[j] == target) {
          return new int[] {i, j};
        }
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}
