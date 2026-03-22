package BinarySearch;

public class searchInSortedRotatedArr {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        System.out.println(Search(arr, 10));
    }

    private static int Search(int array[], int k) {
        // code here
        int n = array.length;

        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == k) return mid;
            else if (array[mid] >= array[left]) {
                if (array[mid] > k && k >= array[left]) {
                    right = mid - 1;
                } else left = mid + 1;
            } else {
                if (array[mid] <= k && k <= array[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }


        }

        return -1;
    }
}
