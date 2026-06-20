package LinkedList;

public class reverseLinkedList {
    static class node {
        int data;
        node next;

        node(int val) {
            this.data = val;
        }
    }

    static void display(node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        display(head.next);
    }

    static node reverse(node head) {
        if (head.next == null) return head;
        node newHead = reverse(head.next);
        //first node and second node interchanging
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(reverse(a));
    }
}
