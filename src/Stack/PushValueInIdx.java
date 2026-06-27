package Stack;

import java.util.Stack;

public class PushValueInIdx {
    public static void main(String[] args) {
        Stack<Integer> arr = new Stack<>();
        arr.push(1);
        arr.push(2);
        arr.push(3);
        arr.push(4);
        arr.push(5);
        System.out.println(arr);

        System.out.println(push(arr, 10, 0));
    }

    public static Stack<Integer> push(Stack<Integer> s, int value, int idx) {
        Stack<Integer> temp = new Stack<>();
        int n=s.size();
        for (int i = 0; i <n-idx ; i++) {
            temp.push(s.pop());
        }
        s.push(value);
        while(temp.size()!=0){
            s.push(temp.pop());
        }
        return s;
    }

}
