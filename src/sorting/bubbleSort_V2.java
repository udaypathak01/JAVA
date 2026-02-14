package sorting;
//better version than v1
public class bubbleSort_V2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 4, 1, 8};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            //for check array is sorted or not
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = false;
                    break;
                }
            }
            //if array is sorted than break than outer loop
            if (isSorted) break;
            // else sort the array

            //for sort the array
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
