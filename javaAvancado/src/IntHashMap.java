public class IntHashMap {

    private static class Entry {
        int key;
        int value;
        Entry next;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int CAPACITY = 10;
    private Entry[] table = new Entry[CAPACITY];

    private int hash(int key) {
        // example using a prime factor
        int h = key * 11;
        return Math.abs(h) % CAPACITY;
    }

    // put – O(1) average, O(n) worst (many collisions)
    public void put(int key, int value) {
        int index = hash(key);
        Entry current = table[index];

        // if key already exists, update
        while (current != null) {
            if (current.key == key) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        // insert at head of list
        Entry entry = new Entry(key, value);
        entry.next = table[index];
        table[index] = entry;
    }

    // get – O(1) average, O(n) worst
    public Integer get(int key) {
        int index = hash(key);
        Entry current = table[index];
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return null; // not found
    }

    // delete – O(1) average, O(n) worst
    public void delete(int key) {
        int index = hash(key);
        Entry current = table[index];
        Entry prev = null;

        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    // clear – O(CAPACITY + totalElements)
    public void clear() {
        for (int i = 0; i < CAPACITY; i++) {
            table[i] = null;
        }
    }
}
