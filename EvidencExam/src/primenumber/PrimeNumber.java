package primenumber;

import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = input.nextInt();
        
        if(getPrime(num)){
            System.out.println("Prime number");
        }else System.out.println("Not Prime");
       
    }
    
    private static boolean getPrime(int n){
        if(n<2) return false;
        
        for(int i =2 ; i < n; i++){
            if(n%i==0) return false;
        }        
        return true;       
    }
    
    
    
    
}
