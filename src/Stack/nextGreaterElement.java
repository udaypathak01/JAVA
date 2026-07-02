package Stack;

import java.util.*;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] num1 = {4, 1, 2};
        int[] num2 = {1, 3, 4, 2};
        int[] result = nextGreaterElement(num1, num2);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    public static int[] nextGreaterElement(int[] nums1, int[] arr) {
        // code here
        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        s.push(arr[n - 1]);
        map.put(arr[n - 1], -1);

        for (int i = n - 2; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                map.put(arr[i], -1);
            } else {
                map.put(arr[i], s.peek());
            }
            s.push(arr[i]);
        }
        int[] temp = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            temp[i] = map.get(nums1[i]);
        }
        return temp;
    }
}
