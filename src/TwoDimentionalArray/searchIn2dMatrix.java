package TwoDimentionalArray;
//Search in a Row-Column Sorted
public class searchIn2dMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 10 ;
        int i = 0, j = arr[0].length - 1;
        while (i < arr.length && j >= 0) {
            if (arr[i][j] > target) {
                j--;
            } else if (arr[i][j] < target) {
                i++;
            } else {
                System.out.println("hello");
                System.out.println(i+" "+j);
                break;
            }

        }
    }
}
