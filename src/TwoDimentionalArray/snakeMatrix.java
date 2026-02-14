package TwoDimentionalArray;

public class snakeMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {4, 5, 6, 7}, {8, 9, 9, 8}, {7, 4, 5, 2}};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            } else {
                for (int k = arr[0].length - 1; k >= 0; k--) {
                    System.out.print(arr[i][k] + " ");

                }
                System.out.println();
            }
        }



    }
}
