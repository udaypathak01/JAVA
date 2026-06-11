package OOPS.temp.interfaces;

public class car implements Engine, Brake {
    @Override
    public void brake() {
        System.out.println("i can do brake");
    }

    @Override
    public void start() {
        System.out.println("i can do start");

    }

    @Override
    public void stop() {
        System.out.println("i can do stop");

    }

    @Override
    public void acc() {
        System.out.println("i can do accelarate");

    }
}
