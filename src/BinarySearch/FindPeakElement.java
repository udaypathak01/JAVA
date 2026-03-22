package BinarySearch;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 13, 5, 6};
        System.out.println(findPeakElement(arr));
    }

    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {

            int mid = (left + right) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }

        return left;
    }
}
