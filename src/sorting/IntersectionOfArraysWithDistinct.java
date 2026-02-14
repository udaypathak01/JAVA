package sorting;

import java.util.Arrays;

public class IntersectionOfArraysWithDistinct {
    public static void main(String[] args) {
        int[] a = {80, 23, 55, 41};
        int[] b = {28, 14, 23, 80, 55, 41, 98, 100, 51, 40};
            Arrays.sort(a);
            Arrays.sort(b);
            int i = 0, j = 0;
            int count = 0;
            while (i < a.length && j < b.length) {
                if (a[i] == b[j]) {
                    count++;
                    i++;
                    j++;
                } else if (a[i] > b[j]) {
                    j++;
                } else {
                    i++;
                }
            }
        System.out.println(count);
    }
}
