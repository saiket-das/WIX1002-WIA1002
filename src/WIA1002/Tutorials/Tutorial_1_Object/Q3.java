package WIA1002.Tutorials.Tutorial_1_Object;

// AB

public class Q3 {
    public static void main(String[] args) {
        Object[] o = { new A(), new B() };
        System.out.print(o[0]);
        System.out.print(o[1]);

    }

    static class A extends B {
        public String toString() {
            return "A";
        }
    }

    static class B {
        public String toString() {
            return "B";
        }
    }
}
