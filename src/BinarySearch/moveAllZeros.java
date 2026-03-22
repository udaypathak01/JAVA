package BinarySearch;

public class moveAllZeros {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int n = arr.length;

        moveZeroes(arr);
    }

    public static void moveZeroes(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
