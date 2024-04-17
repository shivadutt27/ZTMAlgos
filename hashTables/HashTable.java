//Input --> key:grapes, value:1000 , key:Oranges, value:200
//Output --> [["grapes",1000],["Oranges",200]]
/*
    Initialize Array which contains buckets(Arrays of keys and value)
    Array contains key and value pair  -? 1. Create an object [] or create and class array where class contains the 

    same key has many values , that means if the hash function is giving the same output put the key value pair in that address
    [["grapes: 1000"],["Oranges", 200]] 


*/
import java.util.Arrays;
public class HashTable{

    public HashTable[] data;

    public HashTable(int size){
        this.data = new HashTable[size];
    }

    public void set(String key, int value){
        // I have to find the index to store the array of key and value
        // Get the index from hashfunction
        //After getting the index store the key,value pair into the HashTable.
        int index = hashFunction(key); // this will give me  the index
        Object[] keyValueArray = new Object[2];
        keyValueArray.add(key);
        keyValueArray.add(value);
        this.data[index] = keyValueArray; 

    }
/*
    public Object[] get(String key){
        //with the given key, find the index from hash function
        int getIndex = hashfunction(key);
        Object[] keyValueArray = null;
        for(HashTable keyValuePair: this.data){
            System.out.println(Arrays.toString(keyValuePair));
            keyValueArray = keyValuePair;
        }
        return keyValueArray;
    }
*/
    private int hashFunction(String key){
        int hash = 0;
        for(int i=0; i<key.length(); i++){
            hash=(hash + key.charAt(i) * i)% this.data.length;
            System.out.println(hash);
        }
        return hash;
    }

}

//============================================  Read this code ========================================================================================//
/* 
    import java.util.ArrayList;
import java.util.List;

public class HashTable {
    private List<List<Pair<String, Integer>>> data;

    public HashTable(int size) {
        this.data = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.data.add(null);
        }
    }

    private int _hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + (int) key.charAt(i) * i) % this.data.size();
        }
        return hash;
    }

    public void set(String key, int value) {
        int address = this._hash(key);
        if (this.data.get(address) == null) {
            this.data.set(address, new ArrayList<>());
        }
        this.data.get(address).add(new Pair<>(key, value));
    }

    public Integer get(String key) {
        int address = this._hash(key);
        List<Pair<String, Integer>> currentBucket = this.data.get(address);
        if (currentBucket != null) {
            for (Pair<String, Integer> pair : currentBucket) {
                if (pair.getKey().equals(key)) {
                    return pair.getValue();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);
        hashTable.set("apple", 10);
        hashTable.set("banana", 20);
        System.out.println(hashTable.get("apple"));  // Output: 10
        System.out.println(hashTable.get("banana")); // Output: 20
    }

    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}

*/


/*
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
*/