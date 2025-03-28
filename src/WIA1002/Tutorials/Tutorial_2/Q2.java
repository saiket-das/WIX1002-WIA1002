package WIA1002.Tutorials.Tutorial_2;

public class Q2 {
    static class MyArray<T> {
        private T[] list;

        MyArray(T[] list) {
            this.list = list;
        }

        void listAll() {
            System.out.println(list[0].getClass().getSimpleName() + " Array");
            for (T ele : list) {
                System.out.print(ele + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Integer[] intList = { 10, 20, 30 };
        String[] strList = { "Java", "C++", "Python" };
        Character[] chrList = { 'A', 'B', 'C' };

        MyArray<Integer> intArray = new MyArray<>(intList);
        MyArray<String> strArray = new MyArray<>(strList);
        MyArray<Character> chrArray = new MyArray<>(chrList);

        intArray.listAll();
        strArray.listAll();
        chrArray.listAll();
    }
}
