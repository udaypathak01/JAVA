package arrays;
//sum of elements of an array

import java.util.Scanner;

public class file1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int n = arr.length;
        System.out.print("Enter 5 elements of an array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        System.out.print("this is your array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println("\nthis is your elements's sum: " + sum);
    }
}
