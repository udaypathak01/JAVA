package OOPS.temp;

public class Student {

    String name;
    int age;
    Boolean married;
    String course;
    static int population = 0;//static variable

    static void print(){
        System.out.println("hello");
    }

    Student(String name, int age, Boolean married, String course) {
        this.name = name;
        this.age = age;
        this.married = married;
        this.course = course;
        Student.population += 1;
        print();
        System.out.println(this.name + " " + this.age + " " + this.married + " " + this.course + " " + Student.population);
    }
}