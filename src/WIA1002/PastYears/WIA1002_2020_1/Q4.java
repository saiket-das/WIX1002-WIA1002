package WIA1002.PastYears.WIA1002_2020_1;

import java.util.LinkedList;

public class Q4 {
    public static void main(String[] args) {

    }
}

class Entry<K, V> {
    K key;
    V val;

    Entry(K key, V val) {
        this.key = key;
        this.val = val;
    }
}

class HashMap<K, V> {

    private final int INITIAL_CAPACITY = 16;
    private LinkedList<Entry<K, V>>[] buckets;

    @SuppressWarnings("unchecked")
    public HashMap() {
        buckets = new LinkedList[INITIAL_CAPACITY];
    }

    private int hash(K key) {
        return (key == null) ? 0 : Math.abs(key.hashCode() % buckets.length);
    }

}
