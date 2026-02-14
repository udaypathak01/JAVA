package sorting;

//sorting in decending order
public class reverseBubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 34, 5, 54, 2, 1, 6, 7, 2, 2};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
            if (count == 0) break;
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
