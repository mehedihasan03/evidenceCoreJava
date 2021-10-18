
import java.util.Scanner;

public class sumOfInt {

    public static void main(String[] args) {
        int sum = getSum();
        System.out.println("Summation of inserted number is: " + sum);
    }

    private static int getSum() {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int addition = 0;
        while (num != -1) {
            addition += num;
            System.out.println("Press -1 to exit.");
            System.out.println("Enter a positive number for summation: ");

            num = sc.nextInt();
        }

        return addition;
    }
}
