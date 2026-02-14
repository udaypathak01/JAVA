package TwoDimentionalArray;

import java.util.ArrayList;

public class pascal_triangle2 {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            array.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) array.get(i).add(1);
                else {
                    array.get(i).add(j, array.get(i - 1).get(j) + array.get(i - 1).get(j - 1));
                }
            }
        }
        System.out.print(array.get(2).toString());

    }
}
