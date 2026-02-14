package arrays;
//arraylist

import java.util.*;

public class file3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> brr = new ArrayList<>();

        arr.add(19);
        arr.add(10);
        arr.add(15);
        arr.add(29);
        arr.add(1);
        for (int el : arr) {
            System.out.print(el + " ");
        }
        //for setting the values
        arr.set(2, 100);
        arr.set(3, 1000);

        System.out.println();
        //for each function
        for (int el : arr) {
            System.out.print(el + " ");
        }

        //for reverse the array
        Collections.reverse(arr);

    }
}
