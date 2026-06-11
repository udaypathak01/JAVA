package string.college;

import java.util.ArrayList;
import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> str = new ArrayList<>(n);
        ArrayList<Character> str2 = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String temp = sc.next();
            str.add(temp);
        }

        int M = sc.nextInt();
        int N = sc.nextInt();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                char temp = sc.next().charAt(j);
                str2.add(temp);
            }
        }
    }
}
