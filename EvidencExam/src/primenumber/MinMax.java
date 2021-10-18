package primenumber;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i =0; i<arr.length; i++){
            System.out.println("Insert Number " + (i+1));
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(min>arr[i]) 
                min = arr[i];
        }
        
        System.out.println("Loewest number is " + min);
        
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(max<arr[i]) 
                max = arr[i];
        }
                System.out.println("Highest number is " + max);

                
    }
}
