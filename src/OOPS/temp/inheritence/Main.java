package OOPS.temp.inheritence;

public class Main {
    public static void main(String[] args) {
        species human = new species("male", 100);
        System.out.println(human.gender + " " + human.age);
        Human uday = new Human("male", 20, "uday", "20/01/2005");
        System.out.println(uday.name + " " + uday.DOB + " " + uday.gender + " " + uday.age);
        Man udaypathak = new Man("Homosepian", "1000bc", "uday pathak", "20");
    }
}
