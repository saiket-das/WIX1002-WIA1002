package WIA1002.Tutorials.Tutorial_2_Generic;

public class Q1 {
    static class Container<T> {
        private T variable;

        // No-arg constructor
        Container() {
            this.variable = null;
        }

        void setVariable(T param) {
            this.variable = param;
        }

        T retrieve() {
            return variable;
        }
    }

    public static void main(String[] args) {
        // String
        Container<String> strContainer = new Container<>();
        strContainer.setVariable("Java");
        System.err.println(strContainer.retrieve());

        // Integer
        Container<Integer> intContainer = new Container<>();
        intContainer.setVariable(50);
        System.err.println(intContainer.retrieve());
    }
}
