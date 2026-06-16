package LinkedList.DoublyLL;

public class DoublyLL {
    static class Node{
        Node pre;
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        b.pre=a;
        c.pre=b;
        d.pre=c;
        e.pre=d;

        Node temp=a;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        Node temp2=e;
        while(temp2!=null){
            System.out.print(temp2.data+" ");
            temp2=temp2.pre;
        }
    }
}
