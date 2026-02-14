package basicPrograms;

public class reverseRecusion {
    public static void main(String[] args) {
        int n = 1234;
        int reverseNum = reverse(n, 0);
        System.out.println(reverseNum);
    }

    public static int reverse(int n, int reverse) {
        if (n == 0) {
            return reverse;
        }
        return reverse(n / 10, reverse * 10 + n % 10);
    }
}
