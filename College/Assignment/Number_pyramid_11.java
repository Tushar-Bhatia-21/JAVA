import java.util.Scanner;
public class Number_pyramid_11 {
static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) {
    int rows, k = 0;
    System.out.println("Enter the number of rows: ");
    rows=sc.nextInt();

    for (int i = 1; i <= rows; ++i, k = 0) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print(i+" ");
        ++k;
      }

      System.out.println();
    }
  }
}
