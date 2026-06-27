package Stack;

public class ArrayImplementation {
    private static class stack {
        int[] arr = new int[10];
        int idx = 0;

        public void push(int x) {
            if (idx == arr.length) {
                System.out.println("stack overflow");
                return;
            }
            arr[idx] = x;
            idx++;
        }


        public int pop() {
            if (idx == 0) {
                System.out.println("Stack underflow!");
                return Integer.MIN_VALUE;
            }
            int value = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return value;
        }

        public int peek() {
            if (idx == 0) {
                System.out.println("Stack underflow!");
                return Integer.MIN_VALUE;
            }
            return arr[idx - 1];
        }

        public boolean isEmpty() {
            if (arr.length == 0) return true;
            else return false;
        }

        public boolean isFull() {
            if (idx - 1 == arr.length) return true;
            else return false;
        }

        public void display(){
            for (int i = 0; i <arr.length ; i++) {
                System.out.print(arr[i]+" ");
            }
        }


    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.display();
        System.out.println();
        s.pop();
        s.push(50);
        s.display();
    }
}
