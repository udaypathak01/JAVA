package sorting;

public class practice {
    public static void main(String[] args) {
        int[] arr = {7, 3, 4, 7, 8, 1};
        int[] brr = insertionSort(arr);
        for (int val : brr) {
            System.out.print(val + " ");
        }
    }

    public static int[] bubbleSort(int[] arr) {
        //bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] selectionSort(int[] arr) {
        //selection sort
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        //insertion sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j]<arr[j - 1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }else break;
            }
        }
        return arr;
    }
}
