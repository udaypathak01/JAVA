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
        int size = 0;

        void add(int value) {
            node newNode = new node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
            size++;
        }

        void display() {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
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
            size++;
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

        void insert(int id, int value) {
            node newNode = new node(value);
            node temp = head;

            if (id == this.size) {
                add(value);
                return;
            } else if (id == 0) {
                addAtBegin(value);
                return;
            }

            for (int i = 0; i < id - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

        int getElement(int idx) {
            if (idx >= this.size || idx < 0) {
                return -1;
            }
            node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void remove(int idx) {
            node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }

    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(40);
        list.add(30);
//        list.addAtBegin(1000);
//        list.insert(1, 2000);
//        System.out.println();
//        list.reverse();
        list.display();
        System.out.println();
        list.remove(2);
        System.out.println(list.tail.data);
        list.display();

        System.out.println("\nsize of LL: " + list.size);
        System.out.println(list.getElement(5));

    }
}
