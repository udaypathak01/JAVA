package BinarySearch;

import java.util.ArrayList;

public class firstAndLastPosition {
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 8, 8, 9, 10};
        System.out.println(firstOccu(arr, 8));
    }

    public static ArrayList<Integer> firstOccu(int[] arr, int target) {
        int n = arr.length;
        int left = 0, right = n - 1;
        ArrayList<Integer> occ = new ArrayList<>();
        int idx = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                idx = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        occ.add(idx);
        left = 0;
        right = n - 1;
        idx = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                idx = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        occ.add(idx);

        return occ;
    }
}
