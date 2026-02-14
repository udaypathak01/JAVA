package sorting;

public class isArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9};
        boolean p = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                p = false; break;
            }

        }

        if (p) {
            System.out.print("your arrray is sorted. ");
        } else {
            System.out.print("your arrray is not sorted. ");

        }
    }
}
