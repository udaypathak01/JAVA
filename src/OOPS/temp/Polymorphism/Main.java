package OOPS.temp.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Squre squre = new Squre();
        Shapes circle = new Circle();
        shape.area();
        squre.area();
        circle.area();
    }
}
