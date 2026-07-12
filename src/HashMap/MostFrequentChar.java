package HashMap;

import java.util.HashMap;

public class MostFrequentChar {
    public static void main(String[] args) {
        String s = "udaypathak";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                int freq = map.get(ch);
                map.put(ch, freq + 1);
            } else {
                map.put(ch, 1);
            }
        }
        int max = 0;
        char tkey=' ';
        for (char key : map.keySet()) {
            int value = map.get(key);
            if (value > max) {
                max = value;
                tkey=key;
            }
        }
        System.out.println(tkey);
    }
}
