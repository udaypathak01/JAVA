package Queues;

public class ArrayImplementation {
    public static class queue {
        int f = -1, r = -1;
        int n = 0;
        int[] arr = new int[100];

        void offer(int val) {
            if (n == arr.length - 1) {
                System.out.println("Queue is full!");
            } else if (f == -1) {
                f = r = 0;
                arr[r] = val;

            } else {
                arr[++r] = val;
            }
            n++;
        }

        int poll() {
            if (n == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            } else {
                n--;
                return arr[f++];
            }
        }

        int peek() {
            if (n == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            } else {
                return arr[f];
            }
        }

        int size() {
            return n;
        }

        boolean isEmpty() {
            if (n == 0) return true;
            else return false;
        }

        boolean isFull() {
            if (n == arr.length - 1) {
                return true;
            } else {
                return false;
            }
        }

        void display() {
            if (n == 0) {
                System.out.println("Queue is Empty!");
                return;
            } else {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.display();
    }
}
