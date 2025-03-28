package WIA1002.Tutorials.Tutorial_1;

/*
    Print
    ------
    (1) Performs Person's tasks
    (2) Invoke Employee's overloaded constructor
    (3) Performs Employee's tasks 
    (4) Performs Faculty's tasks

    Explain (Steps)
    ---------------
    1) `Faculty` extends `Employee`, so the first thing Java does 
        when creating a Faculty object is call the `Employee` constructor

    2) `Employee` extends `Person`, so before `Employee's` constructor runs, 
        Java calls `Person's` constructor first

    3) `Person` constructor executes and prints
        "(1) Performs Person's tasks"

    4) ....

 */

public class Q2 {
    static class Person {
        public Person() {
            System.out.println("(1) Performs Person's tasks");
        }
    }

    static class Employee extends Person {
        public Employee() {
            this("(2) Invoke Employee's overloaded constructor");
            System.out.println("(3) Performs Employee's tasks ");
        }

        public Employee(String s) {
            System.out.println(s);
        }
    }

    static class Faculty extends Employee {
        public Faculty() {
            System.out.println("(4) Performs Faculty's tasks");
        }
    }

    public static void main(String[] agrs) {
        new Faculty();
    }
}
