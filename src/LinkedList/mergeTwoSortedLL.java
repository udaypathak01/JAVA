package LinkedList;

import java.util.LinkedList;

public class mergeTwoSortedLL {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void add(int val) {
        Node newNode = new Node(val);
        Node temp = head;
        if (head == null) {
            head = newNode;
            return;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void main(String[] args) {
        mergeTwoSortedLL list1 = new mergeTwoSortedLL();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        mergeTwoSortedLL list2 = new mergeTwoSortedLL();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        System.out.println(sortedMerge(list1.head, list2.head));
    }


    public static Node sortedMerge(Node head1, Node head2) {
        // code here
        Node temp1 = head1;
        Node temp2 = head2;
        if (head1 == null && head2 == null) {
            return null;
        } else if (head1 == null) {
            return head2;
        } else if (head1 == null) {
            return head2;
        }

        while (temp1 != null && temp2 != null) {
            if (temp1.data <= temp2.data) {
                add(temp1.data);
                temp1 = temp1.next;
            } else if (temp1.data > temp2.data) {
                add(temp2.data);
                temp2 = temp2.next;
            }
        }

        while (temp1 != null) {
            add(temp1.data);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            add(temp2.data);
            temp2 = temp2.next;
        }
        return head;
    }

}
