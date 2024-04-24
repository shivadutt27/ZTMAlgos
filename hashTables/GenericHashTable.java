import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class GenericHashTable {
    
    private List<Pair<String,Integer>>[] data;

    public GenericHashTable(int size){
        this.data = (ArrayList<Pair<String,Integer>>[]) new ArrayList[size];
    }

    private int hashFunction(String key){
        int hash = 0;
        for(int i=0; i<key.length(); i++){
            hash=(hash + key.charAt(i) * i)% this.data.length;
        }
        return hash;
    }

    public void set(String key, int value){
        int index = hashFunction(key); 
        if(this.data[index] == null){
            this.data[index] = new ArrayList<Pair<String,Integer>>();
        }
        this.data[index].add(new Pair(key,value));
        System.out.println(Arrays.toString(this.data));
    }

    public int get(String key){
        int index = hashFunction(key);
        int val = 0;

        if(this.data[index].size() == 1){
            val = this.data[index].getFirst().getValue();
        }else{
            for(Pair pair: this.data[index]){
                System.out.println("Loop begins");
                val = (int) pair.getValue();
            }
        }
        return val;
    }
}

class Pair<K,V>{
    private K key;
    private V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){return this.key;}
    public V getValue(){return this.value;}
}
