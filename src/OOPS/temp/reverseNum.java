package OOPS.temp;

public class reverseNum {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(reverse(n, 0));
    }

    public static int reverse(int number, int result) {
        if (number == 0) return result;
        return reverse(number/10,result*10+number%10);

    }
}
