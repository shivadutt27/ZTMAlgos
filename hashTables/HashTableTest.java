public class HashTableTest {
    public static void main(String[] args){
        HashTable table1 = new HashTable(10);
        //table1.set("grapes", 1000);
        //table1.set("oranges", 200);

        int val = table1.get("Oranges");
        System.out.println(val);
    }
    
}
