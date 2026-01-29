package arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8};
        int n = arr.length;
        int x = 0;
        for (int i = 1; i <= n+1; i++) {
            x ^= i;
        }for (int i = 0; i < n; i++) {
            x ^= arr[i];
        }
        System.out.println(x);
    }
}
