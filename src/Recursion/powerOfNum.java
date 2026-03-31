package Recursion;

public class powerOfNum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(reverseExponentiation(n));
    }

    public static int pow(int a, int n) {
        if (n == 0) return 1;
        int call = pow(a, n / 2);
        if (n % 2 == 0) return call * call;
        else return a * call * call;
    }

    public static int reverse(int num, int res) {
        if (num == 0) return res;
        return reverse(num / 10, res * 10 + num % 10);
    }

    public static int reverseExponentiation(int n) {
        // code here
        int m = reverse(n, 0);
        return pow(n, m);

    }
}
