import java.util.*;
public class p5 {
public static int doSomething(int n) {
    if (n >= 50) {
        return 0;
    }
    int a = 10 + n;
    System.out.println(a);
    return doSomething(a);
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        doSomething(n);

    }
}
