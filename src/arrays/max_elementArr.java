package arrays;

import java.util.*;

public class max_elementArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    largest = arr[j];
                }
            }
        }
        System.out.print("largest element in your given array is: "+largest);
    }
}
