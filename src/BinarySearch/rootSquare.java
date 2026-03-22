package BinarySearch;

public class rootSquare {
    public static void main(String[] args) {
        System.out.println(floorSqrt(10));
    }

    public static int floorSqrt(int n) {
        int left = 0, right = n - 1;
        if (n == 0) return 0;
        else if (n == 1) return 1;
        while (left <= right) {
            int mid = left+(right-left)/2;
            if (mid * mid == n) return mid;
            else if (mid * mid > n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return right;

    }
}
