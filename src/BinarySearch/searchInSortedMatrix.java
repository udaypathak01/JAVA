package BinarySearch;

public class searchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 5, 9}, {14, 20, 21}, {30, 34, 43}};
        System.out.println(searchMatrix(arr, 20));
    }

    public static boolean searchMatrix(int[][] arr, int target) {
        // code here
        int rows = arr.length, cols = arr[0].length;
        int left = 0, right = rows * cols - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int rowMid = mid / cols, colMid = mid % cols;
            if (arr[rowMid][colMid] == target) return true;
            else if (arr[rowMid][colMid] > target) right = mid - 1;
            else left = mid + 1;
        }

        return false;
    }
}
