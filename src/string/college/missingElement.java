package string.college;

public class missingElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};

        System.out.println("sum method: " + missingByMul(arr));
        System.out.print("xor method: " + missing(arr));
    }


    public static int missing(int[] arr) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            x ^= arr[i];
        }
        for (int i = 1; i <= arr.length + 1; i++) {
            x ^= i;
        }
        return x;
    }

    public static int missingByMul(int[] arr) {
        int n = arr.length + 1;
        int sum1 = (n * (n + 1)) / 2;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }
        return (sum1 - sum2);
    }
}
