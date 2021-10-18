
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a integer value ");
        int num = sc.nextInt();
        System.out.println("factorial is " + factorial(num));
    }

    private static int factorial(int n) {
        if (n < 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
