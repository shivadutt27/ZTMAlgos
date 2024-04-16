//Input --> key:grapes, value:1000 , key:Oranges, value:200
//Output --> [["grapes",1000],["Oranges",200]]
/*
    Initialize Array which contains buckets(Arrays of keys and value)
    Array contains key and value pair  -? 1. Create an object [] or create and class array where class contains the 
*/


import java.util.LinkedList;

public class HashTable {
    private LinkedList<Entry>[] data;

    public HashTable(int size) {
        data = new LinkedList[size];
    }

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % data.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        int index = hash(key);
        if (data[index] == null) {
            data[index] = new LinkedList<>();
        }
        for (Entry entry : data[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        data[index].add(new Entry(key, value));
    }

    public Integer get(String key) {
        int index = hash(key);
        if (data[index] == null) {
            return null; // Key not found
        }
        for (Entry entry : data[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null; // Key not found
    }

    private static class Entry {
        String key;
        int value;

        public Entry(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        HashTable myHashTable = new HashTable(50);
        myHashTable.set("grapes", 10000);
        System.out.println(myHashTable.get("grapes")); // Output: 10000
        myHashTable.set("apples", 9);
        System.out.println(myHashTable.get("apples")); // Output: 9
    }
}
