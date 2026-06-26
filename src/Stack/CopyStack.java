package Stack;

import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Original stack values: " + s);
        System.out.println("Copied stack values: " + copyTo(s));
    }

    public static Stack<Integer> copyTo(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        while (s.size() > 0) {
            temp.push(s.pop());
        }

        System.out.println("Reversed stack values: " + temp);
        Stack<Integer> copy = new Stack<>();
        while (temp.size() > 0) {
            copy.push(temp.pop());
        }
        return copy;
    }
}
