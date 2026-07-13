package Queues;

import java.util.*;

public class PrintQusingQ {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> temp = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        int n=q.size();
       for(int i=0;i<n;i++){
            System.out.println(q.peek());
            temp.offer(q.poll());
        }

    }
}
