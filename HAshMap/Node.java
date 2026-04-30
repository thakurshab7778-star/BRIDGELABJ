class MyHashMap<K, V> {

    class Node {
        K key;
        V value;
        Node next;

        Node(K k, V v) {
            key = k;
            value = v;
        }
    }

    int capacity = 16;
    Node[] buckets = new Node[capacity];

    int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    void put(K key, V value) {
        int idx = hash(key);
        Node curr = buckets[idx];

        while (curr != null) {
            if (curr.key.equals(key)) {
                curr.value = value;
                return;
            }
            curr = curr.next;
        }

        Node n = new Node(key, value);
        n.next = buckets[idx];
        buckets[idx] = n;
    }

    V get(K key) {
        int idx = hash(key);
        Node curr = buckets[idx];

        while (curr != null) {
            if (curr.key.equals(key))
                return curr.value;
            curr = curr.next;
        }
        return null;
    }

    void remove(K key) {
        int idx = hash(key);
        Node curr = buckets[idx], prev = null;

        while (curr != null) {
            if (curr.key.equals(key)) {
                if (prev == null)
                    buckets[idx] = curr.next;
                else
                    prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        MyHashMap<Integer, String> m = new MyHashMap<>();

        m.put(1, "A");
        m.put(2, "B");
        m.put(17, "C");

        System.out.println(m.get(1));
        System.out.println(m.get(17));

        m.remove(2);

        System.out.println(m.get(2));
    }
}