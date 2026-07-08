package Stack;


import java.util.Stack;

public class infix2 {
    public static void main(String[] args) {
        String[] arr = {"100", "+", "2", "*", "24", "/", "3", "^", "2", "^", "2"};

        String s = String.join("", arr); //(100+2*24/3^2^2)

        Stack<Integer> values = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            // Read complete number
            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + s.charAt(i) - '0';
                    i++;
                }
                values.push(num);
                i--;
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    work(operators, values);
                }
                operators.pop();
            } else {
                while (!operators.isEmpty()
                        && operators.peek() != '('
                        && (priority(operators.peek()) > priority(ch)
                        || priority(ch) == priority(operators.peek()) && ch != '^')) {
                    work(operators, values);
                }
                operators.push(ch);
            }
        }
        while (!operators.isEmpty()) {
            work(operators, values);

        }
        System.out.println(values.peek());
    }

    public static int priority(char ch) {
        if (ch == '+' || ch == '-') return 1;
        else if (ch == '*' || ch == '/') return 2;
        else if (ch == '^') return 3;
        return -1;
    }

    public static void work(Stack<Character> op, Stack<Integer> st) {
        int v2 = st.pop();
        int v1 = st.pop();
        if (op.peek() == '+') st.push(v1 + v2);
        if (op.peek() == '-') st.push(v1 - v2);
        if (op.peek() == '*') st.push(v1 * v2);
        if (op.peek() == '/') st.push(v1 / v2);
        if (op.peek() == '^') st.push((int) Math.pow(v1, v2));
        op.pop();
    }

}
