package WIA1002.Labs.Lab_2;

public class Q3 {
    /*
     * a) Modify the program to become a generic class called StorePairGeneric.
     */
    static class StorePair<T> {
        private T first, second;

        public StorePair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public T getSecond() {
            return second;
        }

        public void setPair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "first = " + this.first + " second = " + this.second;
        }

        /*
         * b) Override the Object equals() method in the StorePair class to
         * compare the first values of two objects for equality.
         */
        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass())
                return false;

            @SuppressWarnings("unchecked")
            StorePair<?> other = (StorePair<T>) o;

            return first.equals(other.second);
        }
    }

    public static void main(String[] agrs) {
        // Integer Pair
        StorePair<Integer> intPair = new StorePair<>(10, 20);
        System.out.println(intPair.toString());

        // String Pair
        StorePair<String> strPair = new StorePair<>("1st", "2nd");
        System.out.println(strPair.toString());

        System.out.println(intPair.equals(intPair));
    }
}
