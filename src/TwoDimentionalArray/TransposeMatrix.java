package TwoDimentionalArray;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},

        };
        int n = matrix.length;
        int m = matrix[0].length;


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                if (n == m) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                } else {
                    matrix[j][i] = matrix[i][j];
                }

            }
        }

        for (int[] val : matrix) {
            for (int value : val) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
