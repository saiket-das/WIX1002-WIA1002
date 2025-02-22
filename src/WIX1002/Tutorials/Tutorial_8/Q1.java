package WIX1002.Tutorials.Tutorial_8;

class Student {
    public String contact_no;

    // public Student(String contact_no) {
    // this.contact_no = contact_no;
    // }

    public String getter() {
        return this.contact_no;
    }

    public void setter(String number) {
        contact_no = number;
    }

    public void printStudent() {
        System.out.printf("Contact number: %s", this.contact_no);
    }
}

public class Q1 {

    public static void main(String[] args) {

        Student student = new Student();
        student.setter("0123456789");
        String studentContactNumber = student.getter();

        System.out.println(studentContactNumber);
    }
}

/*
 * a. Define a class Student.
 * b. Declare the instance variable that used to store contact number.
 * c. Create the constructor that initializes the contact number to null.
 * d. Create another constructor that assign the parameter value to the contact
 * number.
 * e. Create an accessor and mutator method for the contact number.
 * f. Create a method that used to display the contact number.
 * g. Create an object of the class Student.
 * h. Change the contact number using the mutator method.
 * i. Create an object of the class Animal.
 * j. Create an object of the class Animal that used to represent a cat.
 * k. Create an object of the class Number with the value 20 and 40.
 */
