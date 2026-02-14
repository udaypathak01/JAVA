package sorting;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 2, 3, 8, 9, 5, 6, 3};
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int minValue = Integer.MAX_VALUE;
            int idx = -1;

            for (int j = i; j < n; j++) {
                if (minValue > arr[j]) {
                    minValue = arr[j];
                    idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }


        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
