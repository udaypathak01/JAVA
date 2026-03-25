package Recursion;

public class intro {
    public static void main(String[] args) {
//        prachi(0);
//        num(5);
        num1Ton(1,5);

    }

    static void prachi(int n) {
        if (n == 10) return;
        System.out.println("uday ji");
        prachi(n + 1);
    }

    static void num(int n) {
        if (n == 0) return;
        System.out.println(n);
        num(n - 1);
    }

    static void num1Ton(int x,int n){
        if(x>n)return;
        System.out.println(x);
        num1Ton(x+1,n);
    }
}
