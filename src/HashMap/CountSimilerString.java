package HashMap;

import java.util.HashMap;
import java.util.TreeSet;

public class CountSimilerString {
    public static void main(String[] args) {
        String[] arr = {"aba", "aabb", "abcd", "bac", "aabc"};
        System.out.println(similarPairs(arr));
    }

    public static int similarPairs(String[] arr) {
        HashMap<TreeSet, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            TreeSet<Character> set = new TreeSet<>();
            String s = arr[i];
            for (int j = 0; j < arr[i].length(); j++) {
                set.add(s.charAt(j));
            }
            ans += map.getOrDefault(set, 0);
            map.put(set, map.getOrDefault(set, 0) + 1);
        }
        return ans;
    }
}
