package sorting;

public class bubbleSort_v3 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 4, 1, 8};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            //count the swaps
            int swapCount = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                }
            }
            //if counts are not increased it mean swaps are zero so break the outer loo
            if (swapCount == 0) break;
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }


}
