package sorting;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 3, 4, 7, 8, 1};
        int[] brr = InsertionSort(arr);
        for (int val : brr) {
            System.out.print(val + " ");
        }
    }

    public static int[] InsertionSort(int[] arr) {
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
