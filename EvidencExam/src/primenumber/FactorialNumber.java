package primenumber;

import java.util.Scanner;


public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = input.nextInt();
        int fac = 1;
        
        for(int i = 1; i<=num; i++){
            fac *= i;
        }
        System.out.println(num + " factorial is: " +fac);
    }
}
