package Recursion;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 8, 18, 34, 56, 76};
        System.out.println("value: " + binarySearch(arr, 4, 0, arr.length - 1));


    }

    static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) return -1;

        int m = left + (right - left) / 2;

        if (arr[m] == target) return m;
        if (arr[m] < target) {
            return binarySearch(arr, target, m + 1, right);
        }
        return binarySearch(arr, target, left, m - 1);
    }
}
