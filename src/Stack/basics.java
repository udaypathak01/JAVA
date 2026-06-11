package Stack;

import java.util.Scanner;
import java.util.Stack;

public class basics {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        Stack<Integer> sc = new Stack<>();
        for (int i = 0; i <n ; i++) {
            int value=s.nextInt();
            sc.push(value);
        }
        sc.pop();
        sc.pop();
        System.out.println(sc.peek());
    }
}
