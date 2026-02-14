package TwoDimentionalArray;

public class RowMax {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 45,}, {2, 3, 5, 6}, {8, 1, 6, 6}};

        int rowMax = 0;
        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            if (rowMax < sum) {
                rowMax = sum;
                idx = i;
            }
        }

        System.out.println(idx + " " + rowMax);
    }
}
