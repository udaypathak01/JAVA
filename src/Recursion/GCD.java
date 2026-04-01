package Recursion;

public class GCD {
    public static void main(String[] args) {
        System.out.println(Gcd2(12, 16));
    }

    //using for loop
    public static int Gcd(int a, int b) {
        int n = 0;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                n = i;
            }
        }
        return n;
    }

    //using recursion
    public static int Gcd2(int a, int b) {
        if (a==0)return b;
        return Gcd2(b%a,a);
    }
}
