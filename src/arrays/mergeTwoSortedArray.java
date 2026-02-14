package arrays;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 9, 10};
        int n = arr1.length, m = arr2.length;
        int[] arr3 = new int[n + m];

        int j = 0, i = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < n) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        for (int ele : arr3) {
            System.out.print(ele + " ");
        }
    }
}
