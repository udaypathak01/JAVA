package TwoDimentionalArray.college;

public class transposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < m; j++) {
                if (n == m) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }else arr[j][i]=arr[i][j];
            }
        }

        for (int[] a:arr){
            for (int val:a){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
