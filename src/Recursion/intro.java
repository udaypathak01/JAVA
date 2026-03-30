package Recursion;

import java.util.Scanner;

public class intro {
    static int x;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        print(x);
    }

    public static void print(int n) {
        if (n > 10) return;
        System.out.println(n);
        print(n + 1);
        System.out.println(n);
    }
}

