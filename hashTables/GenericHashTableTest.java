public class GenericHashTableTest {
    public static void main(String[] args){
        GenericHashTable gt1 = new GenericHashTable(12);
        gt1.set("apple", 50);
        gt1.set("banana", 100);
        gt1.set("oranges", 150);

        int val = gt1.get("oranges");
        System.out.println(val);
    }
}
