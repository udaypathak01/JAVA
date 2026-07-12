package HashMap;

import java.util.HashMap;

public class CountPairs {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5};
        System.out.println(findPairs(arr, 2));
    }

    public static int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        int count = 0;
        for (int val : map.keySet()) {
            int check1 = val - k;
            int check2 = val + k;
            if (map.containsKey(check1)) count += map.get(val) * map.get(check1);
            if (map.containsKey(check2)) count += map.get(val) * map.get(check2);
        }
        return count/2;
    }
}
