package arrays;

import java.util.Scanner;

public class secondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 5, 10};
        int largest = arr[0];
        int secLargest=-1;
        for (int i = 0; i < arr.length; i++) {
            if (largest <= arr[i]) {
                largest = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (secLargest <= arr[i] && arr[i] != largest) {
                secLargest = arr[i];
            }

        }

        System.out.println(largest);
        System.out.println(secLargest);
    }
}
