package LinkedList;

public class kthNodeFromLast {
    public static class node {
        int data;
        node next;

        node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    public static node kthNode(node head, int k) {
        node slow = head;
        node fast = head;
        for (int i = 1; i <= k-1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
slow.next=slow.next.next;
        return slow;
    }

    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(70);
        node c = new node(60);
        node d = new node(20);
        node e = new node(30);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(kthNode(a,4).data);
    }
}
