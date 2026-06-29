package Stack;

public class LLImplementationOfStack {

    static class node {
        int data;
        node next = null;

        node(int val) {
            this.data = val;
        }
    }

    static class stack {
        node head = null;

        node push(int val) {
            node newNode = new node(val);
            if (head == null) {
                head = newNode;
                return head;
            }
            newNode.next = head;
            head = newNode;
            return head;
        }

        int pop() {
            head = head.next;
            return head.data;
        }

        int peek() {
            return head.data;
        }

        boolean isEmpty() {
            if (head == null) return true;
            else return false;
        }

        void display() {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(30);
        s.push(40);
        s.push(50);
        s.pop();
        s.display();
    }
}
