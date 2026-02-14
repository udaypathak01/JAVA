package TwoDimentionalArray;

public class colWisePrinting {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 45},
                {2, 3, 5, 15},
                {8, 1, 6, 6}
        };

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }


    }
}
