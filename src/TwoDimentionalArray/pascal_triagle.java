package TwoDimentionalArray;


import java.util.*;

public class pascal_triagle {
    public static void main(String[] args) {
        int n = 5;

        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();// {}

        for (int i = 0; i < n; i++) {
            arrayLists.add(new ArrayList<>());//{{}}
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) arrayLists.get(i).add(j, 1);
                else {
                    arrayLists.get(i).add(j, arrayLists.get(i - 1).get(j) + arrayLists.get(i - 1).get(j - 1));
                }
            }
        }
        for (ArrayList<Integer> a : arrayLists) {
            for (int val : a) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
