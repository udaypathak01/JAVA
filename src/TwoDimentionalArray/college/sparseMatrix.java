package TwoDimentionalArray.college;

public class sparseMatrix {
    public static void main(String[] args) {
        int[][] array = {
                {0, 0, 0, 5},
                {0, 1, 0, 1},
                {4, 5, 0, 5},
                {0, 0, 0, 0}
        };

        int n = array.length;
        int m = array[0].length;
        int count = 0;
        int num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] == 0) count++;
                else num++;
            }

        }

        System.out.println(num);
        System.out.println(count);
    }


}
