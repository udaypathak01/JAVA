package TwoDimentionalArray;

import java.util.Scanner;

public class sumOfTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the n: ");
        int n = sc.nextInt();
        System.out.print("enter the m: ");
        int m = sc.nextInt();

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        if (n == m) {
            System.out.print("enter the matrix: ");

        } else {
            System.out.print("invalid order of matrix.");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.print("enter the second matrix: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        int[][] arr3 = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("your output is here: ");
        for (int[] a : arr3) {
            for (int val : a) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
