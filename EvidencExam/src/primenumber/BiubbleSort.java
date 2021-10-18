package primenumber;

public class BiubbleSort {
    public static void main(String[] args) {
        int[][] arr = {
            {15,99,91,11,44},
            {10,19,59,89,11},
            {13,23,21,55,20},
            {13,84,45,66,33},
            {11,90,15,20,56}
        };
        
        for(int i =0; i < arr.length; i++){
            int[] newArr = arr[i];
            BubbleSort(newArr);
            
            arr[i] = newArr;
            for(int j = 0; j<newArr.length; j++){
                System.out.print(newArr[j] + "   ");
            }
            System.out.println(" ");
        }
    }   
        
    static void BubbleSort(int[] n){
        int i, j, temp;
        for(i = 0; i < n.length; i++){
            for(j = 0; j < n.length-i-1; j++){
                if( n[j] > n[j+1]){                
                    temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                } 
            }
        }
    }
}
