package BinarySearch;

public class floorInSortedArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 11;
        System.out.println(findFloor(arr, x));
    }

    public static int findFloor(int[] arr, int x) {
        // code here
        int left = 0, right = arr.length - 1;
        int idx = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= x) {
                idx = mid;
                left = mid + 1;
            } else if (arr[mid] > x) {
                right = mid - 1;
            }

        }
        return idx;
    }
}
