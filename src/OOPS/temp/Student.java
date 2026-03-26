package OOPS;

public class Student {
    static class McaStudent {

        String name;
        int age;
        String section;

        //this is a default constructor for preventing the automatically initializing the varibles by java
        McaStudent() {
            this("default name", "default section");
            //use to invoke the parameterized constructor to set default values
        }



        McaStudent(String name, String section) {
            this.name = name;
            this.section = section;
            System.out.println(this.name + " studing in mca department in " + this.section + " section.");
        }

        McaStudent(String name, int age, String section) {
            this.name = name;
            this.age = age;
            this.section = section;
            System.out.println(this.name + " studing in mca department in " + this.age + "is my age" + " " + this.section + " section.");
        }

    }

    public static void main(String[] args) {
        McaStudent uday = new McaStudent("uday pathak", "A3");
        McaStudent shivam = new McaStudent("shivam sharma", 22, "A3");
        McaStudent random = new McaStudent();

        McaStudent temp =shivam;
        System.out.println(temp.name+ temp.section);
    }

}
