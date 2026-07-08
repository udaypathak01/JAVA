package Stack;

import java.util.Stack;

public class InfixEvalution {
    public static void work(Stack<Integer>st,Stack<Character>op){
        int v2 = st.pop();
        int v1 = st.pop();
        if (op.peek() == '+') st.push(v1 + v2);
        if (op.peek() == '-') st.push(v1 - v2);
        if (op.peek() == '*') st.push(v1 * v2);
        if (op.peek() == '/') st.push(v1 / v2);
        op.pop();
    }

    public static void main(String[] args) {
        String s = "9-(5+3)*4/6";
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int achi = (int) ch;
            if (achi >= 48 && achi <= 57) st.push(achi - 48);
            else if (op.size() == 0 || ch == '(' || op.peek() == '(') op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                   work(st,op);
                }
                op.pop();
            }
            else {
                if (ch == '+' || ch == '-') {
                    work(st,op);
                    op.push(ch);
                } else if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        work(st,op);

                    }
                    op.push(ch);
                }
            }
        }
        while (!op.isEmpty()) {
            int v2 = st.pop();
            int v1 = st.pop();
            char opt = op.pop();
            if (opt == '+') st.push(v1 + v2);
            if (opt == '-') st.push(v1 - v2);
            if (opt == '*') st.push(v1 * v2);
            if (opt == '/') st.push(v1 / v2);
        }
        System.out.println(st.peek());
    }
}
