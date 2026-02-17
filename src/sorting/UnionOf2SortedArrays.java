package sorting;

import java.util.ArrayList;

public class UnionOf2SortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};
        union(a,b);

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
        while (i != a.length) {
            arr.add(k, a[i]);
            i++;
            k++;
        }
        while (j != b.length) {
            arr.add(k, b[j]);
            j++;
            k++;
        }
        for (int l = 0; l < arr.size(); l++) {
            System.out.print(arr.get(l) + " ");
        }
        return arr;
    }

}
