package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class addingOne {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(
                Arrays.asList(9, 9, 9, 9)
        );

        int carry = 1;
        for (int i = 1; i <= arr.size(); i++) {
            int x = arr.get(arr.size() - i) + carry;
            arr.set(arr.size() - i, x % 10);
            carry = x / 10;

        }
        if (carry == 1) {
            arr.add(0, 1);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

    }
}
