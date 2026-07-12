package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class kDiffPairsInArray {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5};
        int k = 0;
        System.out.println(findPairs(nums, k));
    }

    public static int findPairs(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
            set.add(val);
        }
        int res = 0;
        if (k == 0) {
            for (int val : set) {
                if (map.get(val) >= 2) res++;
            }
        } else {
            for (int val : set) {
                if (map.containsKey(val + k)) res++;
            }
        }
        return res;
    }
}
