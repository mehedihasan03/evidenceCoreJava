import java.util.Scanner;

public class PrimeCheck {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int numb = sc.nextInt();
        
        if (isPrime(numb)){
            System.out.println("Prime Number");
        } else System.out.println("Not Prime");
    }    
    
    
    private static boolean isPrime(int n){
        if(n<2)
            return false;
        
        for(int i = 2; i<n; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
