package TwoDimentionalArray;

public class minOfAllMax {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 45,}, {2, 3, 5, 15}, {8, 1, 6, 6}};

        int rowMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 0; j < arr[0].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
            if (rowMin > max) {
                rowMin = max;
            }
        }
        System.out.println(rowMin);
    }
}
