package TwoDimentionalArray;

public class matrixMultiplication {
    public static void main(String[] args) {
        int[][] arr = {{7, 8}, {2, 9}};
        int[][] arr2 = {{14, 5}, {5, 18}};

        int n = arr.length;
        int m = arr[0].length;//col of arr
        int p = arr2[0].length;//col of arr2

        int[][] brr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < p; k++) {
                    brr[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }


        for (int[] a : brr) {
            for (int val : a) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
