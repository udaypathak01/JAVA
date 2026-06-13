package LinkedList;

public class implementationOfLL {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class linkedList {
        node head = null;
        node tail = null;

        void add(int value) {
            node newNode = new node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }

        void display() {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int size() {
            int count = 0;

            node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void addAtBegin(int data) {
            node newNode = new node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        void reverse() {
            node temp = head;
            reverse2(temp);
        }

        void reverse2(node head) {
            if (head == null) return;
            reverse2(head.next);
            System.out.print(head.data + " ");
        }
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(40);
        list.add(30);
        list.addAtBegin(1000);
        list.display();
        System.out.println();
        list.reverse();
        System.out.println("\nsize of LL: " + list.size());
    }
}
