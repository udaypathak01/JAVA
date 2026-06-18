package LinkedList;

public class EvenOddLL {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(oddEvenList(a));
    }
public static void display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
}
    public static ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode temp = head;
        ListNode temp2 = head;
        ListNode tail = head;
        int n = 1;
        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                tail.next = temp;
                temp2.next = temp2.next.next;
                temp.next = null;
                temp2 = temp2.next;
                temp = temp2.next;
                tail = tail.next;
            } else {
                temp = temp2.next;
            }

        }
        return head;
    }
}
