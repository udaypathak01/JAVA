package sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 4, 1, 8};
        int n = arr.length;
        System.out.println("here you can see unsorted array: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


        System.out.println("\nhere you can see sorted array: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
