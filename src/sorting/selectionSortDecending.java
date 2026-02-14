package sorting;

public class selectionSortDecending {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8, 4, 3, 2, 5, 7, 9};
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int max = Integer.MIN_VALUE;
            int idx = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
