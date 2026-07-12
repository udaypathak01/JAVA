package HashMap;

import java.util.HashMap;

public class Begin {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <=10 ; i++) {
            map.put(i,i*10);
        }

        for(int key:map.keySet()){
            System.out.println(map.get(key)+" ");
        }
    }
}
