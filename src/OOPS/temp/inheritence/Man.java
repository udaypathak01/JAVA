package OOPS.temp.inheritence;

public class Man extends Human {
    //multi level inheritance
    String nameOfMan;
    String ageOfMan;

    public Man() {
        //default constructor
        super();
        this.nameOfMan = "null";
        this.ageOfMan = "null";

    }

    public Man(String nameOfMan, String ageOfMan) {
        //parameterized contructor
        this.nameOfMan = nameOfMan;
        this.ageOfMan = ageOfMan;
    }

    public Man(String name, String DOB, String nameOfMan, String ageOfMan) {
        super(name, DOB);//call parent(Human)class contructor
        this.nameOfMan = nameOfMan;
        this.ageOfMan = ageOfMan;
    }

    public Man(String gender, int age, String name, String DOB, String nameOfMan, String ageOfMan) {
        super(gender, age, name, DOB);
        this.nameOfMan = nameOfMan;
        this.ageOfMan = ageOfMan;
    }
}
