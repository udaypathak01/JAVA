package OOPS.temp.inheritence;

public class Human extends species {
    //it is single inheritence
    String name;
    String DOB;

    public Human() {
        this.name = "null";
        this.DOB = "null";
    }
    public Human(String name, String DOB) {
        this.name = name;
        this.DOB = DOB;
    }

    public Human(String gender, int age, String name, String DOB) {
        super(gender, age);
        this.name = name;
        this.DOB = DOB;
    }
}
