package WIA1002.Labs.Lab_1;

/*
    Create a generic class called MyGeneric that accepts one parameter.
    Declare a variable called e for the type parameter. Create a no-arg
    constructor. Create a constructor that accepts one generic parameter.
    Create a setter and getter method for the generic type.
 */

class MyGeneric<T> {
    private T variable;

    void setVariable(T variable) {
        this.variable = variable;
    }

    public T getVariable() {
        return this.variable;
    }
}

public class Q1 {

    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<String>();
        MyGeneric<Integer> intObj = new MyGeneric<Integer>();

        strObj.setVariable("This is a variable");
        System.out.println(strObj.getVariable());

        intObj.setVariable(15);
        System.out.println(intObj.getVariable());
    }
}
