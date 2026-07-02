package Stack;

import java.util.Stack;

public class removeConsevutiveSequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 4, 5, 5, 6, 7, 8};
        Stack<Integer> s = new Stack<>();

        for(int i = 0;i < arr.length;i++) {
            if (s.isEmpty()) {
                s.push(arr[i]);
            } else if (arr[i] == s.peek()) {
                if (arr[i] != arr[i + 1]) {
                    s.pop();
                }
            } else {
                s.push(arr[i]);
            }
        }
        System.out.println(s);
    }
}
