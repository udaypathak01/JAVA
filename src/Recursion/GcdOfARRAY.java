package Recursion;

public class GcdOfARRAY {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 9, 10};
        System.out.println(findGCD(arr));
    }

    public static int findGCD(int[] nums) {
        int n = nums.length;
        int max = 1;
        int min = 1000;
        for (int i = 0; i < n; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        return Gcd2(min, max);
    }

    public static int Gcd2(int a, int b) {
        if (a == 0)
            return b;
        return Gcd2(b % a, a);
    }
}
