package HashSet;

import java.util.HashSet;

public class Begin {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <= 10; i++) {
            set.add(i);
        }
        set.remove(10);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(3));

        for(int val:set){
            System.out.println(val);
        }
    }
}
