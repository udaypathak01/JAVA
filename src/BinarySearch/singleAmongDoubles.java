package BinarySearch;

public class singleAmongDoubles {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
        System.out.println(search(arr));
    }

    public static int search(int arr[]) {
        // your code here
        int n = arr.length;
        if (n == 1) return arr[0];
        if (arr[0] != arr[1]) return arr[0];//for first element
        if (arr[n - 1] != arr[n - 2]) return arr[n - 1];//for last element

        int left = 0, right = n - 1;
        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (arr[mid - 1] != arr[mid] && arr[mid + 1] != arr[mid]) return arr[mid];

            int first = mid, second = mid;
            if (arr[mid - 1] == arr[mid]) first = mid - 1;
            else second = mid + 1;

            int leftCount = first - left;
            int rightCount = right - second;
            if (leftCount % 2 == 0) left = second + 1;
            else right = first - 1;
        }
        return 0;
    }
}
