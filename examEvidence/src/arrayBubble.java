
public class arrayBubble {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 99, 91, 11, 44},
            {0, 10, 9, 9, 11},
            {3, 23, 21, 5, 20},
            {13, 4, 45, 66, 33},
            {11, 0, 1, 20, 56}
        };

        for (int i = 0; i < arr.length; i++) {
            int[] newArr = arr[i];
            BubbleSort(newArr);

            arr[i] = newArr;
            for (int j = 0; j < newArr.length; j++) {
                System.out.print(newArr[j] + "   ");
            }
            System.out.println(" ");
        }
    }

    static void BubbleSort(int[] n) {
        int temp;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length - i - 1; j++) {
                if (n[j] > n[j + 1]) {
                    temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
    }
}
