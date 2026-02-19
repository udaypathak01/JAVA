package sorting;

import java.util.ArrayList;

public class UnionOf2SortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7, 7, 7, 7};
        union(a, b);

    }

    public static ArrayList<Integer> union(int[] a, int[] b) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                arr.add(k, a[i]);
                i++;
                j++;
                k++;
            } else if (a[i] < b[j]) {
                arr.add(k, a[i]);
                i++;
                k++;
            } else {
                arr.add(k, b[j]);
                j++;
                k++;
            }
        }

        // Remaining elements of a
        while (i < a.length) {
            if (arr.get(arr.size() - 1) != a[i]) {
                arr.add(a[i]);
            }
            i++;
        }

        // Remaining elements of b
        while (j < b.length) {
            if (arr.get(arr.size() - 1) != b[j]) {
                arr.add(b[j]);
            }
            j++;
        }


        for (int l = 0; l < arr.size(); l++) {
            System.out.print(arr.get(l) + " ");
        }
        return arr;
    }

}
