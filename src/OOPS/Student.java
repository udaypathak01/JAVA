package OOPS;

public class animal {
    public static class cat {
        void print() {
            System.out.println("meow meow");
        }
    }

    public static class dog {
        void print() {
            System.out.println("bhao bhao");
        }
    }

    public static class lion {
        void print() {
            System.out.println("ghrrr ghrrr");
        }
    }

    public static void main(String[] args) {
        cat c = new cat();
        dog d = new dog();
        lion l = new lion();

        c.print();
        d.print();
        l.print();
    }
}
