package TwoDimentionalArray;

public class RotateBy90Deg {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = arr.length;
        int m = arr[0].length;
        int[][] brr = new int[n][m];
        int[][] brr2 = new int[m][n];

        if (n == m) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    brr[j][i] = arr[i][j];
                }
            }
            for (int i = 0; i < n; i++) {
                int l = 0, r = m - 1;
                while (l < r) {
                    int temp = brr[i][r];
                    brr[i][r] = brr[i][l];
                    brr[i][l] = temp;
                    l++;
                    r--;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    brr2[j][i] = arr[i][j];
                }
            }
            for (int i = 0; i < m; i++) {
                int l = 0, r = n - 1;
                while (l < r) {
                    int temp = brr2[i][r];
                    brr2[i][r] = brr2[i][l];
                    brr2[i][l] = temp;
                    l++;
                    r--;
                }
            }
        }


        if (n == m) {
            for (int[] a : brr) {
                for (int val : a) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        } else {
            for (int[] a : brr2) {
                for (int val : a) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }
}
