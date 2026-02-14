package TwoDimentionalArray;

public class sumOfAllElements {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 45,}, {2, 3, 5, 6}, {8, 1, 6, 6}};
        long sum=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                sum+=arr[i][j];
            }

        }
        System.out.println(sum);
    }
}
