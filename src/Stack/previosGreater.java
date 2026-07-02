package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class previosGreater {
    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 90, 120, 80};
        preGreater(arr);
    }

    public static void preGreater(int[] arr) {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int n = arr.length;
        temp.add(-1);
        s.push(arr[0]);
        for (int i = 1; i < n; i++) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            temp.add((s.isEmpty()) ? -1 : s.peek());
            s.push(arr[i]);
        }
        System.out.println(temp);
    }
}
