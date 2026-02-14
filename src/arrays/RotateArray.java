//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
package arrays;

//left rotate
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;
        int n = arr.length - 1;
//        write logic from here
        reverse(arr, 0, n);
        reverse(arr, 0, n - d);
        reverse(arr, n - d + 1, n);

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void reverse(int[] arr, int i, int n) {
        while (i < n) {
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            i++;
            n--;
        }
    }
}
