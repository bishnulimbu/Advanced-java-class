import java.util.Scanner;

public class pattern2 {
  public static void main(String[] args) {
    System.out.print("enter the desired number.");
    Scanner scanner = new Scanner(System.in);
    int userNum = scanner.nextInt();
    int odd = 1, even = 2;
    // will need counter for odd and even numbers manually
    for (int i = 1; i <= userNum; i++) {
      for (int j = 1; j <= i; j++) {
        if (i % 2 != 0) {
          System.out.print(odd + " ");
          odd += 2;
        } else {
          System.out.print(even + " ");
          even += 2;
        }
      }
      System.out.println();
    }
    scanner.close();
  }
}
