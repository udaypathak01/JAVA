package Stack;

import java.util.ArrayList;
import java.util.Stack;


public class removeConsecutiveGFG {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 2, 2, 5};
        int x = 1, y = 2;
        remove_special_consecutive3(arr, x, y);

    }

    public static void remove_special_consecutive(int[] arr) {
        //brute force for consecutive sequence removal
        ArrayList<Integer> temp = new ArrayList<>();
        int n = arr.length;

        temp.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                temp.add(arr[i]);
            }
        }
        System.out.println(temp);
    }

    public static void remove_special_consecutive2(int[] arr, int x, int y) {
        //best for gfg solution
        ArrayList<Integer> temp = new ArrayList<>();

        temp.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int pre = arr[i - 1];
            if ((curr == x || curr == y) && (pre == x || pre == y) && curr == pre) {
                continue;
            }
            temp.add(curr);
        }


        System.out.println(temp);
    }

    public static void remove_special_consecutive3(int[] arr, int x, int y) {
        //using stack DS
        Stack<Integer> temp = new Stack<>();


        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int pre = arr[i - 1];
            if (temp.isEmpty()) {
                temp.push(arr[0]);
            } else if ((curr == x || curr == y) && (pre == x || pre == y) && curr == pre) {
                continue;
            }
            temp.push(curr);
        }


        System.out.println(temp);
    }
}
