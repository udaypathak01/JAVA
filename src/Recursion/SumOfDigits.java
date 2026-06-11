package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n=2345;
        System.out.println(sumOfDigit(n));
    }
    public static int sumOfDigit(int n){
       if(n==0)return 0;

       int digit=n%10;
       n/=10;

        return digit+sumOfDigit(n);
    }
}
